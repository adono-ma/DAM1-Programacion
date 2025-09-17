/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class Modulos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int divisor = 0;
        boolean EntroEnElIf = false;

        for (int i = 2; i < n; i++) {
            //System.out.println(n +" % "+ i + " = "+n%i);  
            if (n % i == 0) {
                EntroEnElIf = true;
                break;
                //divisor++;
            }
        }
        if (EntroEnElIf == false) {
            System.out.println("Primo");
        } else {
            System.out.println("No primo");
        }
    }
}
