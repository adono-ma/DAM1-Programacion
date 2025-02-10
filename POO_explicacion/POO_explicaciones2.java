/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_explicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class POO_explicaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Excepciones, herencia, polimorfismo e interfaces
        /*
        EXCEPCIONES
        Errores de tiempos de ejecución
        Error de sintaxis (error de compilación)
        
        GESTIÓN DE EXCEPCIONES
        Es un parche que corrija el error y que no se pare el programa
        (Ej: en una transacción económica, que no se quede a la mitad)
        
        - Throw:
        es como gestionar un error con if/else (genera códigos de error de forma automática)
        es un return especial que se unsa 
        
        - TRY (siempre hay uno) - CATCH (puede haber varios) - Finally (puede estar o no):
        
        try{
        
        } catch (Exception){
        
        }
        finally(se hace, haya o no excepción, siempre)
        
        
        
        
        */
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Inicio del programa");
        try{
            System.out.println("Introduzca el promer numero");
            int a = sc.nextInt();
            System.out.println("Introduzca segundo numero");
            int b = sc.nextInt();
            
//            if (b == 0) {
//                System.out.println("No se puede dividir entre 0");
//            } else{
            double div = (double) a / (double) b;
            
            System.out.println(div);
//            }
            
        } catch (InputMismatchException e){
            System.out.println("Error de entrada");
            System.out.println(e.toString());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
        }
        
        catch (ArithmeticException a) {
            System.out.println("Error aritmético");
            System.out.println(a.toString());
            System.out.println(a.getLocalizedMessage());
            System.out.println(a.getMessage());
            a.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("Error en mi programa");
            System.out.println(ex.toString());
            System.out.println(ex.getLocalizedMessage());
            System.out.println(ex.getMessage());
        }
        
        finally {
            System.out.println("Código del FINALLY");
        }
        System.out.println("Final de programa");
    }
    
}
