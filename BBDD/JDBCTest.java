/*
     * Los ficheros se suele utilizar para guardar metainformación, más que documentos en sí.
     * Vamos a realizar una BDRelacional
     */
package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCTest {
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
        String usuario = "root";
        String contrasenya = null;
        
        ArrayList<Coche> a1Coche = new ArrayList();
        a1Coche.add(new Coche (01, "mercedes", (float) 120.12, 'a', true));
        a1Coche.add(new Coche (0, "bmw", 1.12f, 'c', false));

        try {
            con = DriverManager.getConnection(cadena_conexion + nombre_BBDD, usuario, contrasenya);
        } catch (SQLException ex) {
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
