/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
//import java.util.Scanner;
public class Sumas_clase_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String arr[] = {"hola", "adios", "barbol", "gris"};

        System.out.println(suma_string(arr) + " ");
        System.out.println(suma_string() + " ");
        System.out.println("Fin de Programa");
    }

    public static String suma_string(String... entradaString) {
        if (entradaString.length == 0) {
            String resultados = "Error";
            return resultados;
        }
        String resultados = entradaString[0];
        
        for (int i = 0; i < entradaString.length; i++) {
            resultados = resultados +  entradaString[i];
        }
        return resultados;
    }

}
