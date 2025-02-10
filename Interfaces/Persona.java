package Interfaces;

public class Persona implements OperacionesArrayable {

    private String nombre;
    private int edad;
    private float altura;

    public Persona(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.altura = p.altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public int myCompareTo(OperacionesArrayable entrada) {//throws MyExpNull {
        if (entrada == null) {
            throw new NullPointerException("No se puede comparar. Entrada nula.");
            //throw new MyExpNull("No se puede comparar. Entrada nula.");
        }
        if (entrada == this) {
            return 0;
        }
        if (!(entrada instanceof Persona)) {
            throw new ClassCastException("No se pueden comparar personas con otros objetos");
            //throw new MyExpNull("No se pueden comparar personas con otros objetos");
        }
        Persona pcopia = (Persona) entrada;
        if (this.edad < pcopia.edad) {
            return -1;
        }
        if (this.edad > pcopia.edad) {
            return 1;
        }
        if (this.altura < pcopia.altura) {
            return -1;
        }
        if (this.altura > pcopia.altura) {
            return 1;
        }
        return 0;
    
    //return Integer.compare(this.edad, pcopia.edad);
    //return Integer.compare(this.altura, ej.altura);
    }
    

    @Override
    public OperacionesArrayable myClone() {
        Persona copia = new Persona(this);

        return copia;
    }

    @Override
    public String myToString() {
        return "Persona {" + "nombre: " + nombre + ", edad: " + edad + ", altura: " + altura + "}";
    }

}
