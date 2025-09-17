/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class Boolean_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Introduce el anio");

        year = sc.nextInt();

        if (esBisiesto(year)) {
            System.out.println("Es bisiesto.");
        }else {
            System.out.println("No es bisiesto.");
            }
    }

    public static boolean esBisiesto(int i) {
//        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
//            return true;
//        } else {
//            return false;
//        }// el if es redundante, por lo que se pone la condición sin más
        return i % 4 == 0 && i % 100 != 0 || i % 400 == 0;
    }

}
