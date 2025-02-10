
package POO_Biblioteca;

import POO_Biblioteca.Libro;

public class Biblioteca {

    private final int N = 10; // Capacidad máxima de la biblioteca
    private Libro[] libros;
    private int numLibros;

    // Constructor por defecto
    public Biblioteca() {
        this.libros = new Libro[N];
        this.numLibros = -1;
    }

    // Métodos getter y setter
    public Libro[] getLibros() {
        return libros;
    }

    public int getNumLibros() {
        return numLibros;
    }

    // Método para insertar un libro
    
private boolean hayHueco() {
if (!(bibliotecaLlena())) {
            for (int i = 0; i < this.libros.length; i++) {
                if (this.libros[i] == null) {
                    this.libros[i] = libros;
                    System.out.println("Libro insertado correctamente");
                    break;
                }
            }
            return true;
        } else {
            System.out.println("Error: Biblioteca Llena");
            return false;
        }
}


//public boolean insertar(Libro libro) {
////        if (numLibros < N && buscarPos(libro.getIsbn()) == -1) {
////            libros[numLibros++] = libro;
////            return true;
////        }
////        return false;
////si el método es boolean, el sout se lanza en el main, y si es void, lo hace el método de la clase pertinente.
//        if (!(bibliotecaLlena())) {
//            for (int i = 0; i < this.libros.length; i++) {
//                if (this.libros[i] == null) {
//                    this.libros[i] = libro;
//                    System.out.println("Libro insertado correctamente");
//                    break;
//                }
//            }
//            return true;
//        } else {
//            System.out.println("Error: Biblioteca Llena");
//            return false;
//        }
//    }

    // Método para buscar un libro por ISBN
    public boolean buscar(long isbn) {
        return buscarPos(isbn) != -1;
    }

    private int buscarPos(long isbn) {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn() == isbn) {
                return i;
            }
        }
        return -1;
    }

    // Método para eliminar un libro por ISBN
    public boolean eliminar(long isbn) {
        int pos = buscarPos(isbn);
        if (pos != -1) {
            libros[pos] = libros[--numLibros];
            libros[numLibros] = null;
            return true;
        }
        return false;
    }

    // Método para mostrar todos los libros
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numLibros; i++) {
//            sb.append(libros[i].toString()).append("\n");
//        }
//        return sb.toString();

        String sol = this.N + " - ";

        for (int i = 0; i < this.libros.length; i++) {
            sol = sol + this.libros[i].toString();
        }

        return sol;
    }

    public boolean equals(Biblioteca b) {
        if (this.N != b.N) {
            return true;
        } else (Libro.isbn != l.isbn || this.titulo.equals(l.titulo) || this.paginas == l.paginas || this.autor.equals(l.autor)){
            return false;
        }
        
        //comparar libro por libro
        
        return true;
    }

    private boolean bibliotecaLlena() {
        for (int i = 0; i < this.libros.length; i++) {
            if (this.libros[i] == null) {
                return false;
            }
        }
        return true;
    }
}
