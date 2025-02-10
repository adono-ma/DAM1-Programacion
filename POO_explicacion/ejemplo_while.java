/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_explicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class ejemplo_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        boolean error = false;

//        try {
//            System.out.println("Introduzca un numero entero");
//            int n = sc.nextInt();
//            System.out.println("El numero introducido es: " + n);
//        } catch (Exception ex) {
//            System.out.println("Error a la hora de introducir un numero");
//            System.out.println(ex.toString());
//            ex.printStackTrace();
//        }
        do {
            error = false;
            try {
                System.out.println("Iniciando Division Entera:");

                System.out.println("Introduzca un numero entero 1/2");
                a = sc.nextInt();
                System.out.println("Introduzca un numero entero 2/2");
                b = sc.nextInt();

                int div = a / b;

                System.out.println(a + "/" + b + " = " + div);

                System.out.println("Terminando Division Entera");
            } catch (InputMismatchException ex) {
                sc.nextLine();
                error = true;
                System.out.println("Error a la hora de introducir un numero entero");
                System.out.println(ex.toString());

            } catch (ArithmeticException ex) {
                sc.nextLine();
                error = true;
                System.out.println("Error al intentar dividir entre cero");
                System.out.println(ex.toString());

            }
        } while (error == true);
    }
}
