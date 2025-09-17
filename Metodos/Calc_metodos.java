/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
import java.util.Scanner;

public class Calc_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hacer una calculadora que haga un menu que ponga:
        //1. sumar
        //2. restar
        //3. multiplicar
        //4. dividir
        //5. salir
        System.out.println("Calculadora");

        Scanner sc = new Scanner(System.in);
//        int A;
//        int B;
//        int Resultado;
        int opciones;

        do {//se hace un do while para que entre en el bucle al menos una vez

            System.out.println("Introduzca el numero de su operacion:");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");

            opciones = sc.nextInt();

            switch (opciones) {//es importante no poner comillas si es un int, ana
                //hay que poner las opciones de los casos en cada caso para que funcione bien.
                case 1 -> {//también se puede poner case 1:, pero me daba un aviso de formato que es muy plasta
                    // cuando le ponemos : te imprime el primer sout del siguiente caso
                    int sumitas[] = pedirNumEnt();
                    int sumas = sumaEnteros(sumitas);
                    System.out.println("Resultado suma: " + sumas);
                }
                case 2 -> {
                    int restillas[] = pedirNumEnt();
                    int restas = resta_enteros(restillas);
                    System.out.println("Resultado resta: " + restas);
                }
                case 3 -> {
                    int multip[] = pedirNumEnt();
                    int multix = multiEnteros(multip);
                    System.out.println("Resultado multiplicacion: " + multix);
                }
                case 4 -> {
                    int divi[] = pedirNumEnt();
                    int divx []= diviEntResto(divi);
                    
                    System.out.println("Cociente: " + divx [0]);
                    System.out.println("Resto: " + divx [1]);
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    break;//si le damos al 5, se sale del bucle (break)
                }
                default -> {
                    //para cuando le metemos cosas raras :)
                    System.out.println("Numero no valido");
                    break;
                }
            }

        } while (opciones != 5);//cuando se llega al caso 5, termina el bucle
    }

    public static int[] pedirNumEnt() {
        System.out.println("Introduzca el numero de digitos a introducir:");
        Scanner sc = new Scanner(System.in);

        int numeros = sc.nextInt();
        int resultados[] = new int[numeros];
        for (int i = 0; i < resultados.length; i++) {
            System.out.println((i + 1) + "/" + numeros + ":");
            resultados[i] = sc.nextInt();
        }
        return resultados;
    }

    public static int sumaEnteros(int[] numeros) {// ... y [] es lo mismo
        //para el sistema, los puntos suspensivos te dicen que van a entrar todos nos números que tengan que entrar
        int resultados = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultados = resultados + numeros[i];
        }
        return resultados;
    }

    public static int resta_enteros(int[] numeros) {// ... y [] es lo mismo
        //para el sistema, los puntos suspensivos te dicen que van a entrar todos nos números que tengan que entrar
        int resultados = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultados = resultados - numeros[i];
        }
        return resultados;
    }

    public static int multiEnteros(int[] numeros) {// ... y [] es lo mismo
        //para el sistema, los puntos suspensivos te dicen que van a entrar todos nos números que tengan que entrar
        int resultados = numeros[0];
        int multi = 0;
        for (int i = 0; i < numeros.length - 1; i++) {//me quedo en la penúltima posición
            for (int j = 0; j < numeros[i + 1]; j++) {//para que en este segundo for podamos llegar a la última posición del array
                if (j == 0) {
                    multi = resultados;
                } else {
                    multi = multi + resultados;//en la primera vuelta necesitas que no se sume por sí mismo, sino con el siguiente número
                }
            }
            resultados = multi;
        }
        return resultados;
    }

    public static int diviEnteros(int[] numeros) {/// ... y [] es lo mismo
        //para el sistema, los puntos suspensivos te dicen que van a entrar todos nos números que tengan que entrar
        int resultados = numeros[0];
        for (int i = 1; i < numeros.length; i++) {//empezamos por el segundo nº del arr, que es el divisor (i = 1)
            int divi = numeros[i];
            
            if (divi == 0) {
                System.out.println("No se puede dividir entre cero");
                return 0;//no quiero que me devuelva nada, así que 0
            }
            
            int divx = resultados;
            int cociente = 0;
            
            while (divx >= divi) {
                divx = divx - divi;
                cociente++;
            }
            resultados = cociente;
        }
        return resultados;
    }        
//        int divx = resultados;          
//            for (int cociente = 0; cociente >= divi; cociente++) {
//                divx = divx - divi;
//                resultados = cociente;
//        }

    public static int [] diviEntResto(int[] numeros) {/// ... y [] es lo mismo
        //para el sistema, los puntos suspensivos te dicen que van a entrar todos nos números que tengan que entrar
        int pedirNum = numeros[0];
        int resultadosDiv [] = new int [2];

        for (int i = 1; i < numeros.length; i++) {//empezamos por el segundo nº del arr, que es el divisor (i = 1)
            int divi = numeros[i];
            
            if (divi == 0) {
                System.out.println("No se puede dividir entre cero");
                return resultadosDiv;//no quiero que me devuelva nada, así que 0
            }
            
            int divx = pedirNum;//dividendo
            int cociente = 0;
            
            while (divx >= divi) {
                divx = divx - divi;
                cociente++;
            }
            pedirNum = cociente;//la primera vez queremos que cociente sea 0, pero luego queremos el número de entrada
            resultadosDiv [0]= cociente;
            resultadosDiv [1]= divx;//resto
        }
//        System.out.println("cociente: " + resultadosDiv [0]);
//        System.out.println("resto: " + resultadosDiv [1]);
        
        return resultadosDiv;
    } 
} 