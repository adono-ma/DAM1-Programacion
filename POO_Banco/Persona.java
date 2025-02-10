package POO_Banco;

import java.util.Scanner;

public class Persona {

    private String dni;
    private String nombre;
    private Cuenta cuenta[] = new Cuenta[3];

    public Persona() {
        this.dni = "12345678A";
        this.nombre = "Sin nombre";
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void listaCuentas() {
        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta != null) {
                System.out.println((i + 1) + ".- " + cuenta[i].toString());
            } else {
                System.out.println((i + 1) + ".- [Hueco vacio]");
            }
        }
    }

    public Cuenta selecCuenta() {
        Scanner sc = new Scanner(System.in);
        boolean existe = true;
        int n;
        System.out.println("Elija cuenta:");
        do {
            existe = true;
            listaCuentas();
            int opcion = sc.nextInt();
            opcion--;
            n = opcion;
            if (!(opcion >= 0 && opcion <= cuenta.length && cuenta[opcion] != null)) {
                System.out.println("Error, seleccione una cuenta existente.");
                existe = false;
            }
        } while (existe == false);
        return cuenta[n];
    }

    /*
    Constructores
    
    
    Métodos
    -listar cuentas (void): 1.-   2.- 3.- (enseñar y que el cliente elija la cuenta)
    -seleccionar cuenta (devuelve cuenta seleccionada)
    -toString tiene que tener un break con persona y cuenta para que no se cree un bucle infinito
    -asignar cuenta (void) le entra una cuenta (si hay hueco) tiene que mandar un mensaje positivo o negativo
    -desasignar cuenta (le entra una cuenta) esto lo gestiona el main
     */
    private boolean hueco() {
        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i] != null) {
                return true;
            }
        }
        return false;
    }

    public boolean asignarCuenta(Cuenta c) {
        if (hueco() == false) {
            System.out.println("Numero maximo de cuentas asignada superado. No se pudo realizar operacion.");
            return false;
        }
        for (int i = 0; i < cuenta.length; i++) {
            this.cuenta[i] = c;
            this.cuenta[i].setTitular(this);
            System.out.println("Cuenta asignada:\n" + this.cuenta[i].toString());
            break;
        }
        return true;
    }

    public void desasignarCuenta(Cuenta c) {
        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i].equals(c)&&(cuenta[i] != null)) {
                cuenta[i].setTitular(null);
            }
        }

    }

    public void eliminarCuenta() {
        if (cuenta.length <= 0) {
            System.out.println("No hay cuentas que mostrar.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        boolean error_seleccion = false;
        System.out.println("Mostrando cuentas asociadas:");
        do {
            error_seleccion = false;
            selecCuenta();
            int opcion;
            System.out.println("Elija el numero de cuenta que desea eliminar: ");
            opcion = sc.nextInt();
            opcion--;
            if (opcion >= 0 && opcion <= cuenta.length && cuenta[opcion] != null) {
                cuenta[opcion] = null;
                System.out.println("Cuenta eliminada correctamente.");
            } else {
                System.out.println("Error. Seleccione una cuenta existente.");
                error_seleccion = true;
            }
        } while (error_seleccion == true);
    }

    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        if (this.getClass() != ob.getClass()) {
            return false;
        }
        Persona p = (Persona) ob;

        if (this.nombre != p.nombre) {
            return false;
        }

        if (this.dni != p.dni) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni;
    }
}
