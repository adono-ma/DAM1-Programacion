/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class ArrNoRep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int arr1[] = {1, 53, 23, 5, 6, 22, 1, 2, 43, 22};

        int[] resultado = repeticiones(arr1);  // Empezamos método repeticiones.

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " | ");
        }
        System.out.println("");
    }

    public static int[] repeticiones(int[] array) {// Método que elimina los números repetidos del array.
        int[] arr2 = new int[array.length];  // Creamos una nueva caja (arr2) del mismo tamaño pero vacía.
        int cont = 0;  // Este contador nos dice cuántos números únicos hemos encontrado.

        // Empezamos a revisar cada número del array original (array).
        for (int i = 0; i < array.length; i++) {
            boolean encontrado = false;  // Nos dice si el número ya está en arr2.

            // Revisamos si el número ya está en arr2 (la caja donde guardamos los únicos).
            for (int k = 0; k < cont; k++) {
                if (array[i] == arr2[k]) {  // Si encontramos el número repetido en arr2...
                    encontrado = true;  // Decimos que el número ya fue encontrado.
                    break;  // Salimos del bucle porque ya no necesitamos seguir buscando.
                }
            }

            // Si el número NO está repetido (no lo encontramos en arr2), lo agregamos a arr2.
            if (!encontrado) {
                arr2[cont++] = array[i];  // Guardamos el número en arr2 y aumentamos j.
            }
        }

        // Ahora ajustamos el tamaño del array (arr2) para devolver solo los números que sí se guardaron.
        int[] resultado = new int[cont];  // Creamos un nuevo array de tamaño j (solo números únicos).

        // Copiamos los números únicos de arr2 a resultado.
        for (int i = 0; i < cont; i++) {
            resultado[i] = arr2[i];
        }

        // Devolvemos el array con los números sin duplicados.
        return resultado;
    }
}
