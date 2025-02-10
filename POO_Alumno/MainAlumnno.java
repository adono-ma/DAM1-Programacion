/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_Alumno;

import java.util.Random;

/**
 *
 * @author ixche
 */
public class MainAlumnno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Alumno A1 = new Alumno ("Ivan");
//        System.out.println(A1.toString());

        
        Alumno a1 = new Alumno("Ivan", true);
        for (int i = 0; i < a1.getAsignaturas().length; i++) {
            //a1.getAsignaturas()[i].ponerNotaMedia;
        }

//        Asignatura Asig1 = new Asignatura("001", "Matematicas", "100 horas");
//        Asignatura Asig2 = new Asignatura("002", "Lengua", "150 horas");
////        Asignatura Asig3 = new Asignatura("001", "Matematicas", "100 horas");
////        Asignatura Asig4 = new Asignatura("002", "Lengua", "150 horas");
////        Asignatura Asig5 = new Asignatura("001", "Matematicas", "100 horas");
////        Asignatura Asig6 = new Asignatura("002", "Lengua", "150 horas");
//        
//        
//        Alumno Alumno1 = new Alumno("Juan", Asig1, Asig2);
//        Alumno1.getAsignatura1().notaAleatoria(); //Acaba de convretir de objeto Alumno a objeto Asignatura
//        Alumno1.getAsignatura2().notaAleatoria(); //Acaba de convretir de objeto Alumno a objeto Asignatura
//        System.out.println(Alumno1.myToString());
//        System.out.println("Nota Media: " + Alumno1.notaMedia());
//        System.out.println("");
//
//        //CON NOTA ALEATORIA
//
//        Alumno Alumno2 = new Alumno("Akira", Asig1, Asig2);
//
//        Alumno2.getAsignatura1().notaAleatoria(); //Acaba de convertir de objeto Alumno a objeto Asignatura
//        Alumno2.getAsignatura2().notaAleatoria();
//        System.out.println(Alumno2.myToString());
//        System.out.println("Nota Media: " + Alumno2.notaMedia());
//        System.out.println("");
//
//        Alumno Alumno3 = new Alumno("Sara", Asig1, Asig2);
//
//        Alumno3.getAsignatura1().notaAleatoria();
//        Alumno3.getAsignatura2().notaAleatoria(); 
//        System.out.println(Alumno3.myToString());
//        System.out.println("Nota Media: " + Alumno3.notaMedia());
//        System.out.println("");
//        for (int i = 0; i < 100; i++) {
//            Random rand = new Random();
//            int a = rand.nextInt(1,11);
//            
//            if (a == 0) {
//                System.out.println("XXXXXXXX");
//            }
//        }
    }

}
