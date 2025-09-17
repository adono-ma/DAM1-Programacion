/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package For_anidados;

/**
 *
 * @author ixche
 */
//import java.util.Scanner;
public class Array_invertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[];
        a = new int[3];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        int b [];
        b = new int [a.length];

        System.out.println("array original: ");
        for (int i = 0; i < a.length; i++) {//imprimimos el original para que salga por pantalla
           System.out.print(a[i] + " "); 
        }
        
        for (int i = 0; i < a.length; i++) {//b recorre a al revés, al restarle i
            b[i] = a[a.length-1-i];
        }
        
        System.out.println("\narray invertido: ");
        for (int i = 0; i < a.length; i++) {//imprimimos b para ver si se ha hecho bien
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
    }
}
