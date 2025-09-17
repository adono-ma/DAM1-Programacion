/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrices;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class MatricesIrregulares_clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String asignaturas[] = {"FOL", "Prog"};
        String alumnos[] = {"Sandra", "Ana", "Inigo"};

        int notas[][] = {{9,10,8},{7,8,9}};
                
        imprMat(notas);
        
        System.out.println("Medias de alumnos:");
        double[] mediasAlu = mediaAlumnos(notas);
        for (int i = 0; i < mediasAlu.length; i++) {
            System.out.println(alumnos[i] + ": " + mediasAlu[i]);
        }
        System.out.println("Medias de asignatura:");
        double[] mediasAsig = mediaAsignaturas(notas);
        for (int i = 0; i < mediasAsig.length; i++) {
            System.out.println(asignaturas[i] + ": " + mediasAsig[i]);
        }
    }

    static void imprMat(int[][] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                System.out.print(" | " + entrada[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    public static void ImprMatInt2(int[][] notas, String[] alumnos, String[] asignaturas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nombre del alumno: " + alumnos[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(asignaturas[j] + ": ");
                System.out.println(" | " + notas[i][j] + " | ");
            }
        }
    }

    static double[] mediaAlumnos(int[][] notas) {
        double[] medias = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];
            }
            medias[i] = (double) suma / notas[i].length;
        }
        return medias;
    }

    static double[] mediaAsignaturas(int[][] notas) {
        double[] medias = new double[notas.length];

        for (int j = 0; j < notas.length; j++) {
            int suma = 0;
            for (int i = 0; i < notas[j].length; j++) {
                suma = suma + notas[j][i];
            }
            medias[j] = (double) suma / notas[j].length;
        }
        return medias;
    }
}
//        Scanner sc = new Scanner(System.in);
//        int notas[][] = new int[asignaturas.length][alumnos.length];
//
//        for (int i = 0; i < notas.length; i++) {
//            System.out.print("Introducir la nota de " + asignaturas[i]);
//            for (int j = 0; j < notas[i].length; j++) {
//                System.out.print(" Nota de " + alumnos[j] + ": " + "(" + (j + 1) + "/" + alumnos.length + ")");
//                notas[i][j] = sc.nextInt();
//            }
//            System.out.println("_________________________o_________________________");
//        }
        //Notas
//        int suma;
//        for (int i = 0; i < notas.length; i++) {
//            suma = 0;
//            for (int j = 0; j < notas[i].length; j++) {
//                suma = suma + notas[i][j];
//            }
//            int mediasig = suma / notas[i].length;
//            System.out.println("Nota media de " + asignaturas[i] + " es: " + mediasig);
//        }
//
//        System.out.println("_________________________o_________________________");
//
//        //Alumnos
//        for (int j = 0; j < alumnos.length; j++) {
//            suma = 0;
//            for (int i = 0; i < asignaturas.length; i++) {
//                suma = suma + notas[i][j];
//            }
//            int medialum = suma / asignaturas.length;
//            System.out.println("Nota media de " + alumnos[j] + " es: " + medialum);
//        }
        //ImprMatInt2(notas, alumnos, asignaturas);
