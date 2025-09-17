/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrices;

import static Matrices.Matriz_inversa_31_10_24.invertir3;
import static Matrices.Matriz_inversa_31_10_24.invertir4;

/**
 *
 * @author ixche
 */
public class PartirArr_inverso_31_10_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        imprArr(a);
        System.out.println("=======================");
        int ainv[] = invertir(a);
        int ainv2[][] = invertirCachos(a);
        imprArr(ainv);
        System.out.println("=======================");
        imprMat(ainv2);

    }

    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " | ");
        }
        System.out.println("");
    }

    static void imprMat(int[][] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                System.out.print(entrada[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static int[] invertir(int[] e) {//lee el array normal y lo copia a la inversa
        int sol[] = new int[e.length];
        for (int i = 0; i < e.length; i++) {
            sol[i] = e[e.length - 1 - i];
        }
        return sol;
    }

    static int[][] invertirCachos(int[] e) {//hecho en clase. lee el array inverso y lo copia normal (->)
        int parte1[] = new int[e.length / 2];
        int parte2[] = new int[e.length / 2];

        int invertido[] = invertir(e);
        int ind_aux = 0;
        for (int i = 0; i < invertido.length; i++) {
            if (i <= (invertido.length / 2) -1) {
                parte1[i] = invertido[i];
            } else {
                parte2[ind_aux] = invertido[i];
                ind_aux++;
            }
        }
        int sol[][] = new int[2][];
        
        sol[0] = parte1;
        sol[1] = parte2;
        
        return sol;
    }
}
