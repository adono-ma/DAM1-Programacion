/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class Ordenacion_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {40, 30, 10, 20, 20};
        imprArrInt(arr);
        System.out.println("ordenando...");

        for (int i = 0; i < arr.length -1; i++) {
/*se pone length -1 para que se ahorre la última vuelta,
que no es necesaria porque el último número no hay que sustituirlo.
hacer un método que salte los casos en los que no haga falta ordenar
(ej: cuando ya está ordenado o cuando son números iguales).
*/
            int menor = arr[i];
            int menor_pos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < menor) {
                    menor = arr[j];
                    menor_pos = j;

                }
            }
//        int sol[] = menorArray(num); 
//        int aux = num[i];
//        num[i] = sol[0];
//        num[sol[1]] = aux;
            int aux = arr[i];
            arr[i] = menor;
            arr[menor_pos] = aux;
            imprArrInt(arr);
        }

        System.out.println("=======================");

//        int m = sol[0];
//        int aux = sol[1];
        //int aux_2 = num[0];
//        num[0] = sol[0];
//        num[sol[1]] = aux;
        imprArrInt(arr);
    }

    static void imprArrInt(int e[]) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " | ");
        }
        System.out.println("");
    }

    static int menor(int[] e, int menor) {//sacar el menor
        int aux = menor;
        for (int i = 0; i < e.length; i++) {
            if (e[aux] > e[i]) {
                aux = i;
            }
        }
        return aux;
    }

    static int[] menorArray(int e[]) {
        int sol[] = new int[2];
        int menor = e[0];
        int aux = 0;

        for (int i = 0; i < e.length; i++) {
            if (e[i] < menor) {
                menor = e[i];
                aux = i;
            }
        }
        sol[0] = menor;
        sol[1] = aux;
        return sol;
    }

    static int encontrarMenor(int[] e, int ini) {
        int menorIndex = ini;  // Inicializamos el índice del menor en la posición de inicio
        for (int i = ini + 1; i < e.length; i++) {  // Buscamos desde la posición siguiente a inicio
            if (e[i] < e[menorIndex]) {  // Si encontramos un número menor, actualizamos menorIndex
                menorIndex = i;
            }
        }
        return menorIndex;  // Retornamos el índice del número menor encontrado
    }
}
