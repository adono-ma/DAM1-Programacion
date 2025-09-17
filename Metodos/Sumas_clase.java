/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
//import java.util.Scanner;
public class Sumas_clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n1 = 2;
        int n2 = 2;
        int n3 = 2;

        int arr[] = {1, 2, 1, 2, 1, 2, 1};
        int resultados = suma_enteros(n1, n2, n3);

        System.out.println(suma_enteros(n1, n2) + " prueba0");
        System.out.println(resultados + " prueba1");
//        System.out.println(suma_enteros()+ "prueba3");
//        System.out.println(suma_enteros(arr) + "prueba4");
    }

////método sumar
//    public static int suma_enteros(int n1, int n2) {
//        int resultados;
//        resultados = n1 + n2;
//        return resultados;
//    }
//
//    public static int suma_enteros(int n1, int n2, int n3) {
//        //int c; //ya no se puede llamar c, porque le estoy metiendo una variable que se llama así
//        int resultados;
//        resultados = n1 + n2 + n3;
//        return resultados;
//    }

    public static int suma_enteros(int... entradaNumerosEnteros) {
         //para el sistema, los puntos suspensivos te dicen que van a entrar todos nos números que tengan que entrar
        int resultados = entradaNumerosEnteros[0];

        for (int i = 0; i < entradaNumerosEnteros.length; i++) {
            resultados = resultados + entradaNumerosEnteros.length;
        }
        return resultados;
    }
}
