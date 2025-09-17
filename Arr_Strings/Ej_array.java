/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arr_Strings;

/**
 *
 * @author ixche
 */
public class Ej_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arr [];
        
        arr = new int [4];
        
        System.out.println(arr.length-1);
        System.out.println("=============================");
        
        System.out.println(arr[0]);
        System.out.println(arr.length-1);
        
        arr [0] = 10;
        arr [3] = 80;
        
        System.out.println(arr [0]);
        System.out.println(arr [3]);
        
        int arr2 [] = {10,20,30,40,50,60};
        int arr3 [] = new int[4];
        
        arr3 [0] = 10;
        arr3 [1] = 20;
        arr3 [2] = 30;
        arr3 [3] = 40;
        
        System.out.println(arr2 [0]);
        System.out.println(arr2 [1]);
        System.out.println(arr3 [0]);
        
    }
}
