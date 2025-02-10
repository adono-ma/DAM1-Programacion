/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Alumno;

import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class Alumno {
private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    private Asignatura asignaturas[] = new Asignatura[3];

    public Alumno() {
        Scanner sc = new Scanner(System.in);
        this.nombre = nombre;

        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduzca datos de la asig: " + (i + 1) + "/" + asignaturas.length);
            System.out.println("Codigo:");
            //int cod = sc.mextInt();
            int cod = Integer.valueOf(sc.nextLine());
            System.out.println("Horas:");
            //int hor = sc.nextInt();
            int hor = Integer.valueOf(sc.nextLine());
            //sc.nextLine();
            System.out.println("Nombre:");
            String nom = sc.nextLine();
            //asignaturas[i] = new Asignatura(cod, hor, nom);

//            Asignatura aux = new Asignatura(cod,hor,nom);
//            asignaturas[i] = aux;
        }

    }

    public Alumno(String nombre, boolean modo) {
        this.nombre = nombre;
        if (modo == false) {
            Scanner sc = new Scanner(System.in);

//            Asignatura a1 = new Asignatura(01, 10, "BBDD");
//            Asignatura a2 = new Asignatura(02, 20, "Programacion");

//            asignaturas[0] = a1;
//            asignaturas[1] = a2;
        } else {
            for (int i = 0; i < asignaturas.length; i++) {
                //Asignatura aux = new Asignatura(0,0,"Hola");
                //asignaturas[i] = aux.seleccionarAsignatura();
                //asignaturas[i] = Asignatura.seleccionarAsignatura();
            }
        }
    }

    @Override
    public String toString() {
        String sol = "Alumno{" + "nombre=" + nombre + "; Asignaturas: \n";

        for (int i = 0; i < asignaturas.length; i++) {
            sol = sol + asignaturas[i].toString() + "\n";
        }

        sol = sol + '}';

        sol = sol + "Nota Media de " + this.nombre + ": " + this.obtenerNotaMedia();

        return sol;
    }

    public float obtenerNotaMedia() {
        int suma = 0;// = asi1.getNota() + asi2.getNota();

        for (int i = 0; i < asignaturas.length; i++) {
            suma = suma + asignaturas[i].getNota();
        }

        float media = (float) suma / asignaturas.length;
        return media;
    }

    public void ponerNotaAleatoria() {
        for (int i = 0; i < asignaturas.length; i++) {
            //asignaturas[i].ponerNotaAleatoria();
        }
    }
}