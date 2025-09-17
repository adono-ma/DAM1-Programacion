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

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hacer una calculadora que haga un menu que ponga:
        //1. sumar
        //2. restar
        //3. multiplicar
        //4. dividir
        //5. salir
        System.out.println("Calculadora");

        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int Resultado;
        int opciones;
        //boolean calc = true;
        while (true) {//el while true no se usa para estos casos, sino pra casos más complicados. Además, al hacer break, nos saca del switch, pero no del while

            System.out.println("Introduzca el numero de su operacion:");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");

            opciones = sc.nextInt();

            switch (opciones) {//es importante no poner comillas si es un int, ana
                case 1 -> {//también se puede poner case 1:, pero me daba un aviso de formato que es muy plasta
                    System.out.println("Introduzca un numero entero:");
                    A = sc.nextInt();
                    System.out.println("Introduzca otro numero entero:");
                    B = sc.nextInt();
                    Resultado = A + B;
                    System.out.println("Resultado: " + Resultado);
                }
                case 2 -> {
                    System.out.println("Introduzca un numero entero:");
                    A = sc.nextInt();
                    System.out.println("Introduzca otro numero entero:");
                    B = sc.nextInt();
                    Resultado = A - B;
                    System.out.println("Resultado: " + Resultado);
                }
                case 3 -> {//es importante no poner comillas si es un int, ana
                    System.out.println("Introduzca un numero entero:");
                    A = sc.nextInt();
                    System.out.println("Introduzca otro numero entero:");
                    B = sc.nextInt();
                    Resultado = A * B;
                    System.out.println("Resultado: " + Resultado);
                }
                case 4 -> {
                    System.out.println("Introduzca un numero entero:");
                    A = sc.nextInt();
                    System.out.println("Introduzca otro numero entero:");
                    B = sc.nextInt();
                    if (B != 0) {//para que no pete, se le pone un if y que no deje dividir por 0
                        Resultado = A / B;
                        System.out.println("Resultado: " + Resultado);
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    break;//si le damos al 5, se sale del bucle (return)
                }
                default -> {
                    //para cuando le metemos cosas raras :)
                    System.out.println("Numero no valido");
                    break;
                }
            }

            if (opciones == 5) {//se pone este if para que rompa el while al poner 5
                break;
            }
        }
    }
}
