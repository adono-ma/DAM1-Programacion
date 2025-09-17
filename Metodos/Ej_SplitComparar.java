/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class Ej_SplitComparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hasta, luego, maricarmen";
        String s2 = ",";
        //String s2 = "Hasta, lili, maricarmen";

        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2 + " | ");
        }
        if (myEquals(s1, s2) == true) {
            System.out.println("OK I guess");
        } else {
            System.out.println("That's disappointing");
        }
        
        if (myEquals2(s1, s2) == true) {
            System.out.println("OK");
        } else {
            System.out.println("not OK");
        }
    }

//    public static String[] mySplit(String s1, String c) {
//        int cont = 0;
//// si se empieza en 1 por lo que sea (ej: luego va a ser tamaño del string +1, así que lo sumo ya), se comenta porqué se está haciendo
//        for (int i = 0; i < s1.length(); i++) {
//            //if (s1.charAt(i) == c)//No se puede comparar un string con un char
//        }
//    }
    public static boolean myEquals(String s1, String s2) {
        /*String s1 = "Hola";
        String s2 = "adios";
        
        if (s1.equals(s2) == true)
        como el equals no lo podemos meter, se hace un método que se llame así

         */
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                cont1++;
            } else {
                cont2++;
            }
        }
        if (cont1 == s1.length()) { //el programa sugiere quitar todo esto y dejar return cont1 == s1.length();
            return true;
        } else {
            return false;
        }

    }

    public static boolean myEquals2(String s1, String s2) {
        int cont1 = 0;
        boolean iguales = true;
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                iguales = false;
                break;

            }
            if (cont1 == s1.length()) {
                return true;
            }
        }
        return iguales;
    }
    
}
