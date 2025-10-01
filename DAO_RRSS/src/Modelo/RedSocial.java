
package Modelo;

import java.util.Objects;

public class RedSocial {
    private String nombre;
    private String url;
    
    public RedSocial() {
        
    }
    
    public RedSocial(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        final RedSocial other = (RedSocial) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.url, other.url);
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombre=" + nombre + ", url=" + url + '}';
    }
    

   
}
