/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class Ordenacion_num_2 {


    public static void main(String[] args) {
        //        int arr[] = {20, 10, 50, 40, 30, -2};//REDUCIR NUMERO DE VUELTAS (Con while o con break)
        int arr[] = {4, 3, 2, 1};
        System.out.println(taOrd(arr, true));
        System.out.println("ORIGINAL");
        imprArr(arr);
        boolean ordenado;
//        int resul[] = m(arr);
//        int m = resul[0];
//        int aux = arr[0];
//
//        arr[0] = m;
//        arr[0] = resul[0];
//        arr[resul[1]] = aux;
//        imprArr(arr);
//        
//        System.out.println("CON METODOS, MENOR");
//        for (int i = 0; i < arr.length; i++) {
//            int resul[] = m(arr, i);
//            int aux = arr[i];
//            arr[i] = resul[0];
//            arr[resul[1]] = aux;
//            imprArr(arr);
//        }
        System.out.println("SIN METODOS, ASCENDENTE");
        for (int i = 0; i < arr.length - 1; i++) {//si quitas el -1 se duplica el ultimo
            int menor = arr[i];
            int menor_pos = i;
            ordenado = taOrd(arr, false);
            if (ordenado == true) {
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
        System.out.println("SIN METODOS, DESCENDENTE");

        for (int i = 0; i < arr.length - 1; i++) {
            int mayor = arr[i];
            int mayor_pos = i;
            ordenado = taOrd(arr, true);
            if (ordenado == true) {
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

    /**
     * Mi metodo recorre un array, y comprueba si esta ordenado.
     *
     * @param e es el array que voy a comprobar
     * @param modo es el boolean que te dice si esta ordenando de forma
     * ascendente o descendente
     * @return
     */
    public static boolean taOrd(int[] e, boolean modo) {
        boolean ord = true;
        //Lo queremos ordenar descendente
        if (modo == true) {
            for (int i = 0; i < e.length - 1; i++) {//RECORRO EL ARRAY
                if (e[i] < e[i + 1]) {
                    ord = false;
                    break;
                }
            }
        } else {//ASCENDENTE
            for (int i = 0; i < e.length - 1; i++) {//RECORRO EL ARRAY
                if (e[i] > e[i + 1]) {
                    ord = false;
                    break;
                }
            }
        }

        return ord;
    }

    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println("");
        System.out.println("_______");
        System.out.println("");

    }

    public static int[] m(int e[], int ind_inicio) {
        int sol[] = new int[2];
        int menor = e[ind_inicio];
        int ind = 0;

        for (int i = ind_inicio; i < e.length; i++) {
            if (e[i] < menor) {
                menor = e[i];
                ind = i;
            }
        }

        sol[0] = menor;
        sol[1] = ind;
        return sol;
    }
}
