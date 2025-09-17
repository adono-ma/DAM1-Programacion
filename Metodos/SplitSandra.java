/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class SplitSandra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "hola, que tal?";
        String s2 = " ";
        String s3[] = mySplit(s1, s2);
       
        imprArr(s3);
    }
    
    public static String[] mySplit(String s1, String s2) {
        int cont = 0;
        int indice = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                cont++;
            }
        }
        String sol[] = new String[cont + 1];
        for (int i = 0; i < sol.length; i++) {
            sol[i] = "\n";//aquí se pone lo que queramos que haga de separador, ya sea quitar espacios,ponerlos, o poner el caracter que sea.
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(0)) {
                if (sol[indice] == null) {
                    sol[indice] = String.valueOf(s1.charAt(i));
                } else {
                    sol[indice] = sol[indice] + s1.charAt(i);
                }

            } else {
                indice++;
            }

        }
        return sol;

    }
    
    public static void imprArr(String[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]);
        }
    }
    
}
