/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package For_anidados;

/**
 *
 * @author ixche
 */
//import java.util.Scanner;
public class Ej_for_anidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vamos a coger un array con números y queremos un array solo para los positivos y otro solo para negativos sin espacios.

        int arr[] = {3, -2, 8, -11, 15, 0};
        int neg[];
        int pos[];

        System.out.println("Array Original:");
        for (int i = 0; i < arr.length; i++) {//un sout para ver el array original
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " / ");
            } else {
                System.out.print(arr[i] + ".");
            }
            
            //System.out.print(arr[i] + " ");
        }
        System.out.println("");

        int contp = 0;// si se selecciona lo que quieres cambiar y le das a refactor -> rename y te cambia todos.
        int contn = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                contn++;
                //System.out.println("Negativo: " + neg[i]);
            } else {
                contp++;
                //System.out.println("Positivo: " + pos[i]);
            }
        }
        pos = new int[contp];
        neg = new int[contn];
        int ind_pos = 0; //como arr y pos/neg son != no pueden usar el mismo index [i], por lo que se crean nuevos por separado 
        int ind_neg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos[ind_pos] = arr[i];
                ind_pos++;
            } else {
                neg[ind_neg] = arr[i];
                ind_neg++;
            }
        }
        System.out.println("Array Positivos:");
        for (int i = 0; i < pos.length; i++) {//Un sout para los números positivos en una sola linea
            // System.out.println("Positivo: ");
            if (i == pos.length - 1) {
                System.out.print(pos[i] + ".");
            } else {
                System.out.print(pos[i] + " - ");
            }

        }
        System.out.println("");//separación para que haga una línea a parte
        System.out.println("Array Negativos:");
        for (int i = 0; i < neg.length; i++) {//Un sout para los números positivos en una sola linea
            // System.out.println("Negativo: ");
            if (i == 0) {
                System.out.println("XXXXXXX");
            }

            System.out.print(neg[i] + " ");
        }

        System.out.println("");
    }
}
