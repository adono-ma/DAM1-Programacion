package POO_Banco;


import java.util.Scanner;


public class Banco {

    private String nombre;
    private Persona cliente[] = new Persona[2];
    private int nuCuenta = 100;

    
    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();
        c.getN_cuenta(nuCuenta) = nuCuenta;
        nuCuenta++;
        return c;
    }

    public void cambioTitular(Cuenta c) {
        System.out.println("Seleccione Cliente original:");
        Persona cli = selecCliente();
        System.out.println("Seleccione Cuenta:");
        Cuenta cu = cli.selecCuenta();
        System.out.println("Seleccione Cliente cambio:");
        Persona cli2 = selecCliente();
        cli.desasignarCuenta(cu);
        cli2.asignarCuenta(cu);
        System.out.println("Cuenta " + cu + " asignada a " + cli2);
        }
    
    public void transferencia(Persona cliente) {
        System.out.println("Seleccione Cliente original:");
        Persona p = selecCliente();
        System.out.println("Seleccione cuenta origen:");
        Cuenta cu = p.selecCuenta();
        System.out.println("Seleccione Cliente:");
        Persona cli2 = selecCliente();
        System.out.println("Seleccione cuenta destino:");
        Cuenta c2 = cli2.selecCuenta();
        cu.SacarDinero();
        c2.MeterDinero();
        
    }
        
    public void listaClientes() {
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                System.out.println((i + 1) + ".- " + cliente[i].toString());
            }
        }
    }

    public Persona selecCliente() {
        Scanner sc = new Scanner(System.in);
        boolean existe = true;
        int n;
        System.out.println("Elija cliente:");
        do {
            existe = true;
            listaClientes();
            int opcion = sc.nextInt();
            opcion--;
            n = opcion;
            if (!(opcion >= 0 && opcion <= cliente.length && cliente[opcion] != null)) {
                System.out.println("Error, seleccione una cuenta existente.");
                existe = false;
            }
        } while (existe == false);
        return cliente[n];
    }
    public boolean huecoCliente () {
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                return true;
            }
        }
        return false;
    }
    
    public boolean altaCliente() {
        Scanner sc = new Scanner (System.in);
        String dni;
        if (huecoCliente() == false) {
            System.out.println("Numero de clientes superado. No ha sido posible realizar operacion.");
            return false;
        }
        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Introduzca datos del titular:");
            System.out.println("Nombre del titular:");
            nombre = sc.nextLine();
            System.out.println("DNI:");
            dni = sc.nextLine();
            Persona n_cli = new Persona(nombre, dni);
            Cuenta n_cuenta = new Cuenta();
            cliente[i] = n_cli;
            n_cli.asignarCuenta(n_cuenta);
            break;
        }
        return true;
    }
    
    public void bajaCliente () {
        Persona b_cli = selecCliente();
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null && cliente[i].equals(b_cli)) {
                cliente[i] = null;
            }
        }
    }

    /*
    Métodos:
    -Crear cuenta: devuelve una cuenta
    -cambio de titular (recibe cuenta): 
        1.elegir cliente
        2.elegir cuenta del cliente
        3.elegir cliente destino
    -transferencia (void) recibe un cliente:
        1.selecciona cuenta
        2.selecciona cliente
        3.selecciona cliente destino
        4.selecciona cuenta destino
        5.selecciona cantidad
        *****si la cuenta original tiene saldo, se quita de una y se añade en la otra (o ponerle en negativo, lo que quieras)
    -seleccionar cliente (muestra lista de clientes)
    -alta cliente (void)
    -baja cliente (void)
    -privado huecoCliente devuelve un entero con la posicion del array null o un -1 si está lleno
     */

}

