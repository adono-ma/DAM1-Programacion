/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
//import java.util.Scanner;//hay que introducir la librería del Scanner
public class Bucles_multiplicacion_2 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;//si b empieza valiendo menos que i (ej:b = -3), puede que no entre en el for.
        int multpl = a * b;

        System.out.println(multpl);

        System.out.println("===================================");

        int multv2 = 0;

        for (int i = 1; i <= b; i++) {//se mete la variable en el 1 cuadro, la condición en el 2º cuadro y la operacion en el 3º
            multv2 = multv2 + a;
        }
        System.out.print(multv2 + "\n");
    }
}
