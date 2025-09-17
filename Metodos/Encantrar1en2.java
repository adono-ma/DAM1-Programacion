/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class Encantrar1en2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40, 50, 20};//si es un nº repetido tras otro que no lo es, no lo reconoce
        int arr2[] = {8, 11, 20, 40, 40, 40};
        int repetidos[] = repeticiones(arr1, arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (!duplicados(arr1, i)) {//solo muestra los que no están duplicados
                System.out.println("el num. " + arr1[i] + " se repite " + repetidos[i] + " veces.");
            }
        }
    }

    public static int[] repeticiones(int a1[], int a2[]) {
        int conteo[] = new int[a1.length];//guardamos nº repeticiones
        for (int i = 0; i < a1.length; i++) {
            int cont = 0;//contador de repeticioes de a1 en a2
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    cont++;
                }
                conteo[i] = cont;
            }
        }
        return conteo;
    }

    public static boolean duplicados(int array[], int index) {
        for (int i = 0; i < index; i++) {
            if (array[i] == array[index]) {
                return true;//si se ha encontrado el nº anteriormente, se devuelve true
            }
        }
        return false;//si no se encontró antes, devuelve false
    }
}
