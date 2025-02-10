/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModificadoresAcceso;

/**
 *CLASES
 * Pública: desde cualquier otra clase o del Main puedo crearme un Padre
 * (también se puede utilizar en otros paquetes del mismo proyecto).
 * 
 * Private: una clase privada (anidada) se crea dentro de una clase normal y 
 * todo lo que haya dentro solo lo puede usar la clase en la que se ha instanciado
 * 
 * Default: (sin modificador). Sin embargo, en los interfaces no poner nada significa abstracto.
 * No permite hacer import, a diferencia de la clase pública
 */
public class Padre {
    
    //método privado: sólo se puede acceder a él desde la propia clase
    private void mPrivado () {
        
    }
    
    //Público: se puede llamar desde fuera de la clase y del propio paquete (mismo proyecto)
    
    //Default: si no se pone nada dentro, hace el preestablecido (se escriba o no), pero si se le añade algo, ya sí que hay que escribirlo
    //public void mDefault (String dni, int edad) {
    public void mDefault () {
        
    }
    
    
    
    //Protected: 
    protected void mProtected () {
        
    }
}

//hacer el ejercicio de piscina, videoclub, electrodoméstico y banco