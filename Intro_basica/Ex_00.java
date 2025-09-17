/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intro_basica;

/**
 *
 * @author ixche
 */
public class Ex_00 {

    public static void main(String[] args) {
        int n1 = 3;
        double d1 = 6.66;
        boolean b1 = true;
        boolean b2 = false;
        char c1 = 'a';
        String s1 = "Mi gato se llama guantes";

        System.out.println("Entero = " + n1 + "\n" + "Decimales = " + d1);
        System.out.println("True = " + b1 + "\n" + "False = " + b2);
        System.out.println("Letra = " + c1 + "\n" + "Palabra = " + s1);
        
        int suma1 = n1 + (int)d1;
        double suma2 = (double)n1 + d1;
        
        System.out.println(suma1);
        System.out.println(suma2);
        
        char l1 = 'a';
        char l2 = 'a';
        
        System.out.println(l1-32);
        
        char mayus = (char)(l1-32);
        System.out.println(mayus);
    }
}
