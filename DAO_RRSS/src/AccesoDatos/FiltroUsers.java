/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.util.Scanner;
import java.sql.PreparedStatement; 
import java.sql.Connection;
import AccesoDatos.JDBCUsuarioDAO;
import Modelo.MyException;

/*
en data se ponen filtros, en SQL
SELECT * FROM 'usuario'
WHERE tel IS NOT NULL AND pais = 'esp';



 */
//public class FiltroUsers {//dentro de DAO_Usuarios
//    JDBCUsuarioDAO jdbcUsr = new JDBCUsuarioDAO();
//    public static void filtros(String cod_empleado, String oficio, String departamento) {
//        try {
//            String query = "select emp_no,apellido,oficio,salario,dep_no from empleados where 1=1";
//            if (cod_empleado != null && !cod_empleado.equals("")) {
//                query = query + "AND emp_no = ?";
//            }
//            if (oficio != null && !oficio.equals("")) {
//                query = query + "AND oficio LIKE ?";
//            }
//            if (departamento != null && !departamento.equals("")) {
//                query = query + "AND dep_no = ?";
//            }
//
//            PreparedStatement pstm = con.prepareStatement(query);
//
//            //Sets
//            int contadorSets = 0;
//
//            if (cod_empleado != null && !cod_empleado.equals("")) {
//                contadorSets++;
//                pstm.setString(contadorSets, cod_empleado);
//            }
//            if (oficio != null && !oficio.equals("")) {
//                contadorSets++;
//                pstm.setString(contadorSets, "%" + oficio + "%");
//            }
//            if (departamento != null && !departamento.equals("")) {
//                contadorSets++;
//                pstm.setString(contadorSets, Integer.valueOf(departamento));
//            }
//        }catch(MyException ex){
//            ex.printStackTrace();
//        }
//    }
//
//    
//    Scanner sc = new Scanner(System.in);
//    String menu, cod_emp, oficio, departamento;
//    //si el campo de busqueda lo deja en blanco en el usuario, no se filtrará por ese campo.
//    do{
//            System.out.println("Introduza datos");
//            cod_emp = sc.nextLine();
//            
//            /*
//            Meter lo de la conexion
//            */
//            
////el problema lo tengo con el WHERE, no puedo hacerme una query distinta por cada combinacion
////al dejar huecos vacíos, no es escalable
//String query ="select emp_no, apellido, oficio, salario, dept_no FROM empleados WHERE 1 = 1";
//if(cod_emp != null && !cod_emp.equals("")){
//    query = query + " AND emp_no = ?";
//}
//
//if(oficio != null && !oficio.equals("")){
//    query = query + " AND oficio LIKE ?";
//}
//
//if(departamento != null && !departamento.equals("")){
//    query = query + " AND dep_no = ?";
//}
//PreparedStatement pstm = con.preparedStatement(query);
//
////Sets:
//int contadorSets = 0;
//            if (cod_emp != null && !cod_emp.equals("")) {
//                contadorSets++;
//                pstm.setString(contadorSets, cod_emp);
//            }
//            if (oficio != null && !oficio.equals("")) {
//                contadorSets++;
//                pstm.setString(contadorSets, "%"+oficio+"%");
//            }
//            if (departamento != null && !departamento.equals("")) {
//                contadorSets++;
//                pstm.setString(contadorSets, Integer.valueOf(departamento));
//            }
//
//}
//    
    
    /**
     * partiendo del método de sacar subscripciones, hay que sacar, de cada RRSS, el usuario más nuevo y más viejo.
     * A esos usuarios hay que sumaprles 100 a su ID (update).
     * Hay que crear una clase fecha:
     * -constructor fecha es un string
     * Se tiene qie poder instar fechas y luego se hace un compareTo, (puede ser estático o dinàmico).
     * se va a hacer con un hashmap.
     */

