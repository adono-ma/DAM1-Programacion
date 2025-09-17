/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Intro_basica;

/**
 *
 * @author ixche
 */
public class Unidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 8274;

        System.out.println(n1);
        while (n1 >= 10) {
            int x = n1 % 10;
            n1 = n1 / 10;
            System.out.println(n1);
        }

        System.out.println("==============================");

        //Para hacerlo de izquierda a derecha
        int n2 = 8274;

        System.out.println(n2);
        int m = n2 / 1000;
        n2 = n2 % 1000;
        System.out.println(n2);
        int c = n2 / 1000;
        n2 = n2 % 100;
        System.out.println(n2);
        int d = n2 / 1000;
        n2 = n2 % 100;

        System.out.println(n2);

        System.out.println("==============================");
        // para saber cuántas veces hay que hacer la división
        int n3 = 8274;
        int cont = 0;
        System.out.println(n3);

        while (n3 > 10) {
            n3 = n3 / 10;
            cont++;
            System.out.println(n3);
        }
        cont = cont + 1;
        System.out.println("contador: " + cont);

        System.out.println("==============================");
        //para sacar toda la operación:

        int n4 = 8274;
        int d1 = 1;
        int cont1 = 0;

        while (n4 > 0) {
            n4 = n4 / 10;
            cont1++;
        }
        System.out.println("contador1: " + cont1);
        
        n4 = 8274;
        for (int i = 1; i <= cont1 - 1; i++) {
            d1 = d1 * 10;
        }
        int x;
        for (int i = 1; i <= cont1; i++) {
            x = n4 / d1;
            n4 = n4 % d1;
            d1 = d1 / 10;
            System.out.println(x);
        }
    }

}
