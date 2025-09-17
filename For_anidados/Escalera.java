/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package For_anidados;

/**
 *
 * @author ixche
 */
public class Escalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            //System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = N; i >= 1; i--) {
            //System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        //System.out.println("");
        
        for (int i = N; i >= 1; i--) {
            //System.out.print(i);
            for (int j = N; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 1; i <= N; i++) {
            //System.out.print(i);
            for (int j = N; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
