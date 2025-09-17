/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class Castear_11Nov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "187273";
        
        
        int a = 3;
        int b = 5;
        
        
        double d = 3.858;
        int p_e;//parte entera
        int p_d;//parte decimal
        
        System.out.println("===================");        
        System.out.println("CHAR TO STRING");
        
        char l;
        
        int j = 2;
        String k = j + "";
        
        l = k.charAt(0);
        System.out.println(l);
        
        
        System.out.println("===================");
        System.out.println("DOUBLE TO STRING");
        //n = Integer.valueOf(String.valueOf(d));
        String n = String.valueOf(d);
        System.out.println(n);
        String [] split = n.split("\\.");
        
        
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }
        
        p_e = Integer.valueOf(split[0]);
        p_d = Integer.valueOf(split[1]);

        System.out.println(p_e);
        System.out.println(p_d);
       
        System.out.println("");
        
        
        
        //_____________________________________________________
        //INT a STRING
        System.out.println("===================");
        System.out.println("INT TO STRING");
        String c;
        c = String.valueOf(a);
        c = c + " "+ String.valueOf(b);
        
        System.out.println("Int a String: " + c);
        System.out.println("");
        
        
        // ________________________________________
        System.out.println("===================");
        System.out.println("STRING to INT");
        
        int arr[] = new int[s.length()];
        
        System.out.println(s);
        
        for (int i = 0; i < s.length();i++) {
            
            arr[i] = Integer.valueOf(String.valueOf(s.charAt(i)));
            //se castea 2 veces, un value of para el char y otro para el String.
            
        }
        
        
        
        imprArr(arr);
    }
    
    static void imprArr(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println("");
        System.out.println("===================");
    }
}
