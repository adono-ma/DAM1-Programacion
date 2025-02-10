/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Alumnos2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class Asignatura {

    private int codigo;
    private int num_horas;
    private String nombre;
    private int nota;

    public Asignatura(int codigo, int num_horas, String nombre) {
        this.codigo = codigo;
        this.num_horas = num_horas;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNum_horas() {
        return num_horas;
    }

    public void setNum_horas(int num_horas) {
        this.num_horas = num_horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String myToString() {
        return "Asignatura{" + "codigo=" + codigo + ", num_horas=" + num_horas + ", nombre=" + nombre + ", nota=" + nota + '}';
    }

    public void ponerNotaAleatoria() {
        Random rand = new Random();
        this.nota = rand.nextInt(1, 11);
    }

    public static Asignatura seleccionarAsignatura() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una asignatura:");
        System.out.println("1.- BBDD");
        System.out.println("2.- Programacion");
        System.out.println("3.- FOL");

        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                Asignatura BBDD = new Asignatura(01, 10, "BBDD");
                return BBDD;
            case 2:
                return new Asignatura(02, 20, "Programacion");
            case 3:
                Asignatura FOL = new Asignatura(03, 30, "FOL");
                return FOL;
            default:
                throw new AssertionError();
        }
    }
}