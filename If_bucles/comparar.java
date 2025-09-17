/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
public class comparar {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;

        if (a > b && a > c && b > c) {
            System.out.println(a + " " + b + " " + c + " " + "A > B > C");
        } else {
            if (a > b && a > c && c > b) {
                System.out.println(a + " " + c + " " + b + " " + "A > B < C");
            } else {
                if (a < b && a < c && b > c) {
                    System.out.println(a + " " + c + " " + b + " " + "A < B > C");
                } else {
                    if (a < b && a > c && b > c) {
                        System.out.println(a + " " + c + " " + b + " " + "A < B > C");
                    } else {
                        if (a < b && a < c && b < c) {
                            System.out.println(a + " " + c + " " + b + " " + "A < B < C");
                        } else {
                            if (a > b && a < c && b < c) {
                                System.out.println(a + " " + c + " " + b + " " + "A > B < C");
                            } else {
                                System.out.println(a + " " + c + " " + b + " " + "A = B = C");
                            }

                        }
                    }
                }
            }
        }
    }
}