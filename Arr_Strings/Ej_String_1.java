/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arr_Strings;

/**
 *
 * @author ixche
 */
public class Ej_String_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String s1 = "hola";
        String s2 = "adios";
        String s3 = s1 + "-" + s2;


        System.out.println(s3.length());
        
        System.out.println(s3);
        
        System.out.println(s1.contains("a"));// te busca si el caracter está en el string
    }
}
