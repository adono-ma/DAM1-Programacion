/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ixche
 */
public class Mapas_collection {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();

        hm.put("DAM1", 26); //DAM1 es la llave (Key) y 26 es el valor (value)
        hm.put("DAM2", 13);
        hm.put("ASIR1", 30);
        hm.put("ASIR2", 26);

        System.out.println(hm); //ToString integrado por lo que no saca la flecha sino el contenido

        for (Integer value : hm.values()) {//Te imprime los valores (26,13...) Desordenado.
            System.out.println(value);
        }
        for (String key : hm.keySet()) {//Te imprime las llaves (DAM1,DAM2...) Desordenado.
            System.out.println(key);
        }
        for (String key : hm.keySet()) {//Te imprime las llaves y sus valores.
            System.out.println(key + "--->" + hm.get(key));
        }

        System.out.println("===============");

        for (Map.Entry<String, Integer> entrada : hm.entrySet()) {
            System.out.println(entrada.getKey() + "--->" + entrada.getValue());
        }

        //Hacer un mapa y eliminar todos los que tengan menos de 10
        HashMap<String, Integer> mapi = new HashMap();

        mapi.put("DAM1", 26); //DAM1 es la llave (Key) y 26 es el valor (value)
        mapi.put("DAM2", 13);
        mapi.put("ASIR1", 30);
        mapi.put("ASIR2", 26);

        System.out.println("original: " + mapi);
        quitar(mapi);
        System.out.println("Final -: " + mapi);

        System.out.println("Original v2: " + mapi);
        añadir(mapi);
        System.out.println("Final +: " + mapi);

    }

    public static void quitar(HashMap<String, Integer> e) {
        List<String> menor20 = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : e.entrySet()) {
            if (entry.getValue() < 20) {
                menor20.add(entry.getKey());
            }
        }
        for (String key : menor20) {
            e.remove(key);
        }
    }

    public static void añadir(HashMap<String, Integer> e) {
        HashMap<String, Integer> nuevo = new HashMap<>();

        for (Map.Entry<String, Integer> entry : e.entrySet()) {
            if (entry.getValue() > 20) {
                nuevo.put(entry.getKey(), entry.getValue());
            }
        }
        e.clear();
        e.putAll(nuevo);
    }

    public static void borrar_ivan_1(HashMap<String, Integer> e) {
        ArrayList<String> keysBorrar = new ArrayList();

        for (String key : e.keySet()) {
            if (e.get(key) < 20) {
                keysBorrar.add(key);
            }
        }

        for (String kb : keysBorrar) {
            e.remove(kb);
        }
    }

    public static void borrar_ivan_2(HashMap<String, Integer> e) {
        HashMap<String, Integer> guardar = new HashMap<>();
        for (String key : e.keySet()) {
            if (e.get(key) < 20) {
                guardar.put(key, e.get(key)); //con esto acabaríamos si esto no fuera un método void.               
                //se pone key y no key.get(key) porque ya hemos hecho la criba del get(key) en el if, así que entran todos los que pasaron ese paso.
            }
        }//como es un void, seguimos con esto:
        e.clear();
        e.putAll(guardar);

        for (String key : guardar.keySet()) {
            e.put(key, guardar.get(key));
        }
        
        
    }
}
