/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrices;

/**
 *
 * @author ixche
 */
public class Matriz_inversa_31_10_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        imprArr(a);
        System.out.println("=======================");
        int ainv[] = invertir(a);
        int ainv2[] = invertir2(a);
        int ainv3[] = invertir3(a);
        int ainv4[] = invertir4(a);
        imprArr(ainv);
        imprArr(ainv2);
        imprArr(ainv3);
        imprArr(ainv4);
    }

    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " | ");
        }
        System.out.println("");
    }

    static int[] invertir(int[] e) {//lee el array normal y lo copia a la inversa
        int sol[] = new int[e.length];
        for (int i = 0; i < e.length; i++) {
            sol[i] = e[e.length - 1 - i];
        }
        return sol;
    }

    static int[] invertir2(int[] e) {//hecho en clase. lee el array inverso y lo copia normal (->)
        int sol[] = new int[e.length];
        int ind_aux = 0;
        for (int i = e.length - 1; i >= 0; i--) {
            sol[ind_aux] = e[i];
            ind_aux++;
        }
        return sol;
    }
    
    static int[] invertir3(int[] e) {// lee el array inverso y lo copia normal con el auxiliar (->)
        int sol[] = new int[e.length];
        int ind_aux = sol[e.length -1];
        for (int i = e.length - 1; i >= 0; i--) {
            sol[ind_aux] = e[i];
            ind_aux++;
        }
        return sol;
    }
    
    static int[] invertir4(int[] e) {//resta con auxiliar
        int sol[] = new int[e.length];
        int ind_aux = sol.length -1;
        for (int i = 0; i < e.length; i++) {
            sol[ind_aux] = e[i];
            ind_aux--;
        }
        return sol;
    }
}