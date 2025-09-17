/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros_CSV;

import java.util.Scanner;

class Coche implements Comparable<Coche> {

    private String marca;
    private int anio;
    private double precio;

    public static Coche crearCocheTeclado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce coches 'Marca-Anio-Precio' (salir para parar) :");

        String entrada = scanner.nextLine();
        String marca_teclado = "Sin Marca";
        int anio_teclado = -1;
        double precio_teclado = -1;

        String[] datos = entrada.split("-");
        if (datos.length == 3) {
            try {
                marca_teclado = datos[0];
                anio_teclado = Integer.valueOf(datos[1]);
                precio_teclado = Double.valueOf(datos[2]);
            } catch (NumberFormatException e) {
                System.out.println("Error.");
            }
        } else {
            System.out.println("Formato incorrecto.");
        }

        return new Coche(marca_teclado, anio_teclado, precio_teclado);
    }

    public String toCSV() {
        String csv = this.marca + "," + this.anio + "," + this.precio;
        return csv;
    }

     public static Coche csvToCoche(String csv) {// Entra formato marca,anio,precio
        String[] datos = csv.split(",");
        
        if (datos.length == 3) {
            try {
                Coche asd = new Coche(datos[0], Integer.valueOf(datos[1]), Double.valueOf(datos[2]));
                return asd;
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el CSV a Coche.");
            }
        }
        return null;
    }

    public Coche(String csv) {
        Coche asd = csvToCoche(csv);
        if (asd != null) {
            this.marca = asd.marca;
            this.anio = asd.anio;
            this.precio = asd.precio;
        } else {
            this.marca = "Sin Marca";
            this.anio = -1;
            this.precio = -1;
        }
    }
    public Coche(String marca, int anio, double precio) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return marca + " | " + anio + " | " + precio;
    }

    @Override
    public int compareTo(Coche otro) {
        return this.marca.compareTo(otro.marca);
    }
}
