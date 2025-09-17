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
public class NotaMediaSandra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String asig[] = {"FOL", "BBDD"};
        String alum[] = {"NACHO", "ANA", "SANDRA"};

        Scanner sc = new Scanner(System.in);

        int notas[][] = new int[asig.length][alum.length];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("DIME LA NOTA DE " + asig[i]);
            for (int j = 0; j < notas[i].length; j++) {
                //System.out.println("Del Alumno " + alum[j]);
                System.out.println("Alumno " + (j + 1) + "/" + alum.length + ": " + alum[j]);
                notas[i][j] = sc.nextInt();
//                notas[i][j] = notas[i][j] / notas.length;
            }
        }
        System.out.println("_________");
        System.out.println("");

        imprMatInt(notas);

        System.out.println("_________");
        System.out.println("");

        //Notas
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];
            }
            int mediasig = suma / notas[i].length;
            System.out.println("Media " + asig[i] + " es: " + mediasig);
        }

        System.out.println("********");

        //Alumnos
        for (int j = 0; j < alum.length; j++) {
            int suma = 0;
            for (int i = 0; i < asig.length; i++) {
                suma = suma + notas[i][j];
            }
            int medialum = suma / asig.length;
            System.out.println("Media " + alum[j] + " es: " + medialum);
        }
    }

    static void imprMatInt(int[][] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                System.out.print(entrada[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}