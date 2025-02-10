/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_ej02_cuenta;

/**
 *
 * @author ixche
 */
public class Cuenta {

    private String titular;
    private float cantidad;

    public Cuenta(String titular_e) {
//titular es obligatorio, por lo que se crea una solo con este atributo y otro con los dos
        this.titular = titular_e;
    }

    public Cuenta(String titular_e, float cantidad_f) {
        this.titular = titular_e;
        if (cantidad > 0) {
            this.cantidad = cantidad_f;
        } else {
            cantidad = 0;
        }
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular_e) {
        this.titular = titular_e;
    }
    
    public float getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(float cantidad_f) {
        this.cantidad = cantidad;
    }
    
    public String toString() {
        String sol = "";
        
        sol = this.titular + " - " + this.cantidad;
        
        return sol;
    }
}
