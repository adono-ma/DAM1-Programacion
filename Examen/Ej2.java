/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen;

/**
 *
 * @author ixche
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        dado un ejemplo de string tienes que cambiar las e por W y cortar por donde tu le digas.
        */
        String s = "excelente";
        int ini = 1;
        int fin = s.length() -2;
        
        char original = 'e';
        char cambio = 'W';
        
        String s2 = myReplace(s, original, cambio);
        System.out.println(s2);
        
        String s3 = mySubString(s, ini, fin);
        System.out.println(s3);
        
    }
    
    public static String myReplace(String s, char o, char c) {
        String sol = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == o) {
                sol += c;
            } else {
                sol = sol + s.charAt(i);
            }
        }
        return sol;
    }
    
    public static String mySubString(String s, int ini, int fn) {
        String sol = "";
        
        for (int i = ini; i < fn; i++) {
            sol = sol + s.charAt(i);
        }
        return sol;
    }
}
