/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
import java.util.Scanner;//hay que introducir la librería del Scanner

public class Ex_estructuras_control {

    public static void main(String[] args) {
        /*Scanner, es un objeto que no tenemos de normal, así que hay que importarlo
        se pone el nombre_variable.(la variable que quieras utilizar de la lista que se abre)
         */

        Scanner numero = new Scanner(System.in);
        int edad = numero.nextInt();
        final int MAYORIAEDAD = 18;
        //MAYORIAEDAD = 18;
        //Si ponemos edad = 15 -> edad hardcodeada a mano

        //edad = edad.nextInt();//edad como valor dinámico, entrada por teclado.
        if (edad < 0) {//edad como valor dinámico, entrada por teclado.
            //System.out.println("La edad introducida es "+edad);
            System.out.println("Invalid action");
        } else {
            if (edad >= MAYORIAEDAD) {
                System.out.println("Abierto");
            } else {
                System.out.println("No puedes pasar");
            }
        }
    }

}
