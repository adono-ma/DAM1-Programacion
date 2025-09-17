/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapa_Guantes_CW;

import java.util.ArrayList;
import java.util.HashMap;

/**
Pair of gloves
Winter is coming, you must prepare your ski holidays. The objective of this kata is to determine the number of pair of gloves you can constitute from the gloves you have in your drawer.

Given an array describing the color of each glove, return the number of pairs you can constitute, assuming that only gloves of the same color can form pairs.

Examples:
input = ["red", "green", "red", "blue", "blue"]
result = 2 (1 red pair + 1 blue pair)

input = ["red", "red", "red", "red", "red", "red"]
result = 3 (3 red pairs)
 */
public class Guantes_CW {
    public static int numberOfPairs(String[] gloves) {
        ArrayList<String> guantes = new ArrayList<>();

        for (String glove : gloves) {//meter en guantes el array
            guantes.add(glove);
        }
        int pareja_guantes = 0;

        while (!guantes.isEmpty()) {//si no esta vacio
            String color = guantes.get(0);//coge el color
            int c_guantes = 0;//contador de guantes de ese color

            for (String glove : guantes) {
                if (glove.equals(color)) {//si hay mas guantes de ese color
                    c_guantes++;//suma al contador
                }
            }

            pareja_guantes += c_guantes / 2;//cuantas parejas hay

            for (int i = guantes.size() - 1; i >= 0; i--) {//eliminar todos los guantes de ese color
                if (guantes.get(i).equals(color)) {//si encuentra el color
                    guantes.remove(i);//lo elimina
                }
            }
        }
        return pareja_guantes;
    }
    
    //Forma HashMaps clase:
    public static int numberOfPairs_3(String[] gloves) {
        HashMap <String, Integer> guantes = new HashMap<>();
        int contador = 0;
        for (String colores : gloves) {//meter en guantes el array
            if (!guantes.containsKey(gloves)) {
                guantes.put(colores, 1);
            }
        }
        return 0;
    }
    
    
    //Forma de CW:
    public static int numberOfPairs_2(String[] gloves) {
        HashMap <String, Integer > saveColors = new HashMap<>();
        int count = 0;
        for (String colors : gloves) {
            if(!saveColors.containsKey(colors)) saveColors.put(colors,1);
            else{
                saveColors.replace(colors,saveColors.get(colors), saveColors.get(colors) +1);
                if(saveColors.get(colors) > 1){
                    saveColors.replace(colors,saveColors.get(colors),0);
                    count++;
                }
            }
        }
        return count;
    }
    
    //Forma Pablo:
    public static int contarParesDeGuantes(String[] guantes) {
        HashMap<String, Integer> contadorDeColores = new HashMap<>();

        for (String guante : guantes) {
            // Si el color ya está en el mapa, incrementar el contador, de lo contrario agregarlo con un valor de 1
            if (contadorDeColores.containsKey(guante)) {
                contadorDeColores.put(guante, contadorDeColores.get(guante) + 1);
            } else {
                contadorDeColores.put(guante, 1);
            }
        }

        int pares = 0;

        for (int conteo : contadorDeColores.values()) {
            pares += conteo / 2;  // Cada par se forma con dos guantes
        }

        return pares;
    }

    public static void main(String[] args) {
        System.out.println(numberOfPairs(new String[]{"red", "green", "red", "blue", "blue"})); //2
        System.out.println(numberOfPairs(new String[]{"red", "red", "red", "red", "red", "red"})); //3
    }
}
