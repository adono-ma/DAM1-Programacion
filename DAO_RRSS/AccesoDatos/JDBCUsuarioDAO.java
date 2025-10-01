package AccesoDatos;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Scanner;

public class JDBCUsuarioDAO implements DAO_InterfazUsuario {

    private Connection con = null;

    public JDBCUsuarioDAO() {
        String cadena_conexion = "jdbc:mysql://localhost:3306/";
        String nombre_BBDD = "redessociales";
        String usuario = "BBDDAdmin";
        String contrasenya = "!!2allaoT4";

        try {
            con = DriverManager.getConnection(cadena_conexion + nombre_BBDD, usuario, contrasenya);
        } catch (SQLException ex) {
            System.out.println("Error al conectar con la base de datos");
            ex.printStackTrace();
        }
    }

    public void cerrarConexion() {
        //se hace aquí el exception para que cierre la conexión al final de todas las operaciones
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error al cerrar la conexion.");
        }
    }

    @Override
    public boolean alta(Usuario us) {
        String query = "INSERT INTO usuario VALUES (null, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement pdstm = con.prepareStatement(query);
            pdstm.setString(1, us.getNombre());
            pdstm.setString(2, us.getApellido1());
            pdstm.setString(3, us.getApellido2());
            pdstm.setString(4, us.getPais());
            pdstm.setInt(5, us.getTel());
            pdstm.setString(6, us.getFechaNac());
            pdstm.setString(7, us.getEmail());
            pdstm.executeUpdate();
            pdstm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error al introducir los datos.");
            return false;
        }
    }

    @Override
    public boolean baja(Usuario us) {
        String query = "DELETE FROM usuario WHERE usrid = ?";

        try {
            PreparedStatement pdstm = con.prepareStatement(query);
            pdstm.setInt(1, us.getUsrId());
            pdstm.executeUpdate();
            pdstm.close();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Usuario buscar(int id) {
        String query = "SELECT * FROM usuario WHERE usrid = ?";
        Usuario usr = null;
        try {
            PreparedStatement pdstm = con.prepareStatement(query);
            pdstm.setInt(1, id);
            ResultSet rs = pdstm.executeQuery();
            rs.next();
            usr = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8));

            return usr;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de busqueda.");
        }
        return usr;
        /*
        select asterisco from usuarios
        el result-set se itera con el while
        .next funciona como los cursores, es un fetch, como solo hay 1 resultado,
        se one resultset.next directamente y a tirar.
        con el usr.get pues ya te saca el id que sea.
         */
    }

    @Override
    public boolean modificar(Usuario us) {
        String query = "UPDATE usuario SET nombre = ?, apellido1 = ?, apellido2 = ?, pais = ?, tel = ?, fechanac = ?, email = ? WHERE usrid = ?";
        try {
            PreparedStatement pdstm = con.prepareStatement(query);
            pdstm.setString(1, us.getNombre());
            pdstm.setString(2, us.getApellido1());
            pdstm.setString(3, us.getApellido2());
            pdstm.setString(4, us.getPais());
            pdstm.setInt(5, us.getTel());
            pdstm.setString(6, us.getFechaNac());
            pdstm.setString(7, us.getEmail());
            pdstm.executeUpdate();
            pdstm.close();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error. No se ha podido modificar el usuario.");
            return false;
        }
    }

    @Override
    public ArrayList<Usuario> listar() {
        ArrayList<Usuario> usrs = new ArrayList<>();
        String query = "SELECT * FROM usuario";
        try {
            PreparedStatement pdstm = con.prepareStatement(query);
            ResultSet rs = pdstm.executeQuery();

            while (rs.next()) {
                Usuario aux = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8));
                usrs.add(aux);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de lista.");
        }
        return usrs;
        /*
        el listar lo mete en un arraylist
         */
    }

    @Override
    public HashMap<String, Integer> gentuzaPaisajil() {
        ArrayList<Usuario> usrs = this.listar();
        HashMap<String, Integer> resultado = new HashMap<>();
        HashMap<String, Integer> resultadofin = new HashMap<>();
        for (Usuario user : usrs) {
            if (!(resultado.containsKey(user.getPais()))) {
                resultado.put(user.getPais(), 1);
            } else {
                resultado.replace(user.getPais(), resultado.get(user.getPais()) + 1);
            }
        }
        for (String cod : resultado.keySet()) {
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            if (resultado.get(cod) <= min) {
                min = resultado.get(cod);
            }
            if (resultado.get(cod) >= max) {
                max = resultado.get(cod);
            }

            if ((resultado.get(cod) == max) || (resultado.get(cod) == min)) {
                resultadofin.put(cod, resultado.get(cod));
            }
        }
        return resultadofin;
    }

    public HashMap<String, Integer> gentuzaPaisajil_SQL() {
        HashMap<String, Integer> resultado = new HashMap<>();
        String sql = """
                     SELECT pais, COUNT(*) AS numero
                     FROM usuario
                     GROUP BY pais
                     HAVING COUNT () = (SELECT MAX(nmax) FROM(
                        SELECT COUNT() AS nmax
                        FROM usuario
                        GROUP BY pais) AS numax)
                     OR COUNT() = (SELECT MIN(nmin) FROM(
                        SELECT COUNT() AS nmin
                        FROM usuario
                        GROUP BY pais) AS numin)
                     ORDER BY numero DESC;                        
                     """;
        try {
            PreparedStatement pdstm = con.prepareStatement(sql);
            ResultSet rs = pdstm.executeQuery();
            while (rs.next()) {
                resultado.put(rs.getString("pais"), rs.getInt("numero"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error al contar usuarios por pais.");
        }
        return resultado;
    }

    
    
    public Usuario[] obtenerUsuarioJovenYMayor_SQL() {
        Usuario[] resultado = new Usuario[2]; // Array para guardar dos usuarios (el más joven y el más mayor)

        // Consulta SQL para encontrar al usuario más joven (fecha más reciente) y al más mayor (fecha más antigua)
        String sql = """
        (SELECT * FROM usuario ORDER BY fechaNac ASC LIMIT 1)-- El más mayor (fecha de nacimiento más antigua)
        UNION
        (SELECT * FROM usuario ORDER BY fechaNac DESC LIMIT 1);-- El más joven (fecha de nacimiento más reciente)
        """;

        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            int i = 0;
            while (rs.next()) {
                // Creamos el usuario con los datos de la consulta
                resultado[i] = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("pais"),
                        rs.getInt("tel"),
                        rs.getString("fechaNac"),
                        rs.getString("email")
                );
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace(); // En caso de error, mostramos el mensaje
        }
        return resultado; // Retornamos el array con los dos usuarios (más mayor y más joven)
    }

    public void eliminarUsuarioJovenYMayor() {
        Usuario[] resultado = obtenerUsuarioJovenYMayor_SQL(); // Llamamos al método que obtiene los usuarios

        if (resultado[0] != null) { // Si el usuario más mayor existe
            baja(resultado[0]); // Lo eliminamos
            System.out.println("Usuario más mayor eliminado: " + resultado[0].getNombre());
        }

        if (resultado[1] != null) { // Si el usuario más joven existe
            baja(resultado[1]); // Lo eliminamos
            System.out.println("Usuario más joven eliminado: " + resultado[1].getNombre());
        }
    }

    @Override
    public ArrayList<Usuario> filtrar() {
        ArrayList<Usuario> resultado = new ArrayList<>();
        String userId,nombre,apellido,pais,tel,fnac,mail;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el ID por el que quiera filtrar");
        userId = sc.nextLine();
        System.out.println("Introduzca el nombre por el que quiera filtrar");
        nombre = sc.nextLine();
        System.out.println("Introduzca el apellido por el que quiera filtrar");
        apellido = sc.nextLine();
        System.out.println("Introduzca el pais por el que quiera filtrar");
        pais = sc.nextLine();
        System.out.println("Introduzca el telefono por el que quiera filtrar");
        tel = sc.nextLine();
        System.out.println("Introduzca la fecha de nacimiento por la que quiera filtrar (formato: dd-mm-aaaa)");
        fnac = sc.nextLine();
        System.out.println("Introduzca el email por el que quiera filtrar");
        mail = sc.nextLine();
        
        String query = "SELECT * FROM usuario WHERE 1 = 1";
        if (userId != null && !userId.equals("")){
            query = query + "AND usrId = ?";
        }
        if (nombre != null && !nombre.equals("")){
            query = query + "AND nombre LIKE ?";
        }
        
        if (apellido != null && !apellido.equals("")){
            query = query + "AND apellido1 LIKE ? OR apellido2 LIKE ?";
        }
        if (pais != null && !pais.equals("")){
            query = query + "AND pais LIKE ?";
        }
        if (tel != null && !tel.equals("")){
            query = query + "AND tel = ?";
        }
        if (fnac != null && !fnac.equals("")){
            query = query + "AND fechaNac LIKE ?";
        }
        if (mail != null && !mail.equals("")){
            query = query + "AND email LIKE ?";
        }
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            
            int cont = 0;
            if (userId != null && !userId.equals("") ) {
                cont++;
                pstm.setString(cont, userId);
            }
            if (nombre != null && !nombre.equals("") ) {
                cont++;
                pstm.setString(cont, nombre);
            }
            if (apellido != null && !apellido.equals("") ) {
                cont++;
                pstm.setString(cont, apellido);
            }
            if (pais != null && !pais.equals("") ) {
                cont++;
                pstm.setString(cont, pais);
            }
            if (tel != null && !tel.equals("") ) {
                cont++;
                pstm.setString(cont, tel);
            }
            if (fnac != null && !fnac.equals("") ) {
                cont++;
                pstm.setString(cont, fnac);
            }
            if (mail != null && !mail.equals("") ) {
                cont++;
                pstm.setString(cont, mail);
            }
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                resultado.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8)));
            }
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al filtrar.");
        }
        return resultado;
    }
}
