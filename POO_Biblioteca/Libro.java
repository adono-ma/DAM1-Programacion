
package POO_Biblioteca;

import java.util.Scanner;

public class Libro {

    private long isbn;
    private String titulo;
    private Persona autor;
    private int paginas;

    // Constructor por defecto
    public Libro() {
        this.isbn = -1;
        this.titulo = "Sin titulo";
        this.autor = new Persona();
        this.paginas = -1;
    }

    // Constructor con parámetros
    public Libro(long isbn, String titulo, int paginas, Persona autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(boolean c, Persona aut) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el ISBN del libro: ");
        this.isbn = sc.nextLong();
        sc.nextLine();

        System.out.println("Introduzca el titulo: ");
        this.titulo = sc.nextLine();

        System.out.println("Introduzca el numero de paginas del libro: ");
        this.paginas = sc.nextInt();
        sc.nextLine();

        this.autor = aut;
    }

    public static Libro crearLibroTeclado() {
        //es estático porque sino habría que crear un objeto libro en cada clase en la que se va a utilizar este método, pero 
        //libro está siempre en Libro porque es el mismo objeto (metodo estático -> método de clase; método dinámico -> método de objeto)
        //de esa forma se invoca a la clase, que ya te va a llamar a todos los objetos de tipo libro sin necesidad de crear el objeto cada vez
        Persona aut = Persona.crearPersonaTeclado();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el ISBN del libro: ");
        long isbn = sc.nextLong();
        sc.nextLine();

        System.out.println("Introduzca el titulo: ");
        String titulo = sc.nextLine();

        System.out.println("Introduzca el numero de paginas del libro: ");
        int paginas = sc.nextInt();
        sc.nextLine();

//        Libro aux = new Libro(isbn, titulo, paginas);
//        return aux;
        //Se puede hacer en dos pasos (como arriba) o en uno:
        return new Libro(isbn, titulo, paginas, aut);
    }

    // Métodos getter y setter
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Método equals
    public static boolean myEquals(String s1, String s2) {
        int cont1 = 0;
        boolean equals = true;
        
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                equals = false;
                break;
            }
            if (cont1 == s1.length()) {
                return true;
            }
        }
        return equals;
    }

    public boolean equals(Libro l) {
        if (l == null) {
            return false;
        }
        if (this == l) {
            return true;
        }
        
        if (this.isbn != l.isbn || this.titulo.equals(l.titulo) || this.paginas == l.paginas || this.autor.equals(l.autor)){
            return false;
        }
        return true;
        
//        return this.isbn == l.isbn
//                && myEquals(this.titulo, l.titulo)
//                && this.autor.equals(l.autor)
//                && this.paginas == l.paginas;
    }

    // Método toString
    public String toString() {
        return "ISBN: " + isbn + ", TITULO: " + titulo + ", AUTOR: " + autor.toString() + ", PAGINAS: " + paginas;
        
        //si no le pones el toString, autor te da la dirección de memoria
    }
}
