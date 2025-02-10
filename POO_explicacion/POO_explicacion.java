/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_explicacion;

/**
 *
 * @author ixche
 */
public class POO_explicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1º programación modular (lo visto hasta ahora)
        2ª Programación orientada a objetos: se hacen estructuras en las que se meten los "objetos", abstrayendo problemas
        reales. Lo más típico son los problemas de gestión empresarial (agrupaciones semánticas de datos, en las que no se 
        mezclan los datos de unas "tablas" con otras).
        
        Objetos: estructuras de datos/ estructuras semánticas/ encapsulación
        - agrupación semántica de datos:
        
        1. nombre de la clase (nombre de la tabla). Coche: la clase es el tipo de dato. (las clases son la primera en mayúsucula y el resto normal)
        coche1 es el nombre de la variable (se declara el dato)
        coche1 = new Coche(?); se instancia el dato.
        Coche c2 = new Coche();
        Coche c3 = new Coche();
        
        2. atributos de la tabla. modelo: String. precio: float. año fabricación: int. Usado: boolean. etiqueta: char. kilometraje: int. depósito: int.
        
        3. Métodos (verbos/acciones a realizar).
        void conducir (aumenta el kilometraje)(4); -> 4 + 5 = 9
        boolean revision();
        
        
        int b = 3;
        int arr[] = new int[3];
        
        
        Encapsulameinto: 
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        c1.conducir(10);
        c2.conducir(5);
        
        sout(c1.getkm()); va a salir 10
        sout(c2.getkm()); va a salir 5
        
        
        si yo pongo c1. me saldrán todas las extenciones asociadas a coche y a c1
        geter: para coger atriburos del objeto
        setter: para modificar atributos del objeto
        
        *Método: existe en la página del main.
        un método void dentro de una clase, se queda DENTRO de la clase,
        por eso no hace falta que devuelva nada
        *clase: existe por si misma
        
        con los new se invocan los constructores y se reserva memoria para el objeto
        
        
        sobrecargar un método:
        int sumar (int A, int B);
        int sumar (int A, 1);
        int sumar (int A, int B, int C);
        int sumar (int A, int B, ...., int N);
        
        
        Un constructor tiene el mismo nombre que la clase. El constructor por defecto es Public NombreDeObjeto()
        
        Antes de que aprendamos herencia vamos a hacer los métodos públicos y los atributos serán privados.
        - Los métodos privados suelen ser métodos intermedios.
        
        Ej:
        AULA
        Private int capacidad;
        Private String código;
        Private Alumno alumnos[] = new Alumnos[capacidad<+
        
        
        
        
        
        Invocar un método costructor:
        this. hace referencia al atributo o método del objeto
        this() es una llamada al constructor directamente
        
        Constructor copia: le entran como parámetros de entrada aquellos de su propia clase
        ej:
        Fecha
            día
            mes
            año
        
            fecha(dia, mes, año)
            fecha()
        
        Class Persona {//dentro de persona.java
        
        public Persona(Persona p_e) {
        this.nombre= p_e getNombre();
        this.edad = pe_e getEdad();
        }
        //haciendo esto, nos ahorramos una nueva llamada al método
        public int getEdad(){
        return this.edad;
        }
        }

        
        
        
        
        CLASE SE ESCRIBE EN MAYÚSCULA
        y objeto se escribe en minúscula
        
        
        
        
        
        
        
        */
        
        
    }
    
}
