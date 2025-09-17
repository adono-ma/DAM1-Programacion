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

public class comparar_clase {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Escribe los tres numeros");

        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

 /*       if (a == b) {
            if (b == c) {
                System.out.println(a + " " + b + " " + c + " " + " = A = B = C");
            }
        } else {*/
            if (a > b) {
                if (b > c) {
                    System.out.println(a + " " + b + " " + c + " " + " = A  B  C");
                } else {//a>b + c<b -> ?,?,b
                    if (a > c) {
                        System.out.println(a + " " + c + " " + b + " " + " = A  C  B");
                    } else {
                        System.out.println(c + " " + a + " " + b + " " + " = C A B");
                    }
                }
            } else {
                if (a > c) {// b>a + a>c
                    System.out.println(b + " " + a + " " + c + " " + " = B A C");
                } else {//c>a + b>a
                    if (c > b) {
                        System.out.println(c + " " + b + " " + a + " " + " = C B A");
                    } else {//b>c + c>a
                        System.out.println(b + " " + c + " " + a + " " + " = B C A");

                    }
                }
            }
        }
    }
//}
