// CONSTRUCTOR DEFAULT: No recibe nada

// CONSTRUCTOR COMPLETO: Recibe todos los atributos

// CONSTRUCTOR DEL CLON: Recibe un objeto (ej: Coche)


package Herencia_instrumentos;

/**
 *
 * CLASE HIJO Piano:
 */
public class Piano extends InstrumentoPercusion {
    private String tipo;
    private int a1;

    public Piano(String nombre, int anios, String tipo, int a1) {
        super(nombre, anios);
        this.tipo = tipo;
        this.a1 = a1;
    }

    public Piano(Piano entrada) {
        super(entrada.getNombre(), entrada.getAnios());
        this.tipo = entrada.tipo;
        this.a1 = entrada.a1;
    }

    public int getA1Padre() {// Usamos el getter para acceder a 'a1' en la superclase
        return super.getA1();
    }

    @Override
    public int getA1() {
        return a1;
    }

    @Override
    public void setA1(int a1) {
        this.a1 = a1;
    }
//este hace un override porque no quiere el del palo del padre
    @Override
    public void tocar() {
        System.out.println("El piano se toca dandole a las distintas teclas");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + "\n\t" + " Piano{" + "tipo=" + tipo + '}';
    }

    @Override
    public void m2() {
        System.out.println("soy Piano escribiendo el metodo abstracto");
    }

    public static Piano cloneMal(Piano entrada) {
        Piano aux = new Piano(entrada.getNombre(), entrada.getAnios(), entrada.tipo, entrada.a1);
        return aux;
    }

    public static Piano cloneMalv2(Piano entrada) {
        Piano aux = new Piano(entrada);
        return aux;
    }

    public Piano clone() {
        Piano aux = new Piano(this.getNombre(), this.getAnios(), this.tipo, this.a1);
        return aux;
    }
//(this) es una llamada al constructor, a diferencia de this.loquesea que es una llamada al atributo
    public Piano clonev2() {
        Piano aux = new Piano(this);
        return aux;
    }
    
}
