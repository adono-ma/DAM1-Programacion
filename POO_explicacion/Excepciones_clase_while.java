/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_explicacion;

import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class Excepciones_clase_while {
    public static void main(String[] args) {
        int a = peticionControadaEntero();
        int b = peticionControadaEntero();
        
        int div = a / b;
        
        System.out.println(div);
    }
    
    public static int peticionControadaEntero () {
        Scanner sc = new Scanner (System.in);
        int dato = Integer.MAX_VALUE;
        boolean error;
        
        do {
            error = false;
            try {
               String entrada = sc.nextLine();
               dato = Integer.valueOf(entrada);
            } catch (NumberFormatException ex) {
                error = true;
                System.out.println("Error en la entrada, debe introducir un numero entero.");
                System.out.println("Repita la entrada por teclado");
            }
        } while (error == true);
                
        return dato;
    }
    
}
