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
public class Notas {

    public static void main(String[] args) {

        /*Scanner nota = new Scanner(System.in);
        System.out.println("Introduzca una nota");
        
        int examen = nota.nextInt();
        
        
        while ( >= 0 && <= 10) {//No se puede usar un bucle si solo se va a acceder a el una sola vez
            System.out.println("Aprobado: " + examen);
        } else {
            System.out.println("Haber estudiao "+examen);*/
        int nota = -11;

        if (nota >= 0 && nota <= 10) {
            if (nota < 5) {
                System.out.println("Suspenso");
            } else {//nota >= 100
                if (nota == 5) {
                    System.out.println("Suficiente");
                }
                if (nota == 6) {
                    System.out.println("Bien");
                }
                if (nota >= 7 && nota <= 8) {
                    System.out.println("Notable");
                }
                if (nota == 9) {
                    System.out.println("Sobresaliente");
                }
                if (nota == 10) {
                    System.out.println("Matricula");
                }
            }
        }else{
            System.out.println("Nota incorrecta");
        }
//        if (nota < 0 || nota > 10) {// no hay que poner el if otra vez, porque al haber acotado el if anterior, el else ya excluye el resto
//            System.out.println("Nota incorrecta");
//        }
    }
}
