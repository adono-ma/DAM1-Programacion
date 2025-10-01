/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
     * partiendo del método de sacar subscripciones, hay que sacar, de cada RRSS, el usuario más nuevo y más viejo.
     * A esos usuarios hay que sumarles 100 a su ID (update).
     * 
     * !!!!!!! Como ID es una pk, mejor sumar esto a la fecha de nacimiento, para no tocar el ID, ya que al modificar la pk puede dar problemas.
     * 
     * Hay que crear una clase fecha:
     * -constructor fecha es un string
     * Se tiene qie poder instar fechas y luego se hace un compareTo, (puede ser estático o dinàmico).
     * se va a hacer con un hashmap.
 */
public class Fecha implements Comparable<Fecha> {

    private int dia;
    private int mes;
    private int anyo;

    // Constructor normal
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anio;
    }

    // Constructor String: "dd/MM/yyyy"
    public Fecha(String fecha) {
        String[] partes = fecha.split("-");
        this.dia = Integer.valueOf(partes[0]);
        this.mes = Integer.valueOf(partes[1]);
        this.anyo = Integer.valueOf(partes[2]);
    }

    @Override
    public int compareTo(Fecha otra) {
        if (otra == null) {
            throw new NullPointerException("null");
        }
        if (otra == this) {
            return 0;
        }
        if (this.anyo != otra.anyo) {
            return Integer.compare(this.anyo, otra.anyo);
        }
        if (this.mes != otra.mes) {
            return Integer.compare(this.mes, otra.mes);
        }
        return Integer.compare(this.dia, otra.dia);
    }
    
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anyo + '}';
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anyo;
    }
}
