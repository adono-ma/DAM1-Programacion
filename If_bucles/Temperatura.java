/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
//import java.util.Scanner;

public class Temperatura {
    public static void main (String[] args) {
        
        /*Scanner nota = new Scanner(System.in);
        System.out.println("Introduzca una nota");
        
        int examen = nota.nextInt();
        
        
        while ( >= 0 && <= 10) {
            System.out.println("Aprobado: " + examen);
        } else {
            System.out.println("Haber estudiao "+examen);*/
        int t = 0;
        
        if (t >= 100){
            System.out.println("gas");
        } else {//t < 100
            if (t >= 0) {
                System.out.println("solido");
            } else {// t < 0
                System.out.println("liquido");
            }
        }
    }
    
}
