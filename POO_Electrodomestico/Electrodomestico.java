
package POO_Electrodomestico;

public class Electrodomestico {
    private double precio_base;
    private String color;
    private char consumo_e;
    private int peso;

    private final String COLOR_DEFECTO = "blanco";
    private final int PRECIO_BASE_DEFECTO = 100;
    private final char CONSUMO_E_DEFECTO = 'F';
    private final int PESO_DEFECTO = 5;

    private final String aceptados[] = {"blanco", "negro", "rojo", "azul", "gris"};

    //CONSTRUCTORES
    public Electrodomestico() { //POR DEFECTO
        this.precio_base = PRECIO_BASE_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumo_e = CONSUMO_E_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    public Electrodomestico(double precio, int peso) { //POR DEFECTO + PRECIO Y PESO
        this.precio_base = precio;
        this.color = COLOR_DEFECTO;
        this.consumo_e = CONSUMO_E_DEFECTO;
        this.peso = peso;
    }

    public Electrodomestico(double precio, int peso, char consumo_e) { //POR DEFECTO + PRECIO Y PESO Y CONSUMO
        this.precio_base = precio;
        this.color = COLOR_DEFECTO;
        this.consumo_e = consumo_e;
        this.peso = peso;
        if (!(this instanceof Lavadora) && !(this instanceof Television)) {
            this.precioFinal();
        }
//        if (this instanceof Electrodomestico) {
//Este no se puede poner poque todos los hijos son electrodomésticos, igual que no se puede poner ! porque lo negaría todo y no entraría nadie
//            this.precioFinal();
//        }
    }

    public Electrodomestico(double precio, String color, char consumo_e, int peso) { //TODOS ATRIBUTOS
        this.precio_base = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo_e);
        this.peso = peso;
    }

    //GETTERS
    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_e() {
        return consumo_e;
    }

    public int getPeso() {
        return peso;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    //METODOS
    private void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            this.consumo_e = letra;
        } else {
            this.consumo_e = CONSUMO_E_DEFECTO;
        }
    }

    private void comprobarColor(String color) {
        for (int i = 0; i < aceptados.length; i++) {
            if (aceptados[i].equalsIgnoreCase(color)) {
                this.color = color;
                break;
            } else {
                this.color = COLOR_DEFECTO;
            }
        }
    }

    public void precioFinal() {//Activado automaticamente desde el constructor
        double suma = 0;
        if (this.consumo_e == 'A') {
            suma = 100;
        }
        if (this.consumo_e == 'B') {
            suma = 80;
        }
        if (this.consumo_e == 'C') {
            suma = 60;
        }
        if (this.consumo_e == 'D') {
            suma = 50;
        }
        if (this.consumo_e == 'E') {
            suma = 30;
        }
        if (this.consumo_e == 'F') {
            suma = 10;
        }

        if (this.peso >= 0 && this.peso <= 19) {
            suma += 10;
        }
        if (this.peso >= 20 && this.peso <= 49) {
            suma += 50;
        }
        if (this.peso >= 50 && this.peso <= 79) {
            suma += 80;
        }
        if (this.peso > 80) {
            suma += 100;
        }

        precio_base += suma;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio_base=" + precio_base + ", color=" + color + ", consumo_e=" + consumo_e + ", peso=" + peso + ", COLOR_DEFECTO=" + COLOR_DEFECTO + ", PRECIO_BASE_DEFECTO=" + PRECIO_BASE_DEFECTO + ", CONSUMO_E_DEFECTO=" + CONSUMO_E_DEFECTO + ", PESO_DEFECTO=" + PESO_DEFECTO + ", aceptados=" + aceptados + '}';
    }
    
    public void m1(Object obj) {
        System.out.println("soy Electrodomestico escribiendo el metodo m1");
    }
}
