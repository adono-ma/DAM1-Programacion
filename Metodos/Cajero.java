/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Denominaciones de billetes de euro
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        // Solicitar la cantidad al usuario
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        int dinero = 224;//scanner.nextInt();

        System.out.println("Division de " + dinero + " euros en billetes:");

        // Dividir la cantidad en billetes con un for tradicional
        for (int i = billetes.length -1; i >= 0; i--) {
            int numBilletes = dinero / billetes[i]; // Calcular cuántos billetes de esta denominación
            if (numBilletes > 0) {
                System.out.println("Billetes de " + billetes[i] + " euros: " + numBilletes);
            }
            dinero %= billetes[i]; // Calcular el resto
        }

        // Si queda alguna cantidad que no se puede dividir (menos de 5€)
        if (dinero > 0) {
            System.out.println("Cantidad restante que no puede representarse en billetes: " + dinero + " euros");
        }
    }
    
}
