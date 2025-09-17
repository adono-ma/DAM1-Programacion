/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arr_Strings;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class Ej_array_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Introduzca el numero de celdas que quiere introducir: ");
        int arr[] = new int[num.nextInt()];

        System.out.println("Introduzca los numeros que quiere introducir: ");

        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("Introduzca num. " + (i+1));
            arr[i] = num.nextInt();

            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * (-1);
            } else {
                arr[i] = arr[i] * 5;
            }
        }
        System.out.println("Resultados: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }
        //System.out.println(arr3);// te da la localización del espacio de memoria del array
    }
}
