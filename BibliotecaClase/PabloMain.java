
package BibliotecaClase;

import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class PabloMain {


    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        do {
            System.out.println("1. Insertar un libro");
            System.out.println("2. Eliminar un libro");
            System.out.println("3. Buscar un libro");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("0. Salir de la aplicación");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); //limpiamos el buffer
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el DNI");
                    String dni = sc.nextLine();
                    System.out.println("introduce el nombre ");
                    String nombre = sc.nextLine();
                    System.out.println("introduce los apellidos");
                    String apellidos = sc.nextLine();
                    System.out.println("introduzca la edad");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("introduzca nacionalidad");
                    String nacionalidad = sc.nextLine();

                    Autor s = new Autor(dni, nombre, apellidos, edad, nacionalidad);

                    System.out.println("introduce el Isbn");
                    long isbn = sc.nextLong();
                    sc.nextLine();
                    System.out.println("introduce el titulo");
                    String titulo = sc.nextLine();
                    System.out.println("introduce el numero de paginas");
                    int numPag = sc.nextInt();

                    Libro a = new Libro(isbn, titulo, s, numPag);

                    boolean insert = biblioteca.insertar(a);
                    if (insert == true) {
                        System.out.println("El libro se ha insertado con exito");
                    } else {
                        System.out.println("No se ha podido insertar el libro en la biblioteca");
                    }
                    /*crear un libro introduciendo toda su
información POR TECLADO, es decir,
isbn, titulo, dni, nombre, apellidos, edad,
nacionalidad y número de páginas.*/
 /* Insertar los datos anteriormente
tecleados en el libro de modo que habrá que
decir SI EL LIBRO SE HA INSERTADO
CORRECTAMENTE o no en cuyo caso lo
normal es que este la biblioteca LLENA y
no se haya podido meter mas libros.*/
                    break;
                case 2:
                    System.out.println("Introduzca el isbn del libro que quiere eliminar");
                    boolean elim = biblioteca.eliminar(sc.nextLong());
                    if (elim == true) {
                        System.out.println("El libro se ha eliminado con exito");
                    } else {
                        System.out.println("No se ha podido eliminar el libro de la biblioteca ya que no se encuentra en ella");
                    }
                    /* Dado un ISBN (que Habra que leer por
teclado), eliminar dicho libro de la
biblioteca. Puede suceder de que ese libro
no esté con lo cual habría que decir que
dicho libro NO SE PUEDE BORRAR
PORQUE NO ESTA EN LA
BIBLIOTECA., */
                    break;
                case 3:
                    System.out.println("Dame el isbn que quiera buscar");
                    boolean bus = biblioteca.buscar(sc.nextLong());
                    if (bus == true) {
                        System.out.println("El libro se encuentra en la bibliotea");
                    } else {
                        System.out.println("El libro no se encuentra en la biblioteca");
                    }
                    /* Dado un ISBN (que habrá que leer por
teclado), buscar dicho libro de la biblioteca.
Puede suceder de que ese libro no esté con
lo cual habría que decir que dicho libro NO
ESTA EN LA BIBLIOTECA.*/
                    break;
                case 4:
                    System.out.println(biblioteca.toString());
//* Mostrar todos los libros de la biblioteca
                    break;
                case 0:
                    System.out.println("Gracias por usar mi biblioteca");

                    break;
                default:
                    System.out.println("Opción incorrecta");

            }
        } while (opcion != 0);

    }

}
