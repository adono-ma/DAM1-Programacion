/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class comparar_sin_trampas {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Escribe los tres numeros");

        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        //do {
        //while (num = num.nextInt()) {
        /*if (!num.hasNextInt()) {
                    System.out.println("Invalid Action");
                } else {*/
 /*int a = 1;
        int b = 3;
        int c = 2;
         */
        if (a > b) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c + " " + "A > B > C");
            }
        } else {
            if (b > a) {
                if (b > c) {
                    System.out.println(b + " " + c + " " + a + " " + "A < B > C");
                }
            } else {
                if (a < b) {
                    if (c < b) {
                        System.out.println(b + " " + a + " " + c + " " + "A < B > C");
                    }
                } else {
                    if (c > b) {
                        if (b > a) {
                            System.out.println(c + " " + b + " " + a + " " + "A < B < C");
                        }
                    } else {
                        if (a > b) {
                            if (c > a) {
                                System.out.println(c + " " + a + " " + b + " " + "A > B < C"); //No funciona ???
                            }
                        }/* else {
                            System.out.println(a + " " + b + " " + c + " " + "A = B = C");
                        }
                    */}
                }
            }
        }
    }
}
//        }
//  }
//}
