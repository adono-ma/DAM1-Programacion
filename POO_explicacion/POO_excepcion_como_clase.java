/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_explicacion;

import java.util.InputMismatchException;

/**
 *
 * @author ixche
 */
public class POO_excepcion_como_clase {
    public static void main(String[] args) {
        System.out.println("Llamando al metodo");
        System.out.println(divisionEntera(10,0));
        System.out.println("fin de main");
        
        
    }
    public static int divisionEntera (int a, int b) {
        System.out.println("Inicio de programa");
        int div  = 0;
        try{
            div = a / b;
            
            System.out.println("resultado: " + div);
            return div;
            
        } catch (InputMismatchException ie){
            System.out.println("Error de entrada");
            System.out.println(ie.toString());
            System.out.println(ie.getLocalizedMessage());
            System.out.println(ie.getMessage());
        }
        
        catch (ArithmeticException ar) {
            System.out.println("Error aritmetico");
            System.out.println(ar.toString());
            System.out.println(ar.getLocalizedMessage());
            System.out.println(ar.getMessage());
            ar.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("Error en mi programa");
        }
        
//        finally {
//            System.out.println("Codigo del FINALLY");
//        }
        System.out.println("Final de programa");
        ArithmeticException e = new ArithmeticException();
        throw e;
        // esto es como poner throw new ArithmeticException();
        //return -1;
    }
}
