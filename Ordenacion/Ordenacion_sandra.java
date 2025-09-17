/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class Ordenacion_sandra {
   public static void main(String[] args) {
        char[] arr = {'A', 'z', '1', 'b', 'Y', '3', '0', 'y', 'B', 'D', '5', 'M'};

        System.out.println("ORIGINAL");
        imprArr(arr);

        System.out.println("MAYUS - NUMEROS - MINUSCULAS:");
        divArr(arr);
        imprArr(arr);
    }

    // organiza los char ( Mayúsculas, Números y Minúsculas)
    static void divArr(char[] arr) {
        // Contadores de cada tipo que hay (mayúsculas, números, minúsculas)
        int index_Mayus = 0;
        int index_Num = 0;
        int index_Minus = 0;

        // contar cuántos mayúsculas, números y minúsculas hay en el arreglo original
        for (int i = 0; i < arr.length; i++) {
            // Si el carácter es una letra mayúscula
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                index_Mayus++; // Aumentamos el contador de mayúsculas
            }

            // Si el carácter es un número
            if (arr[i] >= '0' && arr[i] <= '9') {
                index_Num++; // Aumentamos el contador de números
            }

            // Si el carácter es una letra minúscula
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                index_Minus++; // Aumentamos el contador de minúsculas
            }
        }

        // Creamos los arrays con el tamaño adecuado para cada tipo de carácter
        char[] mayus = new char[index_Mayus];
        char[] num = new char[index_Num];
        char[] minus = new char[index_Minus];

        // Reiniciamos los índices para rellenar los arrays correspondientes
        index_Mayus = 0;
        index_Num = 0;
        index_Minus = 0;

        // Segundo bucle: Llenamos los arrays con los caracteres correspondientes
        for (int i = 0; i < arr.length; i++) {
            // Si el carácter es una mayúscula
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                mayus[index_Mayus++] = arr[i]; // Guardamos la mayúscula en el array de mayúsculas
            }

            // Si el carácter es un número
            if (arr[i] >= '0' && arr[i] <= '9') {
                num[index_Num++] = arr[i]; // Guardamos el número en el array de números
            }

            // Si el carácter es una minúscula
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                minus[index_Minus++] = arr[i]; // Guardamos la minúscula en el array de minúsculas
            }
        }

        // Ahora que tenemos los arrays de mayúsculas, números y minúsculas, los ordenamos
        Ordenar(mayus, mayus.length);
        Ordenar(num, num.length);
        Ordenar(minus, minus.length);

        // Combina las tres categorías en el array original
        int index = 0; // Índice para volver a llenar el arreglo original

        // Coloca las mayúsculas ordenadas en el arreglo original
        for (int i = 0; i < mayus.length; i++) {
            arr[index++] = mayus[i]; // Añade cada mayúscula ordenada en el array original
            /*
            arr[index] = mayus[i];
            index++;
            */
        }

        // Coloca los números ordenados en el arreglo original
        for (int i = 0; i < num.length; i++) {
            arr[index++] = num[i]; // Añade cada número ordenado en el array original
        }

        // Coloca las minúsculas ordenadas en el arreglo original
        for (int i = 0; i < minus.length; i++) {
            arr[index++] = minus[i]; // Añade cada minúscula ordenada en el array original
        }
    }

    // Método de ordenación por selección (para arrays)
    static void Ordenar(char[] arr, int n) {
        // Ordena el array usando el algoritmo de selección (Selecciona el mínimo y lo coloca en su posición)
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Inicializamos el índice del mínimo en la posición actual
            // Bucle interno para encontrar el índice del valor mínimo
            for (int j = i + 1; j < n; j++) {
                // Si encontramos un valor más pequeño que el valor en 'minIndex'
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Actualizamos el índice del valor mínimo
                }
            }
            // Intercambiamos el valor en la posición 'i' con el valor más pequeño encontrado
            char temp = arr[minIndex]; // Guardamos el valor en 'minIndex'
            arr[minIndex] = arr[i]; // Colocamos el valor mínimo en la posición 'i'
            arr[i] = temp; // Colocamos el valor original de 'i' en la posición de 'minIndex'
        }
    }

    static void imprArr(char[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println("");
        System.out.println("_______"); 
    } 
}
