/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author ixche
 */
public class Castear2_11Nov1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d = 3.858;
        int p_e;//parte entera
        int p_d;//parte decimal
        
        
        
        
        //n = Integer.valueOf(String.valueOf(d));
        String n = String.valueOf(d);
        System.out.println(n);
        System.out.println("===================");
        String [] split = n.split("\\.");
        
        
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }
        
        p_e = Integer.valueOf(split[0]);
        p_d = Integer.valueOf(split[1]);

        System.out.println(p_e);
        System.out.println(p_d);
       
        System.out.println("");
        
    }
    
}
