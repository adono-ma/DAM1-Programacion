/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Alumno;

import java.util.Random;

public class Asignatura {

    private String Codigo;
    private String Nombre;
    private String Duracion;
    private int Nota;

    //CONSTRUCTOR
    public Asignatura(String Codigo, String Nombre, String Duracion/*, int Nota*/) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Nota = Nota;
    }

    //GETTERS Y SETTERS
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCodigo() {
        return this.Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getDuracion() {
        return this.Duracion;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    public int getNota() {
        return this.Nota;
    }

    //METODOS
    public String myToString() {
        return Nombre + "(" + Codigo + ")" + " con duracion " + Duracion + " y nota " + Nota;
    }

    public String myToStringNombre() {
        String sol = Nombre + "(" + Codigo + ")";
        return sol;
    }

    public void notaAleatoria() {
        Random rand = new Random();
        this.Nota = rand.nextInt(11);//Si es 0 - n , se pone solo al n. Pero si es e.j 1 - n, seria 1,n
    }
}
