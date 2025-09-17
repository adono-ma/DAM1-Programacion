
package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main_ArraySort {

    public static void main(String[] args) {
     /* int arr[] = {1,2,3,8,5,3,9,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }*/   //Ordenar arrays normales
        
        ArrayList<Integer> arr = new  ArrayList();
        arr.add(1);
        arr.add(-4);
        arr.add(112);
        arr.add(-20);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(-12);

        System.out.println(arr);
        
        Collections.sort(arr);  //Ordenar normal el array
        Collections.sort(arr, Collections.reverseOrder());  //Ordenar directamente al reves
        System.out.println(arr);
        
        Collections.reverse(arr); //Dar la vuelta al array
        
        System.out.println(arr);
               
        ArrayList<N> arr2 = new  ArrayList();
        arr2.add(new N(1,2));
        arr2.add(new N(-4,2));
        arr2.add(new N(112,2));
        arr2.add(new N(-20,2));
        arr2.add(new N(3,2));
        arr2.add(new N(1,7));
        arr2.add(new N(5,3));
        arr2.add(new N(-12,4));
        
     
        
        System.out.println(arr2);
        
        
        OrdenarNValor2 ordenarValor = new OrdenarNValor2();//
        
        Collections.sort(arr2, ordenarValor);
        
// Tenemos que implementar la Interfaz "Comparable" en N
                                   //y editar el compareTo obligatorio     
        System.out.println(arr2);
        
        Collections.reverse(arr2);
        
        System.out.println(arr2);
    }
    
}
