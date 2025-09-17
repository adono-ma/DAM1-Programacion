/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package If_bucles;


/**
 *
 * @author ixche
 */
public class Trasponer_Matrices_30_10_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se coge una matriz vacía para traspasar los datos de una a otra en vertical (si la matriz era de 2x3, se hace de m1.length
        int mat[][] = {{1, 2, 3}, {4, 5, 6}, {0, 12, -8}};
        imprMatInt(mat);
        System.out.println("_____________o_____________");
        int mat2[][] = trasponer(mat);
        for (int i = 0; i < mat2.length; i++) {//mat[0] es un array y mat[1] es otro array, que es lo que le tiene que entrar al Mm
            imprArray(Mm(mat2[i]));
            System.out.println("");
//            int[] mayor = Mm(mat2[i]);
//            
//            System.out.println(mayor[0]);//solo el menor
//            System.out.println("");
//            System.out.println(mayor[1]);//solo el mayor
        }
        System.out.println("_____________o_____________");
        
    }
    static void imprMatInt(int[][] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                System.out.print(" | " + entrada[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    static void imprArray(int[] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            System.out.print(" | " + entrada[i] + " | ");
        }
    }
    public static int[] Mm(int[] arr) {
        int M = arr[0];
        int m = arr[0];
        int sol[] = new int[2];
        for (int i = 1; i < arr.length; i++) {
//se empieza desde i=1 para que no ponga un num que no está en el array (en este caso, 0)
            if (arr[i] > M) {
                M = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < m) {
                m = arr[i];
            }
        }
        sol[0] = m;
        sol[1] = M;
        return sol;
        //return new int[]{Mm}
    }
    public static int[][] trasponer(int[][] e) {
        int[][] traspuesta = new int[e[0].length][e.length];

        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                traspuesta[i][j] = e[j][i];
            }
        }

        return traspuesta;
    }
}
