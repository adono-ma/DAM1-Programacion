/*
     * Los ficheros se suele utilizar para guardar metainformación, más que documentos en sí.
     * Vamos a realizar una BDRelacional
     */
package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class JDBCTest_escritura {

    public static void main(String[] args) {
        /*
        EN LA BBDD:
        
        SGDAdmin - 4Toalla2!!
        BBDDAdmin - !!2allaoT4
         */

//        try {//Para cargar los drivers manualmente
//            Class.forName("con.mysql.cj.jdbc.Driver");
//        } catch (Exception e) {
//            System.out.println("asdasdasdads");
//            e.printStackTrace();
//        }

        Connection con = null;
        String cadena_conexion = "jdbc:mysql://localhost:3306/";//si lo dejo en el puerto, se conecta a la BBDD y no al sistema gestor de BBDD
        String nombre_BBDD = "JDBCTest";
        String usuario = "BBDDAdmin";
        String contrasenya = "!!2allaoT4";
        
        Coche c1 = new Coche ("BMW", (float) 120.12, 'B', true);
        
        

        try {
            con = DriverManager.getConnection(cadena_conexion + nombre_BBDD, usuario, contrasenya);
            String query = "INSERT INTO COCHE (id, marca, km, etiqueta, usado) VALUES (null, ?, ?, ?, ?)";
            
            PreparedStatement pstm = con.prepareStatement(query);
            
            pstm.setString(1, c1.getMarca());
            pstm.setFloat(2, c1.getKm());
            pstm.setString(3, String.valueOf(c1.getEtiqueta()));
            pstm.setBoolean(4, c1.isUsado());
            
            int n = pstm.executeUpdate();
            System.out.println(n + "Registros insertados.");
            
            pstm.close();
            
        } catch (SQLException ex) {
            System.out.println("Error en la ejecucion del SQL.");
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    /*
    Código de Ivan
    

        Connection con = null;
        String cadena_conexion = "jdbc:mysql://127.0.0.1:3306/";
        String nombre_BBDD = "JDBCTest";
        String usuario = "root";
        String contrasenia = null;

        try {
            con = DriverManager.getConnection(cadena_conexion + nombre_BBDD, usuario, contrasenia);
        } catch (SQLException ex) {
            System.out.println("Error en la ejecucion del SQL.");
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    */

}
