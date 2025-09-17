/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arr_Strings;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class Characters_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character;
        character = sc.nextLine().charAt (0);
        
        if (character >= 'A' && character <= 'Z' || character == 'Ñ') {
            System.out.println("Letra mayuscula");
        }
        if (character >= 'a' && character <= 'z' || character == 'ñ') {
            System.out.println("Letra minuscula");
        }
        else {
            System.out.println("No es una letra");
        }
    } 
}
