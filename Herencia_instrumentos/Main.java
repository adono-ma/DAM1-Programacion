/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia_instrumentos;

/**
 *
 * @author ixche
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //InstrumentoPercusion i1 = new InstrumentoPercusion("Triangulo", 0);
        Tambor t1 = new Tambor ("Tambor_modelo1", 3, "cuero");
        Piano p1 = new Piano ("Piano_modelo2", 1, "Electrico",88);
        
        Piano p11 = Piano.cloneMal(p1);
        Piano p12 = p1.clone();
        
        System.out.println(p1.toString());
        System.out.println(p11.toString());
        System.out.println(p12.toString());
        
        System.out.println("====================");
        
        p1.m2();
//        t1.m2();
        
        
        System.out.println("===============");
        
//        System.out.println(i1.toString());
        System.out.println(t1.toString());//tipo de membrana: cuero
        System.out.println(p1.toString());//tipo de piano:electrico
        System.out.println("================");
        
        t1.tocar();
        t1.recoger();
        
        p1.tocar();
        p1.recoger();
        
       
        System.out.println(p1.getA1());
        System.out.println(p1.getA1Padre());
        
    
    }
    
}
