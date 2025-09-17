
package DAO;

public class Usuario {
   private int usrId;
   private String nombre;
   private String pais;
   private String fechaNac;
   
   public Usuario() {
       
   }
   
   public Usuario(int id, String nombre, String pais, String fecha) {
       this.usrId = id;
       this.nombre = nombre;
       this.pais = pais;
       this.fechaNac = fecha;
   }
}
