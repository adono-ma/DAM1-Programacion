
package BibliotecaClase;

public class Autor {

    private String dni;
    private String nombre_apellidos;
    private int edad;

    public Autor() {
        this.dni = "00000000A";
        this.nombre_apellidos = "John Doe";
        this.edad = -1;
    }

    public Autor(String dni, String nombre_apellidos, int edad) {
        this.dni = dni;
        this.nombre_apellidos = nombre_apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Autor{" + "dni=" + dni + ", nombre_apellidos=" + nombre_apellidos + ", edad=" + edad + '}';
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

        final Autor other = (Autor) obj;
        
        if (this.edad != other.edad) {
            return false;
        }
//        if (!Objects.equals(this.dni, other.dni)) {
//            return false;
//        }
        if (!this.dni.equals(other.dni)) {
            return false;
        }
        //return Objects.equals(this.nombre_apellidos, other.nombre_apellidos);
        return this.nombre_apellidos.equals(other.nombre_apellidos);
    }

}
