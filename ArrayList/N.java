package ArrayList;
//import java.util.Comparator;

public class N implements Comparable /*<N>*/ {

    private int valor;
    private int n;

    public N(int valor, int n) {
        this.valor = valor;
        this.n = n;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.valor;
        return hash;
    }

    @Override//solo funcionaría sin sobreescribir el equals si se compara el objeto consigo mismo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final N other = (N) obj;
        return this.n == other.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int getValor() {
        return valor;
    }

    public int compareTo_2(Object o) {
        if (this == o) {
            return 0;
        }
        if (o == null) {
            throw new NullPointerException();
        }
        if (getClass() != o.getClass()) {
            throw new ClassCastException();
        }
        final N other = (N) o;
        if (this.valor != other.valor) {
            return Integer.compare(this.valor, other.valor);
        }
        if (this.n != other.n) {
            return Integer.compare(this.n, other.n);
        }
        //Aqui se harían llamadas a los otros compareTo de los distintos atributos
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        final N aux = (N) o;
        if (o == null) {
            throw new NullPointerException();
        }

        if (this == o) {
            return 0;
        }

        if (o.getClass() != N.class) {
            throw new ClassCastException();
        }

        if (this.n1 != aux.n2) {
            return Integer.compare(this.n1, aux.n2);
        }
        return 0;
    }

    @Override
    public String toString() {
        return valor + " " + n + ", ";
    }

}
