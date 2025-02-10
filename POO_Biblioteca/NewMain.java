
package POO_Biblioteca;

import java.util.Scanner;

/**
 
 * CRUD
    Create Read Update Delete
    Biblioteca:
    * -Libro: autor (persona, que es en realidad un atributo de libro)
 * 
 * 
 * @author ixche
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Insertar un libro");
            System.out.println("2. Eliminar un libro");
            System.out.println("3. Buscar un libro");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("0. Salir de la aplicacion");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos el buffer

            switch (opcion) {
                case 1:
                    // Insertar un libro
//                    System.out.println("Introduzca el ISBN del libro: ");
//                    long isbn = sc.nextLong();
//                    sc.nextLine();
//
//                    System.out.println("Introduzca el titulo: ");
//                    String titulo = sc.nextLine();

                    //es el dni, pero no tiene sentido, así que codigo
//                    System.out.println("Introduzca el codigo del autor: ");
//                    String dni = sc.nextLine();
//
//                    System.out.println("Introduzca el nombre del autor: ");
//                    String nombre = sc.nextLine();
//
//                    System.out.println("Introduzca los apellidos del autor: ");
//                    String apellidos = sc.nextLine();
//                    
//                    //esto tampoco tiene sentido
//                    System.out.println("Introduzca la edad del autor: ");
//                    int edad = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.println("Introduzca la nacionalidad del autor: ");
//                    String nacionalidad = sc.nextLine();
//                    System.out.println("Introduzca el numero de paginas del libro: ");
//                    int paginas = sc.nextInt();
//                    sc.nextLine();
//
//                    Persona autor = new Persona(dni, nombre, apellidos, edad, nacionalidad);
//                    Libro nuevoLibro = new Libro(isbn, titulo, autor, paginas);
                    Libro nuevoLibro = Libro.crearLibroTeclado();

                    if (biblioteca.insertar(nuevoLibro)) {
                        System.out.println("Libro insertado correctamente.");
                    } else {
                        System.out.println("No se pudo insertar el libro. La biblioteca esta llena o el libro ya existe.");
                    }
                    break;

                case 2:
                    // Eliminar un libro
                    System.out.println("Introduzca el ISBN del libro a eliminar: ");
                    long isbn = sc.nextLong();
                    sc.nextLine();

                    if (biblioteca.eliminar(isbn)) {
                        System.out.println("Libro eliminado correctamente.");
                    } else {
                        System.out.println("No se pudo eliminar el libro. No existe en la biblioteca.");
                    }
                    break;

                case 3:
                    // Buscar un libro
                    System.out.println("Introduzca el ISBN del libro a buscar: ");
                    isbn = sc.nextLong();
                    sc.nextLine();

                    if (biblioteca.buscar(isbn)) {
                        System.out.println("El libro existe en la biblioteca.");
                    } else {
                        System.out.println("El libro no esta en la biblioteca.");
                    }
                    break;

                case 4:
                    // Mostrar todos los libros
                    System.out.println("Listado de libros en la biblioteca:");
                    System.out.println(biblioteca.toString());
                    break;

                case 0:
                    System.out.println("Saliendo... Gracias por usar esta biblioteca.");
                    break;

                default:
                    System.out.println("Opcion incorrecta. Por favor, elija una opcion valida.");
            }
        } while (opcion != 0);

        sc.close();
        //The close() method closes the file or input stream that the scanner was reading.
    }
}
