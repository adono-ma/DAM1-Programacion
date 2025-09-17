/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class ClasesEnvolventes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c1 = 'a';
        String s1 = "1.3";
        String s2 = "13";
        int n1 = 76;//le metemos el int y deja de llorar
        double d1 = 13.2;//importante poner un punto y no una coma ni nada que no corresponda al tipo de entrada
        
        //if (c1 == (char) s1) {// esto peta
        //if (c1 == n) {//si quiero que me saque el caracter ascii pongo (char)n
        if (c1 == s1.charAt(0)) {
            System.out.println("OK");  
        } else {
            System.out.println("NOT OK");
        }
        System.out.println(s1);
        
        if (Character.valueOf(c1).equals(s2)) {
        System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }
        
        if (n1 == Integer.valueOf(s2)) {
        System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }
        if (11 == Double.valueOf(s1)) {
        System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }
    }
}
