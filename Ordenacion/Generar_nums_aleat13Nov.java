/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */

import java.util.Scanner;
import java.util.Random;

public class Generar_nums_aleat13Nov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        La librería de Math.random() devuelve un doble [0,1)
        si lo ponemos System.out.println(Math.random() * 10) conseguiremos números entre 0 y 9
        si ponemos System.out.println((int)(Math.random() * 10) + 1) conseguiremos números entre 0 y 10
        
        */
        Random aleatorio = new Random();
        
        for (int i = 0; i <= 1000; i++) {
            System.out.println(aleatorio.nextInt(1, 6));
            if (aleatorio.nextInt(1, 6) == 5) {
                System.out.println("XXXXXXXXXXX");
                
            }
        }
        
        
//        Scanner sc = new Scanner(System.in);
//        
//        for (int i = 0; i <= 1000; i++) {
//            System.out.println(Math.random() * 10);
//            System.out.println((int)(Math.random() * 10) + 1);
//        }
//        
//        for (int i = 0; i < 1000; i++) {
//            int N;
//            int max = 10;
//            int min = 1;
//            N = (int)(Math.random() * (max - min + 1) + min);
//            System.out.println(N);
//        }
//
//    }
//    
//    public class void Random()
    
//    public static void ImprArr(int[] e) {
//        for (int i = 0; i < e.length; i++) {
//            System.out.print(e[i] + "");
//        }
//        System.out.println("");
//        System.out.println("============================");
    }
}
