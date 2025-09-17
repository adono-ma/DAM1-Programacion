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
public class Arrays_Normales {

    /*
    teniendo un array
    int arr[] = new int [5];
    
    (el array lleno, con 10, 20, 30, 40, 50 respectivamente)
    
    Se crea un 
    int[] copia(int[] e, int n){
        int sol[] = new int[e.length + 1];
    
        for(e){
    sol[i]=e[i];
    }
    sol[sol - 1] = n;
    
    return sol;
    }

     */
    int arr[] = new int[5];

    int[] copia(int[] e, int n) {
        int sol[] = new int[e.length + 1];

        for (int i = 0; i < e.length; i++) {
            sol[i] = e[i];
        }
        sol[sol.length - 1] = n;
        return sol;
    }
    
    //Array Lists (hay que importarlas, como ya hacíamos con el Scanner).
    
    //Puedes ponerle objetos en lugar del String, no se pueden meter valores primitivas (si se podría un Integer, o un CharAt();    
    ArrayList <String> cs = new ArrayList <String>();
    //cs.add(c1);
    //cs.add(c2);
    //cs.add(c3);
    //sout(cs);//cs.toString(); ????????????
    //cs.add(1, c4) : te pone c4 en posición 1 y te desplaza el resto a las posiciones siguientes

    
    //si tuviéramos una clase Coche, llamándola cs, lo que hubieramos hecho es a Coche -> c1 (se le crea un objeto coche)
    
    //aquí no hay length, por lo que se utiliza size(); que te da el tamaño del array de forma dinámica (si lo pones después de crear el array, cs.size será 0
    //si lo pones tras poner los add, cs.size será 4.
    
    
    /*
    25/02/25
    
    
    */
   //ArrayList <Integer> n = new ArrayList <Integer> ();
}
