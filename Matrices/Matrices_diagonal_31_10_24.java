/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author ixche
 */
public class Matrices_diagonal_31_10_24 {
    public static void main(String[] args) {
        int m1[][] = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};

        imprMat(m1);
        int m2[] = diag(m1);

        System.out.println("_____");
        imprArr(m2);
        int mat2[] = diagInv(m1);
        imprArr(mat2);

    }

    public static int[] diag(int[][] e) {
        int diagonal[] = new int[e.length];

        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = e[i][i];
        }
        return diagonal;
    }

    public static int[] diagInv(int[][] e) {
        int diagonalInverso[] = new int[e.length];
        for (int i = 0; i < e.length; i++) {
                diagonalInverso[i] = e[i][e.length -i -1];
        }
        return diagonalInverso;
    }

    static void imprMat(int[][] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                System.out.print(entrada[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " | ");
        }
        System.out.println("");
    }
}
