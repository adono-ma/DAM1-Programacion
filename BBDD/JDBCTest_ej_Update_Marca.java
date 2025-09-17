/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class JDBCTest_ej_Update_Marca {
    public class Update_Marca_Coche {
        public static void main(String[] args) {
            Connection con = JDBCTest_ej_interfaz_Connection.conectar();
            if (con == null) {
                return;
            }

            Scanner sc = new Scanner(System.in);

            // Seleccionar coche
            int cocheId = JDBCTest_ej_ListaCoches.selecCoche(con);
            if (cocheId == -1) {
                System.out.println("No se selecciono ningun coche.");
                return;
            }

            System.out.print("Ingrese la nueva marca: ");
            String nuevaMarca = sc.nextLine();

            try {
                String query = "UPDATE COCHE SET MARCA = ? WHERE ID = ?";
                PreparedStatement pstm = con.prepareStatement(query);
                pstm.setString(1, nuevaMarca);
                pstm.setInt(2, cocheId);

                int filasAfectadas = pstm.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Coche actualizado correctamente.");
                } else {
                    System.out.println("No se encontro el coche.");
                }

                pstm.close();
                con.close();

            } catch (SQLException ex) {
                System.out.println("Error al actualizar el coche.");
                ex.printStackTrace();
            }
        }
    }
}
