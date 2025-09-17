/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
//import java.util.Scanner;//hay que introducir la librería del Scanner
public class Bucles_division {

    public static void main(String[] args) {
        int a = 6;
        int b = 5;

        System.out.println(a + " / " + b + " = ");

        int counter = 0;

        while (a >= b) {
            a = a - b;
            counter++;
        }
        System.out.print(counter + "\n");
        System.out.println("resto = " + a);
    }
}
