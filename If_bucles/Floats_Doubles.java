/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
public class Floats_Doubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char a = 'z';
        
        System.out.println((int) a);
        
        int aa = 3;
        float bb = (float)3.3;
//si no se pone (float) o f al final de los números, java entiende que quieres pasar de double (8bytes) a float (48bytes) y explota.
        float cc = 3.3f;
    }
}
