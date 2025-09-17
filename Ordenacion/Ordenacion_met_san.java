/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class Ordenacion_met_san {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {2, 10, 50, 50, 10, 2};
        System.out.println(comprobarOrden(arr, true));

        System.out.println("ORIGINAL");
        imprArr(arr);
        boolean ordenado;
        // Ordenar de menor a mayor usando el método m()
        menorMayor(arr);
        System.out.println("ORDENADO MENOR A MAYOR");
        imprArr(arr);

        // Ordenar de mayor a menor usando el método m()
        mayorMenor(arr);
        System.out.println("ORDENADO MAYOR A MENOR");
        imprArr(arr);
        ordenado = comprobarOrden(arr, false);

        System.out.println("SIN METODOS, MENOR");
        for (int i = 0; i < arr.length - 1; i++) {//si quitas el -1 se duplica el ultimo
            int menor = arr[i];
            int menor_pos = i;
            if (ordenado == true) {
            } else {
                break;
            }
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < menor) {
                    menor = arr[j];
                    menor_pos = j;
                }

            }
            int aux = arr[i];
            arr[i] = menor;
            arr[menor_pos] = aux;
            imprArr(arr);
        }

        System.out.println("SIN METODOS, MAYOR");
        for (int i = 0; i < arr.length - 1; i++) {
            int mayor = arr[i];
            int mayor_pos = i;
            if (ordenado == false) {
                break;
            }
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > mayor) {
                    mayor = arr[j];
                    mayor_pos = j;
                }
            }
            int aux = arr[i];
            arr[i] = mayor;
            arr[mayor_pos] = aux;
            imprArr(arr);
        }

    }

    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println("");
        System.out.println("_____________________");
    }

    static void menorMayor(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int[] resultado = m(arr, i);  // Encontrar el menor a partir de i
            int menor = resultado[0];
            int menor_aux = resultado[1];

            if (menor_aux != i) {  // Intercambiar solo si es necesario
                int aux = arr[i];
                arr[i] = menor;
                arr[menor_aux] = aux;
            }
            i++;
        }
    }

    static void mayorMenor(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int[] resultado = mMayor(arr, i);  // Encontrar el mayor a partir de i
            int mayor = resultado[0];
            int mayor_aux = resultado[1];

            if (mayor_aux != i) {  // Intercambiar solo si es necesario
                int aux = arr[i];
                arr[i] = mayor;
                arr[mayor_aux] = aux;
            }
            i++;
        }
    }

    // Método para encontrar el menor elemento y su posición desde un índice específico
    public static int[] m(int[] e, int ind_inicio) {
        int menor = e[ind_inicio];
        int ind = ind_inicio;

        for (int i = ind_inicio; i < e.length; i++) {
            if (e[i] < menor) {
                menor = e[i];
                ind = i;
            }
        }

        return new int[]{menor, ind};
    }

    // Método para encontrar el mayor elemento y su posición desde un índice específico
    public static int[] mMayor(int[] e, int ind_inicio) {
        int mayor = e[ind_inicio];
        int ind = ind_inicio;

        for (int i = ind_inicio; i < e.length; i++) {
            if (e[i] > mayor) {
                mayor = e[i];
                ind = i;
            }
        }

        return new int[]{mayor, ind};
    }

    /**
     * Método para verificar si el número del array es menor o igual que el
     * anterior
     *
     * @param e
     * @param prueba booleano, si true, ascendente. si false, descendente
     * @return
     */
    public static boolean comprobarOrden(int[] e, boolean prueba) {
        boolean ordenado = true;
        //para ordenarlo de forma descendente
        if (prueba == true) {
            for (int i = 0; i < e.length - 1; i++) {
                if (e[i] < e[i + i]) {
                    ordenado = false;
                    break;
                }
            }
        } else { //para ordenarlo de forma ascendente
            for (int i = 0; i < e.length - 1; i++) {
                if (e[i] > e[i + i]) {
                    ordenado = true;
                    break;
                }
            }
        }

        return ordenado;
    }
}
