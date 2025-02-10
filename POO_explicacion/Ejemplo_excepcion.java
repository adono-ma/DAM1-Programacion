/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_explicacion;

import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class Ejemplo_excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //casos que no se pueden controlar con if/else
        //INPUT MISSMATCH
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduzca un numero entero");
            int a = sc.nextInt();
            System.out.println("El numero introducido es " + a);
            System.out.println("Introduzca otro numero entero");
            int b = sc.nextInt();
            System.out.println("El numero introducido es " + b);
            int div = a / b;
            System.out.println(a + " / " + b + " = " + div);
            System.out.println("Terminada la division de enteros");
        } catch (Exception ex) {
            System.out.println("Error en la introduccion del numero");
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }

}
