/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ixche
 */
public interface JDBCTest_ej_interfaz_Connection {
    static Connection conectar() {
        String cadena_conexion = "jdbc:mysql://localhost:3306/";
        String nombre_BBDD = "JDBCTest";
        String usuario = "BBDDAdmin";
        String contrasenya = "!!2allaoT4";

        try {
            return DriverManager.getConnection(cadena_conexion + nombre_BBDD, usuario, contrasenya);
        } catch (SQLException ex) {
            System.out.println("Error al conectar con la base de datos");
            ex.printStackTrace();
            return null;
        }
    }
}

