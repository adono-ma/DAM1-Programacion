/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces;

public class NewMain {

    public static void main(String[] args) {
//        Persona arr [] = {new Persona ("Marta", 25, (float) 165.34), new Persona ("Concha", 98, (float) 148.68), new Persona ("Raul", 25, (float) 198.32)};
//        Radio arr3 [] = {new Radio ("Maria", (float) 65.34), new Radio ("kiss", (float) 148.13), new Radio ("m30", (float) 118.11) };
//        
//        System.out.println("Personas originalmente:");
//        OperacionesArrayable.imprArray(arr);
//        
//        System.out.println("Veamos el orden por edad:");
//        OperacionesArrayable[] orden = OperacionesArrayable.ordenar(arr);
//        OperacionesArrayable.imprArray(orden);
//        
//        System.out.println("Veamos copiar el arr:");
//        
//        OperacionesArrayable aux [] = OperacionesArrayable.copiarArray(arr);
//        
//        Persona arr2[] = new Persona[arr.length];
//        
//        for (int i = 0; i < aux.length; i++) {
//           arr2[i] = (Persona) aux[i];
//        }
//        
//        OperacionesArrayable.imprArr(arr3);
//        OperacionesArrayable.imprArr(OperacionesArrayable.ordenar(arr3));

        Persona arr1[] = {new Persona("Marta", 18, (float) 165.34), new Persona("Raul", 18, (float) 185.19), new Persona("Ivan", 33, 174)};

//     OperacionesArrayable.imprArray(arr1);
//       System.out.println("=======================");
//        OperacionesArrayable.imprArray(OperacionesArrayable.ordenar(arr1));
        OperacionesArrayable arr[] = new OperacionesArrayable[4];
        arr[3] = arr1[0];
        arr[2] = arr1[1];
        arr[1] = new Radio("Radio Maria", (float) 66.65);
        arr[0] = new Radio("kiss", (float) 148.13);
        OperacionesArrayable.imprArray(arr);
        System.out.println("=======================");
        OperacionesArrayable.imprArray(OperacionesArrayable.ordenar(arr));
    }
    
    
}
