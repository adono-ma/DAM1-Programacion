/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arr_Strings;

/**
 *
 * @author ixche
 */
public class Ej_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a = 3;

        String s = "hola";
        System.out.println(s);

        String s1 = "adios";
        System.out.println(s1);

        System.out.println(s1.length());

        //System.out.println(s1.charAt(2));//el nº es la posición en la que está la letra de s1
        for (int i = 0; i < s1.length(); i++) {
            //System.out.println(s1.charAt(i));//si le quitamos ln al print, lo hace sin \n
            if (i == s1.length() - 1) {
                System.out.print(s1.charAt(i) + "\n");
            } else {
                System.out.print(s1.charAt(i) + "-");//si le quitamos ln al print, lo hace sin \n
            }
        }
    }
}
