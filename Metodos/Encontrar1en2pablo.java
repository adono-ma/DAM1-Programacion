/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class Encontrar1en2pablo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40,50};
        int arr2[] = {8, 11, 20,40,40,40};
        int rep[] = repeticion(arr1, arr2);
        for (int i = 0; i < rep.length; i++) {
            System.out.println(rep[i]);
        }
    }

    public static int[] repeticion(int a[], int b[]) {
        int sol[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int cont = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    cont++;
                }
            }
            sol[i] = cont;
        }
        return sol;
    }
}
