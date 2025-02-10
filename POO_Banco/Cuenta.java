package POO_Banco;

import java.util.Scanner;

public class Cuenta {

    private int saldo;
    private Persona titular;

    /**
     *n_cuenta debe ser accesible desde banco para crear nueva cuenta????
     */
    private int n_cuenta;

    //Métodos y constructores
    public Cuenta() {
        this.saldo = 0;
        this.titular = new Persona();
        this.n_cuenta = 0;
    }

    public Cuenta(int saldo, Persona titular, int cuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.n_cuenta = cuenta;
    }

    //equals n_cuenta (Para entrar dinero / salir dinero)
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Persona getTitular() {
        return titular;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void SacarDinero() {
        System.out.println("Introduzca la cantidad que desea retirar");
        Scanner sc = new Scanner(System.in);
        int cantidad = Integer.valueOf(sc.nextLine());

        if (this.saldo < cantidad) {
            System.out.println("Error, no te puedes quedar en nº rojos, operacion cancelada");
        } else {
            this.saldo = this.saldo - cantidad;
        }

    }

    public void MeterDinero() {
        System.out.println("Introduzca la cantidad que desea introducir");
        Scanner sc = new Scanner(System.in);
        int cantidad = Integer.valueOf(sc.nextLine());
        this.saldo = this.saldo + cantidad;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        if (!(this.getClass().equals(ob.getClass()))) {
            return false;
        }
        if (this.getClass() != ob.getClass()) {
            return false;
        }
        Cuenta c = (Cuenta) ob;

        if (this.n_cuenta != c.n_cuenta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Numero de cuenta: " + n_cuenta + "\nSaldo: " + saldo + "\nTitular: " + titular;
    }
}
