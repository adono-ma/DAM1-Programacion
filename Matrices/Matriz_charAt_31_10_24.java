/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrices;

import static Matrices.Matriz_inversa_31_10_24.imprArr;
import static Matrices.Matriz_inversa_31_10_24.invertir4;

/**
 *
 * @author ixche
 */
public class Matriz_charAt_31_10_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr [] = {1, 2, 3};
        String s = "";
        
        //int arrcop[] = paraCharAt(arr);
        //imprArr(arrcop);
    }
    
    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " | ");
        }
        System.out.println("");
    }
    
//    static int[] paraCharAt (int[] e) {
//        String s = "";
//        int sol[] = new int(e.length);
//        for (int i = 0; i < e.length; i++) {
//            sol[i] = s.charAt(i);
//            sol[i] = Integer.valueOf("" + s.charAt(i));
//        }
////        int sol [] = new int[e.length];
////        for (int i = 0; i < s.length(); i++) {
////            //sol[i] = Integer.valueOf(String.valueOf(s.charAt(i)));
////            sol[i] = Integer.valueOf("" + s.charAt(i));
////        } 
//        return sol;
//    }
}
