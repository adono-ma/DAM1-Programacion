/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import Ordenacion.*;

/**
 *
 * @author ixche
 */

public class Factorial13Nov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        La recursividad :
        - Resoluciones iterativas: ej: método burbuja en el que se comparan los
        números por pares de forma ascendente o descendente y se hace n veces hasta que se resuelve el problema.
        
        -Solución recursiva: implementación de si mismo (un método se llama a si mismo dentro de su propia función) para que no sea infinito,
        la entrada del problema es cada vez más pequeña, necesitando un "caso base", que es el que será el último caso.
        Por ejemplo, el factorial: el factorial de 5 (escrito 5!) es 120
        5!: 5*4, *3, *2, *1 = 120
        int factorialIterativo (int N)
        for (int i = 1; i <= N; i++) {
        */
        int N = 5;
        int n = 4;
        
        
        System.out.println("factorial iterativo 5!: " + factorialIterativo(N));
        
        
        System.out.println("factorial recursivo 5!: " + factorialRecursiva(n));
    }   
    public static int factorialIterativo (int N) {

        int f = 1;
        for (int i = 1; i <= N; i++) {
            f = f * i; 
        }
        return f;
    }
    
    public static int factorialRecursiva (int N) {
        
        if (N == 1) {
            return 1;
        }

        return N * (factorialRecursiva(N - 1));
        
    }
    
    public static void ImprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + "");
        }
        System.out.println("");
        System.out.println("============================");
    }
}
