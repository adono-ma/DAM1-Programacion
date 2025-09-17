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

public class Modulos_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
                
        for (int i = 1; i <= n; i++) {
            int div = n/i;
            System.out.println(div);
        }
    }
}
