/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class Caja_de_texto_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        cajaTexto(cadena); //llamada al método
    }


    // método que muestra un String rodeado por un borde 
    public static void cajaTexto(String str){
            int n = str.length(); //longitud del String
            for (int i = 1; i <= n + 4; i++){ //borde de arriba
                 System.out.print("#"); 
            }
            System.out.println(" ");
            System.out.println("# " + str + " #"); //cadena con un borde en cada lado              
            for (int i = 1; i <= n + 4; i++){ //borde de abajo
                 System.out.print("#"); 
            }
            System.out.println(" ");
    }
}


