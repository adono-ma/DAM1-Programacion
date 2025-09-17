/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class ModifOriginal_17_10_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] original = new int[5];//Crea un array de 5 cajas sin nada dentro.
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");//imprime lo que hay en n (nada)
        }
        System.out.println();
        inicializar(original);//Inicia el metodo inicializar, que permite modificar el array original.
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
    }

    public static void inicializar(int[] modif) {
        for (int i = 0; i < modif.length; i++) {
            modif[i] = i + 1;
        }
    }
}
