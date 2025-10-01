package Ejecutable;

import AccesoDatos.JDBCUsuarioDAO;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {
private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        JDBCUsuarioDAO jdbcUsr = new JDBCUsuarioDAO();
        //jdbcUsr.alta(Usuario.crearUsrTec());
        

        while (true) {
            System.out.println("--- Menu Gestion de Usuarios ---");
            System.out.println("1. Alta Usuario");
            System.out.println("2. Baja Usuario");
            System.out.println("3. Modificar Usuario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();
            //sc.nextLine();

            switch (opcion) {
                case 1 -> {//alta
                    Usuario nuevo = Usuario.crearUsrTec();
                    jdbcUsr.alta(nuevo);
                }
                case 2 -> {//baja
                   

                    System.out.print("Ingrese ID del usuario a eliminar: ");
                    
                    
                    int id = seleccionarIdUsuario(jdbcUsr.listar());

                    Usuario usuariorem = jdbcUsr.buscar(id);
                    if (usuariorem != null) {
                        jdbcUsr.baja(usuariorem);
                    }
                }
                case 3 -> {//modificar
                    jdbcUsr.listar();

                    System.out.print("Ingrese ID del usuario a modificar: ");
                    int id = seleccionarIdUsuario(jdbcUsr.listar());

                    Usuario usuariomod = jdbcUsr.buscar(id);
                    
                    if (usuariomod != null) {
                        usuariomod.modificarUsrTec();
                        jdbcUsr.modificar(usuariomod);
                    }
                }
                case 4 -> {//salir
                    System.out.println("Saliendo...");
                    jdbcUsr.cerrarConexion();
                    sc.close();
                }
                default ->
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static int seleccionarIdUsuario(ArrayList<Usuario> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(i+1 + ".- "+al.get(i).toString());
        }
        
        int selec = sc.nextInt();
        return al.get(selec-1).getUsrId();
    }
}
/*
        El menú va a ser como el menú de banco:
        1.- Alta
        2.- Baja
        3.- Modificar
        4.- Salir (hay que cerrar la conexión también).
        
        Se va a crear un AR<usuarios> al = listar(); (vamos a usarlo en bajas y en modificar)
        
        En alta de usuario:
        Crear usuario: método estático de usuario (crearUsuarioTeclado) -> Se hace el alta.
        
        En baja de usuario: listar(); -> Se captura con scanner el id -> buscar(); -> baja usuario.
        
        En modificar usuario: listar(); -> se captura con scanner el id -> modificar usuario por teclado public void();
        -> buscar el usuario(): coge el id +.modificar teclado(modusuario();
        -> hacer el update del usuario();
        
        
        PARA VALIDAR UNA FECHA:
        
        String fecha = "2000-12-12";
        if (fecha.matches("[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]")) {
        sout ("Entro en el if");
        } else{
        sout ("no entro en el if");
        }

 */

/*
Sacar el país con más usuarios y con menos usuarios: se mete en el jdbcUsuario (método gentePaisesNum(): va a sacar un mapa con el país con más usuarios y el país con menos usuarios)
Sacar el usuario más joven y el más mayor de una red social.
Sacar por pantalla a la persona más joven y a la más mayor de cada rrss y eliminarla.

en SQL:
SELECT  



SUSCRIPCIONES DAO:
-id_usuario
-id_redSocial
-fecha_suscripcion

suscribir(usr, rs);
boolean desuscribir(usr, rs);
boolean desuscribir_todo(usr, rs);


*/
