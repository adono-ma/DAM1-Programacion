/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class ModifCopia_17_10_24 {

    public static void main(String[] args) {
        int A[] = {10, 20, 30};
        int B[] = m2(A);
        int C[] = {10, 20, 30};

//        System.out.println(arr1);
//        System.out.println(arr2);
//        System.out.println(arr3);
        imprArr(B);
        imprArr(A);
    }

    public static void imprArr(int[] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            System.out.print(entrada[i] + " ");
        }
        System.out.println("");
    }

//    public static int[] m1(int n[]) {//paso por valor:  me modifica el valor del main de a
//        int n = n + s;
//        return n;
//        int a = 5;
    public static int[] m2(int entrada[]) {
        int[] copia = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {//creo una copia para que no me modifique la original del main
            copia[i] = entrada[i];
        }

        for (int i = 0; i < copia.length; i++) {
            copia[i] = copia[i] + 1;//cambia los nºs dentro del array B, dejando A como estaba
        }
        return copia;
    }
}
