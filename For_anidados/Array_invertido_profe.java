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
public class Array_invertido_profe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[];
        a = new int[3];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        int inv[];
        inv = new int[a.length];

//        for (int i = 0; i <= a.length - 1; i++) {//al empezar por el final, también copia desde el final.
//            inv[i] = a[i];
//            System.out.print(inv[i] + " ");
//        }
//        System.out.println("");
        int ind_inv = 0;

//        for (int i = inv.length - 1; i >= 0; i--) {
//            inv[ind_inv] = inv[i];
//            ind_inv++;
//            System.out.print(inv[i] + " ");
//        }



        for (int i = 0; i < a.length; i++) {
            inv[i] = a[a.length-1-i];
        }
        
        for (int i = 0; i < inv.length; i++) {
            System.out.print(inv[i] + " ");
        }
    }
}
