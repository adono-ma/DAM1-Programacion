//super = Padre
    //Clase final = No puede tener hijos (No se puede heredar de estas clases)
    //Clase Abstracto = No se puede instanciar Objetos (No se puede crear Objetos)

package Herencia_instrumentos;


 //CLASE PADRE InstrumentoPercusion:

//Si tiene un método abstracto a la clase se le FUERZA a ser abstracta también.
//Si la clase es abstracta es estática y no puede instanciar (crear) objetos a partir de ella

public abstract class InstrumentoPercusion {
    //public final class InstrumentoPercusion; //<-- Con el "final" no puede tener hijos
    private String nombre;
    private String familia;
    private int anios;
    private int a1;

    //private final int a1; <-- Valor que no se puede modificar
    //Los setter se ponen en rojo.
    
    
    public InstrumentoPercusion (String nombre, int anios) {
        this.familia = "Percusion";
        this.nombre = nombre;
        this.anios = anios;
        this.a1 = a1;
    }
    //En los métodos abstractos no se escribe nada porque el método se TIENE que hacer en los hijos: 
    public abstract void m2();

    //Tocar y recoger se utilizan en todos los "hijos":
    public void tocar() {
        System.out.println("Cogemos un palo y golpeamos el instrumento");
    }

    public void recoger() {
        System.out.println("El instrumento se termina de usar");
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnios() {
        return anios;
    }

//    public void setAnios(int anios) {
//        this.anios = anios;
//    }
    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    @Override
    public String toString() {
        return "InstrumentoPercusion{" + "familia=" + familia + ", nombre=" + nombre + ", anios=" + anios + '}';
    }


}