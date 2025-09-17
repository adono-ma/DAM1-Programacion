/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class Ordenacion_met_varios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hacer un array de charts y ordenarlo de forma ascendente/ descendente: mayúscula, número, minúscula
        //metodo ordenar (void) para ordenar los char
        //metodo que le llegue un array y devuelva una matriz de los 3 array distintos
        //método que le llegue la matriz y lo devuelva en uno pero ordenado según se pide

        char[] arr = {'A', 'c', 'a', 'A', 'E', 'f', 'G', 'H', 'R', 'd', '3', '2', '3', 'F', '3', 't', '5', 'G', '5', '5', 'G', 'W', 'Q', 'E'};

        System.out.println("Original: ");
        ImprArr(arr);

        System.out.println("Ordenado: ");
        SepararArr(arr);
        ImprArr(arr);

    }

    public static void ImprArr(char[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + "");
        }
        System.out.println("");
        System.out.println("============================");
    }

    public static void SepararArr(char[] e) {
        int aux_mayus = 0;
        int aux_minus = 0;
        int aux_num = 0;

        //determinar el tamaño del array original y sespararlo según corresponda
        for (int i = 0; i < e.length; i++) {
            //si el carácter es minúscula, el contador de minúscula aumenta.
            if (e[i] >= 'a' && e[i] <= 'z') {
                aux_minus++;
            }
            //si el carácter es mayúscula, el contador de mayúsculas aumenta.
            if (e[i] >= 'A' && e[i] <= 'Z') {
                aux_mayus++;
            }
            //si el carácter es un número, el contador de números aumenta.
            if (e[i] >= '0' && e[i] <= '9') {
                aux_num++;
            }
        }
        //creamos arrays distintos para cada tipo de caracter
        char[] mayus = new char[aux_mayus];
        char[] minus = new char[aux_minus];
        char[] num = new char[aux_num];

        //se reinician los contadores a 0
        aux_minus = 0;
        aux_mayus = 0;
        aux_num = 0;

        //se rellenan las cadenas con los datos del array según corresponda
        for (int i = 0; i < e.length; i++) {
            //si el carácter es minúscula
            if (e[i] >= 'a' && e[i] <= 'z') {
                minus[aux_minus] = e[i];
                aux_minus++;
            }
            //si el carácter es mayúscula
            if (e[i] >= 'A' && e[i] <= 'Z') {
                mayus[aux_mayus] = e[i];
                aux_mayus++;
            }
            //si el carácter es un número
            if (e[i] >= '0' && e[i] <= '9') {
                num[aux_num] = e[i];
                aux_num++;
            }
        }
        // una vez tenemos los arrays separados, ordenamos cada uno
        Ordenar(mayus);
        Ordenar(num);
        Ordenar(minus);

        // Combina las tres categorías en el array original
        int index = 0; // Índice para volver a llenar el arreglo original

        // Coloca las mayúsculas ordenadas en el arreglo original
        for (int i = 0; i < mayus.length; i++) {
            e[index++] = mayus[i]; // Añade cada mayúscula ordenada en el array original
        }

        // Coloca los números ordenados en el arreglo original
        for (int i = 0; i < num.length; i++) {
            e[index++] = num[i]; // Añade cada número ordenado en el array original
        }

        // Coloca las minúsculas ordenadas en el arreglo original
        for (int i = 0; i < minus.length; i++) {
            e[index++] = minus[i]; // Añade cada minúscula ordenada en el array original
        }

//      String cadena = String.valueOf(mayus);
//      cadena = cadena + " " + String.valueOf(num) + " " + String.valueOf(minus);
    }

//    public static char[][] m1(char[] e) {
//        
//        return ;
//    }
    public static void Ordenar(char[] e) {
//        for (int i = 0; i < e.length - 1; i++) {
//            int ind_min = i;
//            for (int j = i + 1; j < e.length; j++) {
//                if (e[j] < e[ind_min]) {//orden ascendente
//                    ind_min = j;//si se encuentra un valor menor, se actualiza a este
//                }
//            }
//            char aux = e[ind_min];//se crea un auxiliar para guardar temporalmente el valor
//            e[ind_min] = e[i];//se coloca el valor mínimo en la posición de i
//            e[i] = aux;//se coloca el valor anterior de i en el auxiliar
//        }

        int vueltas = 0;
        boolean cambio = false;
        while (cambio == false) {
            cambio = true;// al ponerle el boolean, cuando da una vuelta entera en la que no cambia, para
            for (int i = 0; i < e.length - 1 - vueltas; i++) {
                if (e[i] > e[i + 1]) {//orden ascendente
                    char aux = e[i];
                    e[i] = e[i + 1];
                    e[i + 1] =  aux;
                    cambio = false;
//con un solo for {20, 40, 10, 30}, se mueve el 40 a la derecha del todo
                }
            }
        }
    }

}
