/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class SplitUnoAUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String A = "holla";

        String sol = mySubStr(A,1,3);
        System.out.println(sol);
    }

    public static String mySubStr(String s1, int corteini, int cortefin) {
        String sol = "";
        for (int i = corteini; i <= cortefin; i++) {//se comparan todos los char de A en B
                sol = sol + s1.charAt(i);
        }
        return sol;
    }
}
