/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class Ordenacion_met_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* el método de la burbuja compara pares.
        hay que decirle si queremos que lo haga de forma ascendente o descendente.
        ej:
        20  300 10  40  50          comprueba 20 y 300
        
        comprueba 300 con 10        20  10  300 40  50
        
        comprueba 300 con 40        20  10  40 300  50
        
        comprueba 300 con 50        20  10  40  50  300
        
        comprueba 20 con 10         10  20  40  50  300
        
        comprueba 20 con 40
        
        comprueba 40 con 50
        
        comprueba 50 con 300
        
         */
        int arr[] = {40, 30, 20, 10};
        
        int vueltas = 0;
        boolean cambio = false;
        while (cambio == false) {
            cambio = true;// al ponerle el boolean, cuando da una vuelta entera en la que no cambia, para
            for (int j = 0; j < arr.length - 1 - vueltas; j++) {
                
                if (arr[j] > arr[j + 1]) {//orden descendente
                    //cambio = false;
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    cambio = false;
//con un solo for {20, 40, 10, 30}, se mueve el 40 a la derecha del todo
                }
            }
            imprArr(arr);
            vueltas++;
        }
        System.out.println("Iteraciones while: " + vueltas);
        System.out.println("");
        
       
        int arr2[] = {40, 30, 20, 10};
        int contador = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {//orden descendente
                    int aux = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = aux;
                    contador++;
//con un solo for {20, 40, 10, 30}, se mueve el 40 a la derecha del todo
                }
            }
            imprArr(arr);
        }
        System.out.println("Iteraciones for: " + contador);
    }

    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println("");
        System.out.println("_____________________");
    }

}
