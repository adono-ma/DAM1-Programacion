
package POO_Banco;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        /*
        llama al menú principal:
        -menú principal (switch dentro de switch): elige usuario entre banco, cliente, salir
        -menú banco: alta cliente, baja cliente, listar clientes, cambio titular, abrir nueva cuenta (cliente ya dado de alta), salir
        -menú cliente: sacar dinero (seleccionar cuenta y sacar dinero (si hay)), meter dinero, listar información cliente (toString), realizar transferencia, salir a menú ppal
        *****registrar movimientos (qué cliente ha movido qué dinero a dónde)
        */
        Banco banc = new Banco();
        Scanner sc = new Scanner (System.in);
        int op, op2;
         do{  
             menuPrincipal();
             op = sc.nextInt();
             switch(op){
                 case 1:
                     do{
                     menuBanco();
                     op2 = sc.nextInt();
                     switch(op2){
                         case 1:
                         banc.altaCliente();
                         break;                       
                         case 2:
                         Persona p = banc.selecCliente();
                         if(p.hayHuecoCuenta() != -1){
                         p.asignarCuenta(banc.crearCuenta());}
                         else{System.out.println("No hay espacio para mas cuentas");}
                         break;
                         case 3:
                             System.out.println("");
                             banc.listarClientes();
                             System.out.println("");
                         break;
                         case 4:
                             banc.bajaCliente();
                         break;
                     
                     }
                     }while(op2 != 0);
                     break;
                 case 2:
                     System.out.println("Menu Cliente:");
                     Persona p = banc.seleccionaCliente();
                     do{
                     menuCliente();
                     op2 = Entradas.peticionMenuBC();
                      switch(op2){
                         case 1:
                             p.selecCuentas().meterDinero();
                         break;
                         case 2:
                             p.selecCuentas().sacarDinero();
                         break;
                         case 3:
                             p.toString();
                             p.listaCuentas();
                         break;
                         case 4:
                             banc.transferencia(p);
                         break;                     
                     }
                     }while(op2 != 0);
                     break;
             }
        }while(op != 0);
                 
    }
    
    public static void menuPrincipal(){
        System.out.println("Elgie una de las siguientes opciones:");
        System.out.println("1. Banco");
        System.out.println("2. Cliente");
        System.out.println("0. Salir");
    
    }; /* Elige Banco, Cliente o Salir*/
    public static void menuBanco(){
     System.out.println("Elgie una de las siguientes opciones:");
        System.out.println("1. Alta nuevo Cliente");
        System.out.println("2. Abrir Nueva Cuenta");
        System.out.println("3. Listar Clientes");
        System.out.println("4. Baja Cliente");
        System.out.println("0. Salir");
    }; /*Alta cliente, BajaCliente , listarClientes, Cambio de Titular, Abrir Nueva Cuenta, Salir*/  
    public static void menuCliente(){
       System.out.println("Elgie una de las siguientes opciones:");
        System.out.println("1. Ingresar Dinero");
        System.out.println("2. Retirar Dinero");
        System.out.println("3. Listar Informacion del Cliente");
        System.out.println("4. Realizar Transferencia");
        System.out.println("0. Salir");
    
    };
}
