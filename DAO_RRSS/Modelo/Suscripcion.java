package Modelo;

import java.util.Objects;

public class Suscripcion {

    private int id_usr;
    private int id_rs;
    private String fecha_sus;

    public Suscripcion (){
        
    }
    public Suscripcion(int id_usr, int id_rs, String fecha_sus) {
        this.id_usr = id_usr;
        this.id_rs = id_rs;
        this.fecha_sus = fecha_sus;
    }

    public int getId_usr() {
        return id_usr;
    }

    public void setId_usr(int id_usr) {
        this.id_usr = id_usr;
    }

    public int getId_rs() {
        return id_rs;
    }

    public void setId_rs(int id_rs) {
        this.id_rs = id_rs;
    }

    public String getFecha_sus() {
        return fecha_sus;
    }

    public void setFecha_sus(String fecha_sus) {
        this.fecha_sus = fecha_sus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Suscripcion other = (Suscripcion) obj;
        if (this.id_usr != other.id_usr) {
            return false;
        }
        if (this.id_rs != other.id_rs) {
            return false;
        }
        return Objects.equals(this.fecha_sus, other.fecha_sus);
    }

    @Override
    public String toString() {
        return "Suscripcion{" + "id_usr=" + id_usr + ", id_rs=" + id_rs + ", fecha_sus=" + fecha_sus + '}';
    }   
}
