/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */

public class StringCambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "arbol, casa, pelota, playa, telefono";
        String corte = ",";
        
        System.out.println("Original: " + "\n" + cadena);
        
        System.out.println("========================");
        
        String[] arr = mySplit(cadena, corte);
        System.out.println("ARRAY: ");
        imprArr(arr);
        
        System.out.println("========================");
        
        
        System.out.println("ARRAY INVERTIDO: ");
        invertir(arr);
        imprArr(arr);
    }

    public static String[] mySplit(String cadena, String corte) {
        int cont = 0;
        /*para contar el número de palabras que vamos a separar en nuestra cadena
        si empezamos en 0, más tarde habrá que ponerlo en contador +1, o podemos
        empezar en 1 directamente aquí.*/
        int indice = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == corte.charAt(0)) {
                cont++;//Cuantos caracteres hay antes del corte.
            }
        }
        String sol[] = new String[cont + 1];//Porque si empieza el cont por 0, se come lo que esta antes del primer corte
        for (int i = 0; i < sol.length; i++) {
            sol[i] = "";
        }
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != corte.charAt(0)) {
                if (sol[indice] == null) {
                    sol[indice] = String.valueOf(cadena.charAt(i));
                } else {
                    sol[indice] = sol[indice] + cadena.charAt(i);
                }

            } else {
                indice++;
            }
            if (i + 1 < cadena.length() && cadena.charAt(i + 1) == ' ') {
                i++;
            }
        }
        return sol;
    }
    
    static void invertir(String[] e) {//lee el array normal y lo copia a la inversa
        for (int i = 0; i < e.length; i++) {
            char[] sol = new char[e[i].length()];
            
            for (int j = 0; j < e[i].length(); j++) {
                sol[j] = e[i].charAt(j);
            }
            int izq = 0;
            int dcha = sol.length -1;
            
            while (izq < dcha) {
                char aux =sol[izq];
                sol[izq] = sol[dcha];
                sol[dcha] = aux;
                izq++;
                dcha--;
            }
            String inv = "";
            for (int k = 0; k < sol.length; k++) {
                inv = inv + sol[k];
            }
           e[i] = inv; 
        }
    }

    public static void imprArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
