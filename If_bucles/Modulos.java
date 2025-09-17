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

public class Modulos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner div = new Scanner (System.in);
        int n = num.nextInt();
        int d = div.nextInt();

        if(n % 2 == 0) {
            System.out.println(n%2);
        } else {
            System.out.println(n%d);
        }
    }
}
