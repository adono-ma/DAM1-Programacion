/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
public class Métodonuevo_24_10_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // dado un array de numeros, dependiendo de si es par o impar, te devuelve cosas distintas
        int numeros[] = {7, 4, 11, 5, 8, 9, 2};
        //f: - impares sin tocar - cambia pares por num. menor par (en este caso, 4)
        //t: - pares sin tocar - cambia impares por num. mayor impar (en este caso, 11)
        imprMat(numeros);
        System.out.println("\n metodo");

        boolean s1 = false;//en este caso, los pares (true = 'I'; false = 'p'
        m1(numeros, s1);
        imprMat(numeros);
    }

    static void imprMat(int[] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            System.out.print(entrada[i] + " | ");
        }
    }

    public static int[] dividirArray(int[] e, char m) {
        //m -> 'p': array solo pares
        //m -> 'i': array solo impares
        //m!= p, i
        //devuelve solo un array para sol
        int par = 0;
        int impar = 0;
        int sol[];

        for (int i = 0; i < e.length; i++) {
            if (e[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        if (m == 'p') {
            sol = new int[par];
            par = 0;

            for (int i = 0; i < e.length; i++) {
                if (e[i] % 2 == 0) {
                    sol[par] = e[i];
                    par++;
                }
            }
            return sol;
        }
        if (m == 'i') {
            sol = new int[impar];
            impar = 0;
            for (int i = 0; i < e.length; i++) {
                if (e[i] % 2 != 0) {
                    sol[impar] = e[i];
                    impar++;
                }
            }
            return sol;
        }
        return e;
    }

    public static void m1(int[] e, boolean m) {
        //f: - impares sin tocar - cambia pares por num. menor par (en este caso, 4)
        //t: - pares sin tocar - cambia impares por num. mayor impar (en este caso, 11)

        int ind_e[];//se hace un array auxiliar para no modificar el original
        if (m == true) {
            //ind_e = Mm(dividirArray(e, 'i'));//saca el mayor y el menor de los num. impares
            ind_e = dividirArray(e, 'i');
            int[] Mmimp = Mm(ind_e);
            for (int i = 0; i < e.length; i++) {
                if (e[i] % 2 != 0) {
                    e[i] = Mmimp[1];//las posiciones de impares empiezan en la primera posicion del array, que son los impares de Mm
                }
            }
        }
        if (m == false) {
            //ind_e = Mm(dividirArray(e, 'p'));
            ind_e = dividirArray(e, 'p');
            int[] Mmp = Mm(ind_e);
            for (int i = 0; i < e.length; i++) {
                if (e[i] % 2 == 0) {
                    e[i] = Mmp[0];//las posiciones de pares empiezan en la posicion 0 del array, que son los pares de Mm
                }
            }
        }
    }//al ser void, modifica el propio array, sin necesidad de devolver nada

    public static int[] Mm(int[] arr) {
        int M = arr[0];
        int m = arr[0];
        int sol[] = new int[2];
        for (int i = 1; i < arr.length; i++) {
//se empieza desde i=1 para que no ponga un num que no está en el array (en este caso, 0)
            if (arr[i] % 2 != 0 && arr[i] > M) {
                M = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] < m) {
                m = arr[i];
            }
        }
        sol[0] = m;
        sol[1] = M;
        return sol;
        //return new int[]{Mm}
    }
}
