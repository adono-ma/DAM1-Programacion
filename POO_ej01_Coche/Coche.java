/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_ej01_Coche;

/**
 *
 * @author ixche
 */
public class Coche {
    //atributos

    //public String modelo;// publico puede ser visto por otras páginas en las que hay métodos (siempre dentro de tu proyecto)
    //para llevar un proyecto a otro, hay que importarlo directamente al nuevo.
    private String modelo;

    private int km; // privado se queda en la propia clase (esta página)

    //Se accede a atributos privados a través de métodos públicos. En general, los atributos deberían ser siempre privados.
    private boolean segundaMano;
    //getter para meter datos
    //setter para modificar datos

    //Constructor: como un setter completo (se invoca con el new)
    
    public Coche(String modelo_e, int km_e, boolean sM_e) {
        modelo = modelo_e;
        km = km_e;
        segundaMano = sM_e;
        
    }
    
    public Coche() {
        modelo = "Sin modelo";
        km = -1;
        segundaMano = false;
    }

    //getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo_e) {
        modelo = modelo_e;

    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setSegundaMano(boolean segundaMano) {
        this.segundaMano = segundaMano;
    }

    
    
    
    //Métodos
    //this. se refiere al objeto concreto que ha llamado al método, por ejemplo c1.conducir(), se referiría concretamente a c1
    public void conducir(int km_conducidos) {
        this.km = this.km + km_conducidos;
    }

    public boolean isSegundaMano() {//este es el get de segundaMano
        return segundaMano;
    }

    //10.000km
    public boolean revision() {
        boolean revisar = false;
        if (km >= 100) {
            revisar = true;
        }
        return revisar;
    }

    public String myToString(Coche coche_e) {//se podría poner sin this. pero es mejor especificar
        String sol = "";

        //sol = this.getModelo() + " - " + this.getKm() + " - " + this.isSegundaMano();
        //se podría poner con los getter, pero se están moviendo los datos sin sentido y gastando memoria
        sol = this.modelo + " - " + this.km + " - " + this.segundaMano;

        return sol;
    }

    @Override
    public String toString() {
        return "Coche{" + "modelo = " + modelo + ", km = " + km + ", segundaMano = " + segundaMano + '}';
    }
}
