/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen;

/**
 *
 * @author ixche
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado un nº entero positivo, evaluar cifra por cifra y quitar los primos
        dos métodos: esPrimo y m1
        */
        int n = 123456789;
        System.out.println(esPrimo(n));
        System.out.println(m1(n));
    }
    
    public static boolean esPrimo(int n) {
        for (int i = 2; i <= n - 1; i++) {//sabemos que 1 lo es, así que empezamos en 2
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int m1(int n) {
        String s = String.valueOf(n);
        String sol = "";
        for (int i = 0; i < s.length(); i++) {
            int x = Integer.valueOf(String.valueOf(s.charAt(i)));
                    
            if (esPrimo(x) == false) {
                sol = sol + s.charAt(i);
            }
        }
        return Integer.valueOf(sol);
    }
    
}
