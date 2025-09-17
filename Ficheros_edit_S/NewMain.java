/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ficheros_edit_S;

import java.io.File;
import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        Fichero_Serializable f = new Fichero_Serializable();

        // Inicializar archivo con datos si no existe
        File file = new File("./ficheroDefecto.data");
        if (!file.exists()) {
            ArrayList<Persona> aL = new ArrayList<>();
            aL.add(new Persona("Sandra", 19));
            aL.add(new Persona("Ana", 30));
            aL.add(new Persona("Jesus", 15));
            aL.add(new Persona("Pablo", 21));
            aL.add(new Persona("Ilsis", 20));
            aL.add(new Persona("Raquel", 9));

            if (f.escribir(aL, false)) {
                System.out.println("Archivo creado");
            }
        }
           // Leer
        ArrayList<Persona> personas = f.leer();
        System.out.println("Personas en el archivo:");
        for (Persona p : personas) {
            System.out.println(p);
        }
        // Eliminar menores de edad
        ArrayList<Persona> mayores = new ArrayList<>();
        for (Persona p : personas) {
            if (p.getEdad() >= 18) {
                mayores.add(p);
            }
        }
        System.out.println("");
        // Sobreescribir archivo sin los menores de edad
        if (f.escribir(mayores, false)) {
            System.out.println("Archivo sin menores.");
        }

        // Leer
        ArrayList<Persona> personasActualizadas = f.leer();
        personasActualizadas.forEach(System.out::println);
    }
}
