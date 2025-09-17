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
public class Switch {

    public static void main(String[] args) {

        /*Scanner nota = new Scanner(System.in);
        System.out.println("Introduzca una nota");
        
        int examen = nota.nextInt();*/
/*        char dia = 'X';

        switch (dia) {
            case 'L':
                System.out.println("lunes");
                break;
            case 'M':
                System.out.println("martes");
                break;
            case 'X':
                System.out.println("miercoles");
                break;
            case 'J':
                System.out.println("jueves");
                break;
            case 'V':
                System.out.println("viernes");
                break;
            case 'S':
                System.out.println("sabado");
                break;
            case 'D':
                System.out.println("domingo");
                break;
        }*/
//Dia de la semana 
        char dia = 'D';

        if (dia == 'S') {//Entro si Sabado
            System.out.println("Dia 1: Fiesta");
        } else { //No es sabado
            if (dia == 'D') {//Entro si es Domingo
                System.out.println("Dia 1: Fiesta");
            } else {//No es sábado o No es domingo
                System.out.println("Dia 1: Lectivo");
            }
        }

        char dia2 = 'L';

        if (dia2 == 'S' || dia2 == 'D') {//Entro si Sabado
            System.out.println("Dia 2: Fiesta");
        } else { 
            System.out.println("Dia 2: No fiesta");
        }
    }
}
