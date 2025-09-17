/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class Nuevoarr1en2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = {10, 8, 30, 30, 9};
        int rep[] = new int[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j< arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    rep[i] = rep[i] + 1;
                }
            }
        }
        for (int i = 0; i < rep.length; i++) {
            System.out.println(rep[i]);
        }
    }
    
}
