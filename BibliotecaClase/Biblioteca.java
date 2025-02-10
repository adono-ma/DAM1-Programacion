package BibliotecaClase;

import java.util.Scanner;

public class Biblioteca {

    private int n;
    private Libro libros[];

    // Constructor por defecto
    public Biblioteca(int n) {
        libros = new Libro[n];
    }

    //Contstructor hardcodeado
    public Biblioteca(int n, boolean modo) {
        if (modo == false) {
            libros = new Libro[n];
        } else {
            libros = new Libro[3];
            Libro l1 = new Libro(123, "titulo 1", new Autor("123cvb", "Autor1", 18));
            Libro l2 = new Libro(456, "titulo 2", new Autor("456cvb", "Autor2", 19));
            Libro l3 = new Libro(789, "titulo 3", new Autor("789cvb", "Autor3", 20));
        }
    }

    // Métodos getter y setter
    // Método para insertar un libro
    //primero miramos si hay hueco
    private boolean hueco() {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                return true;
            }
        }
        return false;
    }

    private boolean insertar(Libro l) {
        if (hueco() == false) {
            return false;
        }
        for (int i = 0; i < libros.length; i++) {
            libros[i] = l;
            break;
        }
        return true;
    }

    //mostrar libros
    public void mostrarLibros() {
        System.out.println("Mostrando el contenido de la biblioteca:");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                System.out.println((i + 1) + ".- " + libros[i].toString());
            } else {
                System.out.println((i + 1) + ".- [Hueco vacio]");
            }
        }
    }

    //mostrar un libro v2
    public void mostrarLibrov2(Long isbn_mostrar) {
        boolean encontrado = false;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                if (libros[i].getIsbn() == isbn_mostrar) {
                    libros[i] = null;
                    System.out.println("Libro encontrado:");
                    System.out.println(libros[i].toString());
                    encontrado = true;
                    break;
                }
            }
            if (encontrado == false) {
                System.out.println("No ha sido posible encontrar el libro");
            }
        }
    }

    //eliminar libro
//    public boolean eliminarLibrov1(long isbn) {
//        int pos = buscarPos(isbn);
//        if (pos != -1) {
//            libros[pos] = libros[--numLibros];
//            libros[numLibros] = null;
//            return true;
//        }
//        return false;
//    }
//hacer una v2 en el que le salga la lista y elija el número a borrar
    public void eliminarLibrov2() {
        if (libros.length <= 0) {
            System.out.println("Error, la bibliteca esta vacía.");
            return;// el return vacío es para cerrar el método entero
        }

        Scanner sc = new Scanner(System.in);
        boolean error_seleccion = false;
        System.out.println("Mostrando el contenido de la biblioteca:");
        do {
            error_seleccion = false;
            //llamada al metod mostrar libros
//            for (int i = 0; i < libros.length; i++) {
//                if (libros[i] != null) {
//                    System.out.println((i + 1) + ".- " + libros[i].toString());
//                } else {
//                    System.out.println((i + 1) + ".- [Hueco vacio]");
//                }
//            }
            mostrarLibros();
            int opcion;
            System.out.print("Elija el numero del libro que quiere borrar: ");
            opcion = sc.nextInt();
            opcion--;
            if (opcion >= 0 && opcion <= libros.length && libros[opcion] != null) {
                libros[opcion] = null;
                System.out.println("Libro borrado correctamente");

//                break;
                //return true;
             else {
                System.out.println("Error, seleccione un libro correcto.");
                error_seleccion = true;
            }

        } while (error_seleccion == true);

    }

    //eliminar libro v3
    public boolean eliminarLibrov3(Long isbn_eliminar) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                if (libros[i].getIsbn() == isbn_eliminar) {
                    libros[i] = null;
                    System.out.println("Libro borrado correctamente");
                    return true;
                }
            }
        }
        System.out.println("No ha sido posible borrar el libro");
        return false;
    }

}
