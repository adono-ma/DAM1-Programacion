/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_Alumnos2;

import POO_Alumno.Alumno;

/**
 *
 * @author ixche
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //Alumno a1 = new Alumno("Iván",true);
        //Alumno a2 = new Alumno("Sandra");
              
        
                
//        for (int i = 0; i < a1.getAsignaturas().length; i++) {
//             a1.getAsignaturas()[i].ponerNotaAleatoria();
//        }
//        
//        Asignatura [] aux  = a1.getAsignaturas();
//                
//        for (int i = 0; i < aux.length; i++) {
//             aux[i].ponerNotaAleatoria();
//        }
//        
//        System.out.println(a1.toString());
                
          Alumno a1 = new Alumno("Iván",true);
          a1.ponerNotaAleatoria();
          System.out.println(a1.toString());
          System.out.println(a1.obtenerNotaMedia());
          Alumno a2 = new Alumno("Raul",true);
          a2.ponerNotaAleatoria();
          System.out.println(a2.toString());
          System.out.println(a2.obtenerNotaMedia());//se pasa a private si solo se va a usar en ese objeto de esa clase concreta
//        for (int i = 0; i < a1.getAsignaturas().length; i++) {
//            a1.getAsignatura()[i].getNota();
//        }
    }

}
