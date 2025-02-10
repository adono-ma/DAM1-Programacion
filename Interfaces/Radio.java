package Interfaces;

public class Radio implements OperacionesArrayable {

    private String nombre;
    private float sintonia;

    public Radio(String nombre, float sintonia) {
        this.nombre = nombre;
        this.sintonia = sintonia;
    }

    public Radio(Radio r) {
        this.nombre = r.nombre;
        this.sintonia = r.sintonia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSintonia() {
        return sintonia;
    }

    public void setSintonia(float sintonia) {
        this.sintonia = sintonia;
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
        if (!(entrada instanceof Radio)) {
            throw new ClassCastException("No se pueden comparar radios con otros objetos");
            //throw new MyExpNull("No se pueden comparar personas con otros objetos");
        }
        Radio pcopia = (Radio) entrada;
        if (this.sintonia < pcopia.sintonia) {
            return -1;
        }
        if (this.sintonia > pcopia.sintonia) {
            return 1;
        }
        return 0;
    
    //return Integer.compare(this.edad, pcopia.edad);
    //return Integer.compare(this.altura, ej.altura);
    }
    

    @Override
    public OperacionesArrayable myClone() {
        Radio copia = new Radio(this);

        return copia;
    }

    @Override
    public String myToString() {
        return "Radio {" + "nombre: " + nombre + ", sintonia: " + sintonia + "}";
    }

}
