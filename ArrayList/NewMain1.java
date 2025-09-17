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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        a1.add(0);
        a1.add(2);
        a1.add(4);
        a1.add(4);
        a1.add(8);
        a1.add(6);
        a1.add(10);
        a1.add(12);
        a1.add(20);
        a1.add(8);
        a1.add(88);
        a1.add(100);

        System.out.println("Original: " + a1);

        boolean cambio = true;
        do {
            cambio = false;

            for (int i = 0; i < a1.size(); i++) {
                if ((a1.get(i) % 2 == 0) && (a1.get(+1)) %2 != 0) {
                    int aux = a1.get(i);
                    a1.set(i, a1.get(i + 1));
                    a1.set(i + 1, aux);
                    cambio = true;

                    a1.remove(i);
                    i--;
                }
            }

        } while (cambio);

        for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i) % 2 == 0) {
                a1.remove(i);
            }
        }

//        for (int arr : a1) {
//            a1.removeIf(filter)
//        }
        for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i) % 2 == 0) {
                a1.remove(i);
                i--;
            }
        }
        System.out.println("Borrado: " + a1);
        
        //solución de Pablo:
        for (int i = a1.size() - 1; i >= 0; i--) {
            if (a1.get(i) % 2 != 0) {
                a1.remove(a1.get(i));
            }
        }
        ArrayList<Integer> par = new ArrayList();
        for (Integer integer : a1) {
            if (integer % 2 != 0) {
                par.add(integer);
            }
        }
        a1.removeAll(par);
        System.out.println(a1);
        
        
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        arr3.add(3);
        arr3.add(2);
        arr3.add(3);
        arr3.add(3);
        arr3.add(3);
        arr3.add(3);
        arr3.add(2);
        arr3.add(3);
        arr3.add(3);
        arr3.add(3);
        System.out.println("Array 3: " + arr3);

        int i = 0;
        while (i < arr3.size()) {
            if (arr3.get(i) == 3) {
                arr3.remove(i);
            } else {
                i++;
            }
        }

        System.out.println("Array 3 Final: " + arr3);
        

    }
}
