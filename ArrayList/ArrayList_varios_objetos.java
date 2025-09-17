/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ixche
 */
public class ArrayList_varios_objetos {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<String> nom = new ArrayList<String>();

        nom.add("Pablo");
        nom.add("Sandra");
        nom.add("Ana");

        ArrayList<String> nom2 = new ArrayList<>(nom);
        
        System.out.println("Nombres ->" + nom);
        System.out.println("Nombres 2 ->" + nom2);
        
        ArrayList<ArrayList<Integer>> notas = new ArrayList<ArrayList<Integer>>();

        for (String nombre : nom) {
            notas.add(new ArrayList<Integer>());
        }

//        for (int i = 0; i < notas.size(); i++) {
//            notas.get(i).add(5);
//        }
        for (int i = 0; i < notas.size(); i++) {
            for (int j = 0; j <= 2; j++) {
                notas.get(i).add(rand.nextInt(1, 11));
            }
        }

        System.out.println(notas);
        System.out.println("==============");

        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nombre del alumno:");
            System.out.println(nom.get(i) + ":");

            for (int j = 0; j < notas.get(i).size(); j++) {
                System.out.print(notas.get(i).get(j) + " ");
            }
        }

    }


}
