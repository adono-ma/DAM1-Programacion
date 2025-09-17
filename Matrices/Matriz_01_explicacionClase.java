/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrices;

/**
 *
 * @author ixche
 */
public class Matriz_01_explicacionClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* se pone el tipo de matriz así: int mat[n filas][m columnas]
        int mat[][] = new int[3][2];
         también se pueden escribir: int mat[][] = {{a,b},{c,d},{e,f}};
        la matriz puede ser regular (con el mismo número de columnas por fila) o irregular
        
        arr[0] -> a
        arr[4] -> e
        arr.length -> f
        mat[0][0] -> a
        mat[2][1] -> f
        mat[0].length -> 2
         mat[1].length -> 2
         mat[2].length -> 2
        sout(mat[0]) -> te imprime la dirección de memoria
        
        
        int mat[][] = new int[3][];
        mat[0] = new int[3];
        mat[1] = new int[1];
        mat[2] = new int[2];
        
        si me quiero poner en la segunda caja de la 1ª fila, sería mat[0][1];
        si me quiero poner en la 1ª caja de la 2ª linea: mat[1][0];
        también se puede hacer tridimensionales (o más):
        mat[][][] = new int [3][2][3];
        lo normal es usar bidimensionales, pero para más dimensiones se usa para mapas y bibliotecas.
        */
        //int mat[][];//declarar la matriz
        //mat = new int[2][3];//instanciar la matriz
//        se puede hacer todo a la vez: int mat[][] = new int[2][3];
        
        int mat[][] = {{10, 20, 30}, {40, 50, 60}};
        mat[0][0] = 10;
        mat[1][2] = 60;
        //se recorren con 2 for de fuera hacia dentro:
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
//esto solo funciona cuando la matriz es regular: todos los hijos son del mismo tamaño y da igual poner mat[i].length p mat[0].length
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
//ejercicio: crear una matriz por teclado y que luego te aparezca por pantalla la media de la tabla
