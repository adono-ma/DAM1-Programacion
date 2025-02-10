
package BibliotecaClase;

import java.util.Scanner;

public class Libro {

    private long isbn;
    private String titulo;
    private Autor autor;
    private int paginas;

    // Constructor por defecto
    public Libro() {
        this.isbn = -1;
        this.titulo = "Sin titulo";
        this.autor = new Autor();
        this.paginas = -1;
    }

    // Constructor con parámetros
    public Libro(long isbn, String titulo, int paginas, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public static POO_Biblioteca.Libro crearLibroTeclado() {
        //es estático porque sino habría que crear un objeto libro en cada clase en la que se va a utilizar este método, pero 
        //libro está siempre en Libro porque es el mismo objeto (metodo estático -> método de clase; método dinámico -> método de objeto)
        //de esa forma se invoca a la clase, que ya te va a llamar a todos los objetos de tipo libro sin necesidad de crear el objeto cada vez
        Autor aut = Autor.crearAutorTeclado();

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
        return new POO_Biblioteca.Libro(isbn, titulo, paginas, aut);
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn
                + ", titulo=" + titulo + ","
                + "\n\t" + "autor=" + autor.toString() + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

//        if (!(this.getClass().equals(obj.getClass()))) {
//            return false;
//        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Libro l = (Libro) obj;

        if (this.isbn != l.isbn) {
            return false;
        }

        if (!(this.titulo.equals(l.titulo))) {
            return false;
        }

        if (!(this.autor.equals(l.autor))) {
            return false;
        }

        return true;
    }

}