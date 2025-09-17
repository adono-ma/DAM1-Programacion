/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class SplitsinSplit2_null {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// en el primer examen solo se puede usar charAt y length
        String s1 = "Hasta, luego, maricarmen";
        String s2 = ",";
        String fraseFin[] = mySplit(s1, s2);
        //String s2[] = s1.split(",");
        for (int i = 0; i < fraseFin.length; i++) {
            System.out.print(fraseFin[i] + " | ");
        }
        System.out.println("");
    }

    public static String[] mySplit(String s1, String s2) {
        int cont = 0;// para contar las entradas de s1
        int aux = 0;// para contar las comas

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                cont++;
            }
        }
        String sol[] = new String[cont + 1];// si se empieza en 1 por lo que sea (ej: luego va a ser tamaño del string +1, así que lo sumo ya), se comenta porqué se está haciendo
        for (int i = 0; i < s1.length(); i++) {
            if (s2.charAt(0) == s1.charAt(i)) {
                aux++;
            } else {
                sol[aux] = sol[aux] + s1.charAt(i);
            }
        }
        return sol;
    }
}
