/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Biblioteca;

import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String nacionalidad;

    public Persona() {
        this.dni = "12345678A";
        this.nombre = "sin nombre";
        this.apellidos = "sin apellidos";
        this.edad = -1;
        this.nacionalidad = "sin nacionalidad";
    }

    public Persona(String dni, String nombre, String apellidos, int edad, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public Persona(boolean b) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el codigo del autor: ");
        this.dni = sc.nextLine();

        System.out.println("Introduzca el nombre del autor: ");
        this.nombre = sc.nextLine();

        System.out.println("Introduzca los apellidos del autor: ");
        this.apellidos = sc.nextLine();

        //esto tampoco tiene sentido
        System.out.println("Introduzca la edad del autor: ");
        this.edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la nacionalidad del autor: ");
        this.nacionalidad = sc.nextLine();
    }

    public static Persona crearPersonaTeclado() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el codigo del autor: ");
        String dni = sc.nextLine();

        System.out.println("Introduzca el nombre del autor: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca los apellidos del autor: ");
        String apellidos = sc.nextLine();

        //esto tampoco tiene sentido
        System.out.println("Introduzca la edad del autor: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la nacionalidad del autor: ");
        String nacionalidad = sc.nextLine();
        
        Persona aux = new Persona (dni, nombre, apellidos, edad, nacionalidad);
        return aux;
        
        //Se puede hacer en dos pasos (como arriba) o en uno:
        //return new Persona (dni, nombre, apellidos, edad, nacionalidad);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Método equals
    public static boolean myEquals(String s1, String s2) {
        int cont1 = 0;
        boolean equals = true;
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                equals = false;
                break;
            }
            if (cont1 == s1.length()) {
                return true;
            }
        }
        return equals;
    }

    public boolean equals(Persona p) {
        return myEquals(this.dni, p.dni)
                && myEquals(this.nombre, p.nombre)
                && myEquals(this.apellidos, p.apellidos)
                && this.edad == p.edad
                && myEquals(this.nacionalidad, p.nacionalidad);
    }

    // Método toString
    public String toString() {
        return "DNI: " + dni + ", NOMBRE: " + nombre + ", APELLIDOS: " + apellidos + ", EDAD: " + edad + ", NACIONALIDAD: " + nacionalidad;
    }
}
