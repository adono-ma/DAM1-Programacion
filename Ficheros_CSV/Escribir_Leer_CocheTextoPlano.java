/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros_CSV;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Escribir_Leer_CocheTextoPlano {
    private static final String fichero = "coches.csv";

    /*
    1º Leer Fichero
    2º El contenido del File -> AL <coche>
    3º Imprimir AL<Coches> 
    4º Meto algun Coche mas en AL <Coche>
    5º Escribo el contenido del AL en el fichero
    --------------------------------------------
    1º Leer Fichero
    2º Escribirlo por pantalla
    3º Creo por teclado un par de coches
    4º Los escribo en el fichero
     */

 /*
        Abrir Fichero Coches y Meter en ArrayList de Coches
        Meter un coche mas
        Escribirlo de vuelta en Fichero
        
        --------------------------
        
        Despues hacerlo en CSV
     */
    public static void main(String[] args) {

        // Leer los coches del archivo
        List<Coche> coches = leerCochesDesdeArchivo(fichero);

        // Mostrar los coches leídos
        System.out.println("Coches en archivo:");
        for (Coche coche : coches) {
            System.out.println(coche);
        }

        // Crear un nuevo coche desde el teclado
        Coche nuevoCoche = Coche.crearCocheTeclado();
        if (nuevoCoche != null) {
            coches.add(nuevoCoche);
        }

        // Guardar la lista actualizada de coches en el archivo
        escribirCochesEnArchivo(fichero, coches);

    }

    public static List<Coche> leerCochesDesdeArchivo(String filename) {
        List<Coche> coches = new ArrayList<>();
        try (FileReader fr = new FileReader(filename)) {
            StringBuilder sb = new StringBuilder();
            int caracter;

            while ((caracter = fr.read()) != -1) {
                if (caracter == '\n') { // Fin de línea, procesar coche
                    Coche coche = Coche.csvToCoche(sb.toString());
                    if (coche != null) {
                        coches.add(coche);
                    }
                    sb.setLength(0); // Limpiar StringBuilder para la siguiente línea
                } else {
                    sb.append((char) caracter);
                }
            }

            // Procesar la última línea si no termina con '\n'
            if (sb.length() > 0) {
                Coche coche = Coche.csvToCoche(sb.toString());
                if (coche != null) {
                    coches.add(coche);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return coches;
    }

    public static void escribirCochesEnArchivo(String filename, List<Coche> coches) {
        try (FileWriter fw = new FileWriter(filename)) {
            for (Coche coche : coches) {
                fw.write(coche.toCSV() + "\n"); // Se añade un salto de línea manualmente
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
//    public static List<Coche> leerCochesDesdeArchivo(String filename) {
//        List<Coche> coches = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                Coche coche = Coche.csvToCoche(linea);
//                if (coche != null) {
//                    coches.add(coche);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error al leer el archivo: " + e.getMessage());
//        }
//        return coches;
//    }

