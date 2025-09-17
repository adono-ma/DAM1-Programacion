/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class Mm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // un array de enteros, te tiene que devolver el mayor y el menor
        int num[] = {1, 85, 3, 2};
        int[] colnum = Mm(num);
        
        for (int i = 0; i < colnum.length; i++) {
            System.out.print(colnum[i] + " ");
        //imprArrayInt(Mm(num));
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
}
