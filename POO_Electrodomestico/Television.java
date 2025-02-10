/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Electrodomestico;

/**
 *
 * @author ixche
 */
public class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    private final int RESOLUCION_DEFECTO = 20;
    private final boolean SINTONIZADOR_DEFECTO = false;

    //CONSTRUCTORES
    public Television() {// Constructor por defecto
        super();  // Llama al constructor por defecto de Electrodomestico
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizador = SINTONIZADOR_DEFECTO;
    }

    // Constructor con precio y peso, el resto por defecto
    public Television(double precio, int peso) {
        super(precio, peso);  // Llama al constructor correspondiente de Electrodomestico
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizador = SINTONIZADOR_DEFECTO;
    }

    public Television(double precio, int peso, int resolucion, boolean sintonizador, char consumo_e) {
        super(precio, peso, consumo_e);  // Llama al constructor correspondiente de Electrodomestico
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        precioFinal();
    }

    public Television(double precio, String color, char consumo_e, int peso, int resolucion, boolean sintonizador) {// Constructor con todos los atributos

        super(precio, color, consumo_e, peso);  // Llama al constructor de Electrodomestico
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    //GETTERS
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    //METODOS
    
    public void m3(Object obj) {
        System.out.println("soy Television escribiendo el metodo m3");
    }
    
    @Override
    public void precioFinal() {//Activado automaticamente desde el constructor
        super.precioFinal();
        if (sintonizador == true) {
            setPrecio_base(getPrecio_base() + 50);
        }
        if (resolucion > 40) {
            setPrecio_base(getPrecio_base() * 1.3);
            //precio = precio + (precio * 0.3); //otra opcion sería = precio * 1.3 // precio + (precio * 0.3);
        }
    }
}
