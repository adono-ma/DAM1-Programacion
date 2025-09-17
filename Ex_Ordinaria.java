/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ixche
 */
public class Ex_Ordinaria {

    /**
     * 1. Matriz regular no cuadrada mete los impares en las filas y los pares
     * en la columna:
     *
     * 1 2
     * 3 4
     * 5 6
     *
     * 2. Una función que devuelva cuantas veces esta string1 dentro de string2
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }

    public boolean equals(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public String mySubString(String s1, int ini, int fin) {
        String sol = "";
        for (int i = ini; i < fin; i++) {  // Recorre los índices entre ini y fin - 1.
            sol = sol + s1.charAt(i);  // Agrega los caracteres a la subcadena.
        }
        //con split esto tambien se podria hacer
        return sol;
    }

//    public static int contains(String s1, String s2){
//        int cont = 0;
//        int len1 = s1.length();
//        int len2 = s2.length();
//        boolean equals = false;
//        for (int i = 0; i < len2 - len1 +1; i++) {//se le suma 1 para que coja el último caracter
//            aux = mySubString(s2, i, i + (s1-1))
//        }
//        
//        
//        return cont;
//    }

public static void main(String[] args) {
//        int m1[][] = new int [2][3];
        int m1[][] = {{1, 2, 3},{4, 5, 6,},{0,12,-8}};
        imprMat(m1);
        System.out.println("_____");
        int m2[][] = trasponer(m1);
//        imprMat(m2);
        for (int i = 0; i < m2.length; i++) {
            int[] aux = mM(m2[i]);
            System.out.print(aux[1] + "|");
        }
    }

    public static int[][] trasponer(int[][] e) {
        int tras[][] = new int[e[0].length][e.length];

        for (int i = 0; i < tras.length; i++) {
            for (int j = 0; j < tras[i].length; j++) {
                tras[i][j] = e[j][i];
            }

        }
        return tras;
    }

    static void imprMat(int[][] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                System.out.print(entrada[i][j] + " | ");
            }
            System.out.println("");
        }
    }


    public static int[] mM(int[] arr) {
        int m = arr[0];
        int M = arr[0];
        int sol[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > M) {
                M = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < m) {
                m = arr[i];
            }
            
            sol[0] = m;
            sol[1] = M;
//            int sol = {m,M};
        }
        return sol; //return new int sol {m,M};//todo en un mismo array con el mayor y el menor juntos
    }
}

