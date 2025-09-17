/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ixche
 */
public class Orden_array {

    public static void main(String[] args) {
        int arr[] = {1, 5, 20, 13, 8};
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        
        System.out.print(Arrays.toString(arr));
        
        System.out.println("=========================");
        
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(5);
        a1.add(8);
        a1.add(85);
        a1.add(2);
        a1.add(3);
        a1.add(99);
        //a1.add(null);
        a1.add(6);
        
        System.out.println(a1);
        
        Collections.sort(a1);//solo le pueden entrar arraylist, porque los mapas no tienen orden ni posición
        
        System.out.println(a1);
        
        Collections.reverse(a1);
        
        System.out.println(a1);
        
       Collections.reverseOrder();
       
        System.out.println(a1);
        
        Collections.sort(a1, Collections.reverseOrder());
        System.out.println(a1);
        //Si al collections le metes un null, peta
    }
    
}
