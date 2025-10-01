package AccesoDatos;

import Modelo.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSuscripcionDAO implements DAO_InterfazSuscripcion{
    
    private Connection con = null;

    public JDBCSuscripcionDAO() {
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

    /*  al suscribir se hace select en el registro, si devuelve 0, INSERT y return true
        si es algo distinto a 0, es que ya estaba suscrito, se manda un sout con un mensaje
        de error con un Este usuario ya estaba suscrito desde (fecha) y se hace el throws de duplicado     
    Para la fecha, crear un objeto llamado LocalDate myObj = LocalDate.now(); el to string: myObj.toString() te da el formato 2025-04-02
    Hardcodear una Red Social + Usuario (O puedes llamar a buscar usuario). Tienen que ser de la tabla, sino, peta.
    */
    
    @Override
    public boolean suscribir(Usuario usr, RedSocial rs) throws MyException {
        LocalDate fActual = LocalDate.now();
        String query = "SELECT * FROM suscripcion WHERE usrId = ? AND nomRS = ?;";
        String queryEntry = "INSERT INTO suscripcion VALUES (?, ?, ?);";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, usr.getUsrId());
            pstm.setString(2, rs.getNombre());
            ResultSet reset = pstm.executeQuery();
            if (reset.next()) {
                throw new MyException("Error. Entrada existente.");
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al seleccionar en RRSS.");
        }
        
        try {
            PreparedStatement pstm = con.prepareStatement(queryEntry);
            pstm.setInt(1, usr.getUsrId());
            pstm.setString(2, rs.getNombre());
            pstm.setString(3, fActual.toString());
            pstm.executeUpdate();
            pstm.close();
            
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al suscribir en RRSS.");
        }
        return false;
    }

    @Override
    public boolean desuscribir(Usuario usr, RedSocial rs) {//duplicado
        String query = "DELETE FROM suscripcion WHERE usrId = ? AND nomRS = ?;";
        
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, usr.getUsrId());
            pstm.setString(2, rs.getNombre());
            pstm.executeUpdate();
            pstm.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar suscripcion.");
        }
        return false;
    }

    @Override
    public boolean desuscribir_todo(Usuario usr) {
        String query = "DELETE FROM suscripcion WHERE usrId = ?;";
        
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, usr.getUsrId());
            pstm.executeUpdate();
            pstm.close();
            
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al desuscribir de todas las RRSS.");
        }
        return false;
    }

    @Override
    public ArrayList<RedSocial> obtener_rsUsr(Usuario usr) {
        ArrayList<RedSocial> rs = new ArrayList<>();
        String query = "SELECT nombre, url FROM redsocial r JOIN suscripcion s ON r.nombre = s.nombreRS WHERE s.usrId = ?;";
        
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, usr.getUsrId());
            ResultSet reset = pstm.executeQuery();
            
            while (reset.next()) {
                rs.add(new RedSocial(reset.getString(1), reset.getString(2)));
            }
            reset.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No se ha podido realizar la accion.");
        }
        return rs;
    }
    //Obtener suscripciones de una única red social
    @Override
    public ArrayList<Usuario> obtener_usrRs (RedSocial rs) {
        ArrayList<Usuario> usr = new ArrayList<>();
        String query = "SELECT FROM usuario u JOIN suscripcion s ON u.usrId = s.usrId WHERE nomRS = ?;";
        
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, rs.getNombre());
            ResultSet reset = pstm.executeQuery();
            while (reset.next()){
                usr.add(new Usuario (reset.getInt(1), reset.getString(2), reset.getString(3), reset.getString(4), reset.getString(5), reset.getInt(6), reset.getString(7), reset.getString(8)));
            }
            
            reset.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No se pudieron recuperar los usuarios de la red social.");
        }
        return usr;
    }
    
    //Obtener suscripciones de todas las redes sociales
    @Override
    public ArrayList<Suscripcion> obtener_suscriptores() {
        ArrayList<Suscripcion> suscriptRS = new ArrayList<>();
        String query = "SELECT * FROM suscripcion;";
        
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            ResultSet reset = pstm.executeQuery();
            while (reset.next()){
                suscriptRS.add(new Suscripcion (reset.getInt(1), reset.getInt(2), reset.getString(3)));
            }
            reset.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No se pudieron obtener todos los suscriptores.");
        }
        return suscriptRS;
    }
        
 /*
    Para obtener un usuario concreto en las redes sociales
    
HashMap<redsocial ArrayList<Usuarios>> mapa

while(resultSet): va a ir haciendo getters
se instancia una nueva red socual
rs new rs(getters rs)
usuario new usr (getters rs)

se monta el mapa de resultSet AL<Usuarios>
if(!mapa contains(redsocial)?){
    mapa.put(redSocial, newAL<Usuario>());
    mapa.get(redSocial).add(usuarioAux);
}else {
}
*/   

public HashMap<RedSocial, ArrayList<Usuario>> obtenerSuscripcionUsr() {
    HashMap<RedSocial, ArrayList<Usuario>> mapaUsrs = new HashMap<>();
    String query = "SELECT * FROM suscripcion s JOIN usuario u ON s.usrId = u.usrId JOIN RedSocial r ON s.nomRS = r.nombre;";
    RedSocial auxRs;
    Usuario usr;
    
    try {
        PreparedStatement pstm = con.prepareStatement(query);
        ResultSet reset = pstm.executeQuery();
        while (reset.next()){
            usr = new Usuario (reset.getInt("usrId"), reset.getString("nombre"), reset.getString("pais"), reset.getString("fechaNac"));
            auxRs = new RedSocial (reset.getString("nomRS"), reset.getString("url"));
            if (!(mapaUsrs.containsKey(auxRs))) {
                mapaUsrs.put(auxRs, new ArrayList<Usuario>());
            }
            mapaUsrs.get(auxRs).add(usr);
        }
        reset.close();
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error: no se pudo crear el mapa de usuarios.");
    }
    return mapaUsrs;
}
    
public ArrayList<Integer> usuarioFecha() {
    HashMap<RedSocial, ArrayList<Usuario>> mapaUsuarioRs = obtenerSuscripcionUsr();
    ArrayList<Integer> idUsu = new ArrayList<>();
    String query = "SELECT usrID FROM suscripcion WHERE fechaIncorp = (SELECT MAX(fechaIncorp) FROM suscripcionfecha WHERE nomRS = ?) AND nomRS = ? LIMIT 1) UNION (SELECT usrId FROM suscripcionfecha WHERE fechaIncorp = (SELECT MIN(fechaIncorpo) FROM suscripcionFecha WHERE nomRS = ? LIMIT 1);";
    
    for (RedSocial rs : mapaUsuarioRs.keySet()) {
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, rs.getNombre());
            pstm.setString(2, rs.getNombre());
            pstm.setString(3, rs.getNombre());
            pstm.setString(4, rs.getNombre());
            ResultSet reset = pstm.executeQuery();
            while (reset.next()) {
                idUsu.add(reset.getInt(1));
            }
            reset.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al encontrar RS del usuario por fecha");
        }
    }
    return idUsu;
}

//public HashMap<String, ArrayList<Integer>> fechaSuscr() {
//    HashMap<String, HashMap <Integer, Fecha>> usuFecha = new HashMap<>();
//    HashMap<String, ArrayList<Integer>> aux = new HashMap<String, ArrayList<Integer>>();
//    ArrayList<Suscripcion> suscripcion = obtener_suscriptores();
//    Fecha auxF, minF, maxF;
//    
//    for (Suscripcion s : suscripcion){
//        if (!usuFecha.containsKey(s.getFecha_sus()))
//    }
//    
//    
//}     
}

