/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BBDD;

import java.util.Objects;

public class Coche {

    /**
     * Los ficheros se suele utilizar para guardar metainformación, más que documentos en sí.
     * Vamos a realizar una BDRelacional
     */
    private int id;
    private String marca;
    private float km;
    private char etiqueta;
    private boolean usado;

    public Coche() {
    }
    public Coche(String marca, float km, char etiqueta, boolean usado) {
        this.marca = marca;
        this.km = km;
        this.etiqueta = etiqueta;
        this.usado = usado;
    }

    public Coche(int id, String marca, float km, char etiqueta, boolean usado) {
        this.id = id;
        this.marca = marca;
        this.km = km;
        this.etiqueta = etiqueta;
        this.usado = usado;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public float getKm() {
        return km;
    }

    public char getEtiqueta() {
        return etiqueta;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setEtiqueta(char etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.km) != Float.floatToIntBits(other.km)) {
            return false;
        }
        if (this.etiqueta != other.etiqueta) {
            return false;
        }
        if (this.usado != other.usado) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", marca=" + marca + ", km=" + km + ", etiqueta=" + etiqueta + ", usado=" + usado + '}';
    }
    
    
}
