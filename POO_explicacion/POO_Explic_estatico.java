/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_explicacion;

/**
 *
 * @author ixche
 */
public class POO_Explic_estatico {
    /*
    atributo estáticos: se diferencian de los dinámicos (normales) en que se guardan en la clase, ya que se crean por y para la clase (se relacionan con ella, no con los objetos)
    mientras que los dinámicos se guardan en las flechas (el estático se modifica para todos los objetos, en el dinámico no)
    
    Perro
        nombre
        raza
        chip (estático)
    
        p1
            Hercules
            golden retriever
        
        p2
            coliflor
            bichon maltes
    
    
    CRUD
    Create Read Update Delete
    
    
    
    ****podemos hacer todos los métodos string menos dos:
CharAt y el length
    
    
      Método estático: 
    
    
    
    
    
    TEORÍA:

    Estructuras en las que se meten los "objetos", abstrayendo problemas reales. 
 Lo más típico son los problemas de gestión empresarial (agrupaciones semánticas de datos, 
 en las que no se mezclan los datos de unas "tablas" con otras).

    Esta dividido en tres partes:
   - CLASE: Nombre de la tabla. Tipo de Datos (e.j: Int, String, Boolean).
   - ATRIBUTOS: Son como las columnas o las caracteristicas. Datos.
   - METODOS: Las acciones, como las operaciones. Verbos.
        # Si un metodo no te devuelve nada o si ya esta el dato dentro (modifica), sera un Void.
        # Estan los constructores, los getters, y los setter.

EJEMPLOS:
 
     _______
    |    COCHE          |
    | ------------------|
    |  String modelo;   |
    |  Float precio;    |
    |  Boolean usado;   |
    |  Char etik;       |
    |  Int km = 0;      |
    | Int dep;          |
    | ------------------|
    | Void conducir(4); ----------> km = s; +4; = 9
    |_______|

 La ultima caja contiene los METODOS.

CODIGO:

 Coche c1 = new Coche ();
 Coche c2 = new Coche ();
 c1.conducir(10);
 c2.conducir(5);

 sout(c1.getkm());
 sout(c2.getkm());

 c1. ---> Me va a poner todo lo publico que hay sobre el tipo Coche, 
          todos los metodos y atributos publicos. Y del padre (la clase)

    DOS OPCIONES:
   - GETTER: TE COGE Y TE LEE EL ATRIBUTO.
   - SETTER: ESCRIBIR Y MODIFICAR EL ATRIBUTO.

// 11-12-2024

    TEORÍA
    STATIC: Atributos y metodos de clase, no de objeto.
    nombreAtributoEstatico.nombreObjetoPublico

    EJEMPLO:
     _______
    |       PERRO       |
    | ------------------|
    |  String Nombre;   |
    |  String Raza;     |
    |  (Chip )Static;   |
    |-------------------|
    |_______|

    - P1: Coco, Pomeraneo, 001
    - P2: Nico, Golden Retriever, 002
    */
}
