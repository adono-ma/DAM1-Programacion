/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_ej01_Coche;

/**
 *
 * @author ixche
 */
public class Coche2 {
    private int n_bastidor = 1000;
    private static int contador_Coches = 0;
    private int precio;
    private int descuento;
    private String marca;
    
    public Coche2(String marca, int precio) {
        this.precio = precio;
        this.marca = marca;
        
        contador_Coches++;
        this.n_bastidor = this.n_bastidor * contador_Coches;
    }
    
}
