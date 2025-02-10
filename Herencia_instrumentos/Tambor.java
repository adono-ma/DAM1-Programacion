    //super = Padre
    //Clase final = No puede tener hijos (No se puede heredar de estas clases)
    //Clase Abstracto = No se puede instanciar Objetos (No se puede crear Objetos)

package Herencia_instrumentos;

/**
 *
 * CLASE HIJO Tambor:
 */
public class Tambor extends InstrumentoPercusion { //extends "x" añade lo publico del padre 
    private String tipo_membrana;

    public Tambor(String nombre, int anios, String tipo_membrana) {
        super(nombre, anios);
        this.tipo_membrana = tipo_membrana;
    }

    public String getTipo_membrana() {
        return tipo_membrana;
    }

    public void setTipo_membrana(String tipo_membrana) {
        this.tipo_membrana = tipo_membrana;

    }
    

    //para leer los datos del tambor, se usa el toString con el super para no hacer un bucle infinito
    @Override
    public String toString() {
        String aux = super.toString();
        return aux + "\n\t" + " Tambor{" + "tipo_membrana=" + tipo_membrana + '}';
    }

    @Override
    public void m2() {
        throw new UnsupportedOperationException("Not supported yet.");
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //El hijo no puede acceder a los atributos privados del padre. 
    //El Hijo hereda todo lo PÚBLICO del padre.
    
//    public void m1(){
//    System.out.println(getNombre());
//   
//    }

  

    
}
