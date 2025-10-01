
package Modelo;

import java.util.Objects;
import java.util.Scanner;

public class Usuario {
   private int usrId;
   private String nombre;
   private String apellido1;
   private String apellido2;
   private String pais;
   private int tel;
   private String fechaNac;
   private String email;
   
   public Usuario() {
       
   }
   
   public Usuario(int id, String nombre, String pais, String fechaNac) {
       this.usrId = id;
       this.nombre = nombre;
       this.pais = pais;
       this.fechaNac = fechaNac;
   }
   
   public Usuario(int id, String nombre, String apellido1, String apellido2, String pais, int tel, String fecha, String mail) {
       this.usrId = id;
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.pais = pais;
       this.tel = tel;
       this.fechaNac = fecha;
       this.email = mail;
   }
   public Usuario(String nombre, String apellido1, String apellido2, String pais, int tel, String fecha, String mail) {
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.pais = pais;
       this.tel = tel;
       this.fechaNac = fecha;
       this.email = mail;
   }
   
   public static Usuario crearUsrTec() {
       Scanner sc = new Scanner(System.in);
       String nombre;
       String apellido1;
       String apellido2;
       String pais;
       int tel;
       String fechaNac;
       String mail;
       System.out.println("Introduzca su nombre:");
       nombre = sc.nextLine();
       System.out.println("Introduzca su primer apellido:");
       apellido1 = sc.nextLine();
       System.out.println("Introduzca su segundo apellido:");
       apellido2 = sc.nextLine();
       System.out.println("Introduzca las 3 primeras letras de su pais:");
       pais = sc.nextLine();
       System.out.println("Introduzca un numero de telefono");
       tel = sc.nextInt();
       sc.reset();
       System.out.println("Introduzca su fecha de nacimiento en formato aaaa-mm-dd");
       fechaNac = sc.nextLine();
       System.out.println("Introduzca su email:");
       mail = sc.nextLine();
       
       return new Usuario(nombre, apellido1, apellido2, pais, tel, fechaNac, mail);
   }
   
   public void modificarUsrTec(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca un nuevo nombre de usuario para " + this.nombre);
       String nombremod = sc.nextLine();
       if(!nombremod.isEmpty()) {//si no se introduce nada, no se modifica el campo, sino que se queda como estaba.
           this.nombre = nombremod;
       }
       System.out.println("Introduzca las 3 primeras letras del pais:");
       String paismod = sc.nextLine();
       if(!paismod.isEmpty()) {
           this.pais = paismod;
       }
       System.out.println("Introduzca su fecha de nacimiento en formato aaaa-mm-dd");
       String fechamod = sc.nextLine();
       if(!fechamod.isEmpty()) {
           this.fechaNac = fechamod;
       }
   }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUsrId() {
        return usrId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getPais() {
        return pais;
    }

    public int getTel() {
        return tel;
    }

    public String getFechaNac() {
        return fechaNac;
    }


    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.usrId != other.usrId) {
            return false;
        }
        if (this.tel != other.tel) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido1, other.apellido1)) {
            return false;
        }
        if (!Objects.equals(this.apellido2, other.apellido2)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return Objects.equals(this.fechaNac, other.fechaNac);
    }

    @Override
    public String toString() {
        return "Usuario{" + "usrId=" + usrId + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", pais=" + pais + ", tel=" + tel + ", fechaNac=" + fechaNac + '}';
    }
    
}
