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
public class Ejemplo {
        public static void main(String[] args) {
//        try {
//            System.out.println("Inicio de Main");
//            System.out.println(divisionEntera(10, 0));
//            System.out.println("Fin de Main");
//
//            String s = "hola";
//        } catch (MyException e) {
//            System.out.println("El programa se ha encontrado un error.");
//        }
        System.out.println("Inicio de Main");
        try {
            m2();
        } catch (myException e) {
            System.out.println("Gestion en main de excepcion generada en m1");
            System.out.println(e.toString());
        }
        System.out.println("Fin de Main");
    
    }
    public static int divisionEntera(int a, int b) throws myException {
        System.out.println("Inicio del método");
        //int div = 0;
        try {
            int div = a / b;
            System.out.println("El resul: " + div);
            return div;

        } catch (InputMismatchException exp) {
            System.out.println("Error en la entrada del escaner ");
            System.out.println(exp.toString());
            //System.out.println(exp.getLocalizedMessage());
            // System.out.println(exp.getMessage());

        } catch (ArithmeticException myExcepcionAritmetica) {
            System.out.println("Error Aritmético en mi programa");
            System.out.println(myExcepcionAritmetica.toString());
            // System.out.println(myExcepcionAritmetica.getLocalizedMessage());
            // System.out.println(myExcepcionAritmetica.getMessage());
            //myExcepcionAritmetica.printStackTrace();
            // throw myExcepcionAritmetica;

        } catch (Exception e) {
            System.out.println("Error en mi programa.");
        }

        System.out.println("Fin del metodo");

//        ArithmeticException e = new ArithmeticException();
//        throw e;
        //throw new ArithmeticException("XXXXX");
        throw new myException("XXXXX");
        //return -1;
    }

    public static void m1(boolean b) throws myException {
        if (b == true) {
            System.out.println("Hello World");
        } else {
            throw new myException("Error en m1");
        }
    }

    public static void m2() throws myException {
        System.out.println("Hola soy m2");
        m1(false);
    }
}
