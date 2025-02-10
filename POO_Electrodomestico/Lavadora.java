
package POO_Electrodomestico;

public class Lavadora extends Electrodomestico {

    private int carga;

    private final int CARGA_DEFECTO = 5;

    //CONSTRUCTORES
    public Lavadora() {// Constructor por defecto
        super();  // Llama al constructor por defecto de Electrodomestico
        this.carga = CARGA_DEFECTO;
    }

    // Constructor con precio y peso, el resto por defecto
    public Lavadora(double precio, int peso) {
        super(precio, peso);  // Llama al constructor correspondiente de Electrodomestico
        this.carga = CARGA_DEFECTO;
    }

    public Lavadora(double precio, int peso, int carga, char consumo_e) {
        super(precio, peso, consumo_e);  // Llama al constructor correspondiente de Electrodomestico
        this.carga = carga;
        precioFinal();
    }

    public Lavadora(int precio, String color, char consumo_e, int peso, int carga) {// Constructor con todos los atributos
        super(precio, color, consumo_e, peso);  // Llama al constructor de Electrodomestico
        this.carga = carga;
    }

    //GETTER
    public int getCarga() {
        return carga;
    }

    //METODOS
    
    public void m2(Object obj) {
        System.out.println("soy Lavadora escribiendo el metodo m2");
    }
    
    @Override
    public void precioFinal() {//Activado automaticamente desde el constructor
        super.precioFinal();
        
        if (carga > 30) {
            setPrecio_base(getPrecio_base() + 50);
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
