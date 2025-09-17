/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author ixche
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int arr [] = {10, 20, 30, 40};
//        
//        System.out.println(arr);
//        
//        System.out.println("");
//        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        
//        System.out.println("");
//        
//        for (int it : arr) {
//            System.out.println(it);
//        }
        
        
         /*
    25/02/25
    
    
    */
//   ArrayList <Integer> a1 = new ArrayList <Integer> ();
//        System.out.println(a1.toString());
//        System.out.println(a1.size());
//        
//        a1.add(10);
//        a1.add(20);
//        a1.add(30);
//        a1.add(40);
//        
//        
//        System.out.println("");
//        System.out.println(a1.toString());
//        System.out.println(a1.size());
//        
//        a1.add(2, 30);
//        
//        System.out.println("");
//        System.out.println(a1.toString());
//        System.out.println(a1.size());
//        System.out.println(a1.size() - 1);
//        
//        //tenemos remove posicion, borra lo que hay en la posición y lo devuelve (puede dar excepciones si se sale):
//        System.out.println(a1.remove(0));
//        System.out.println(a1);
//        
//        //remove objeto solo borra lo que hay dentro, dando un true si lo borra o un false si no (si hay varios iguales, borra el primero que encuentra):
//        
//        System.out.println(a1.remove(new Integer(30)));
//        System.out.println(a1);
//        
//        //para vaciar el array se usa clear:
//        a1.clear();
        
        
//        //set pone lo que queramos en el hueco que le digamos:
//        System.out.println(a1.set(2, new Integer (33)));
//       System.out.println(a1);
//        
//        //Contains te dice si está lo que le pidas (true/false):
//        System.out.println(a1.contains(new Integer (50)));
//        
//        //indexOf te busca la posición del elemento que buscas, -1 si no lo encuentra:
//        System.out.println(a1.indexOf(new Integer(50)));
        
        //System.out.println(a1.removeAll(new Integer (30))); Te borra una colección entera, así que no le puedes pedir un solo valor
        
        
        ArrayList <N> a2 = new ArrayList <N> ();
        a2.add(new N (10));
        a2.add(new N (20));
        a2.add(new N (30));
        a2.add(new N (40));
        
        System.out.println(a2);
        a2.remove(new N(30));
        
        System.out.println(a2);
        
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i) + " ");
        }
    }
    
}
