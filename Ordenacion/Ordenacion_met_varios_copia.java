/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class Ordenacion_met_varios_copia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hacer un array de charts y ordenarlo de forma ascendente/ descendente: mayúscula, número, minúscula
        //metodo ordenar (void) para ordenar los char
        //metodo que le llegue un array y devuelva una matriz de los 3 array distintos
        //método que le llegue la matriz y lo devuelva en uno pero ordenado según se pide

        char[] arr = {'A', 'c', 'a', 'A', 'E', 'f', 'G', 'H', 'R', 'd', '3', '2', '3', 'F', '3', 't', '5', 'G', '5', '5', 'G', 'W', 'Q', 'E'};

        System.out.println("Original: ");
        ImprArr(arr);

        System.out.println("Ordenado: ");
        ImprArr(m1(arr));

    }

    public static char[] m1(char[] e) {
        //Para hacer main en forma de método y nos quitamos el tener main
        //llamar a separar array de matriz
        char[][] mat = SepararArr(e);
        char[] mayus = mat[0];
        char[] num = mat[1];
        char[] minus = mat[2];

        Ordenar2(mayus);
        Ordenar2(num);
        Ordenar2(minus);

        char[] todojunto = UnirArr(mayus, num, minus);

        return todojunto;
    }

    public static void ImprArr(char[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + "");
        }
        System.out.println("");
        System.out.println("============================");
    }

//    static void imprMat(char[][] entrada) {
//        for (int i = 0; i < entrada.length; i++) {
//            for (int j = 0; j < entrada[i].length; j++) {
//                System.out.print(" | " + entrada[i][j] + " | ");
//            }
//            System.out.println("");
//        }
//    }
    static char[] UnirArr(char[] mayus, char[] num, char[] minus) {
        /* se crea un string vacío auxiliar y se van a recorrer todos los array y se vuelcan aquí
        y luego hay que convertir aux en un array de char
         */
        char[] sol;
        String aux = "";

        for (int i = 0; i < mayus.length; i++) {
            aux = aux + mayus[i];
        }
        for (int i = 0; i < num.length; i++) {
            aux = aux + num[i];
        }
        for (int i = 0; i < minus.length; i++) {
            aux = aux + minus[i];
        }

        sol = new char[aux.length()];

        for (int i = 0; i < aux.length(); i++) {
            sol[i] = aux.charAt(i);
        }

        return sol;
    }

    public static char[][] SepararArr(char[] e) {
        int cont_mayus = 0;
        int cont_num = 0;
        int cont_minus = 0;

        //Primero miramos el tamaño que va a tener cada array
        for (int i = 0; i < e.length; i++) {
            if (e[i] >= 'A' && e[i] <= 'Z') {
                cont_mayus++;
            }
            if (e[i] >= '0' && e[i] <= '9') {
                cont_num++;
            }
            if (e[i] >= 'a' && e[i] <= 'z') {
                cont_minus++;
            }
        }
        //creamos los arrays con el tamaño indicado
        char[] mayus = new char[cont_mayus];
        char[] num = new char[cont_num];
        char[] minus = new char[cont_minus];

        int ind_mayus = 0;
        int ind_minus = 0;
        int ind_num = 0;

        //rellenamos cada array con los caracteres correspondientes
        for (int i = 0; i < e.length; i++) {
            // Si el carácter es una mayúscula
            if (e[i] >= 'A' && e[i] <= 'Z') {
                mayus[ind_mayus] = e[i];
                ind_mayus++;
            }
            // Si el carácter es un número
            if (e[i] >= '0' && e[i] <= '9') {
                num[ind_num] = e[i];
                ind_num++;
            }

            // Si el carácter es una minúscula
            if (e[i] >= 'a' && e[i] <= 'z') {
                minus[ind_minus] = e[i];
                ind_minus++;
            }
        }
        //creamos una matriz con los 3 arrays
        char[][] sol = new char[3][];

        sol[0] = mayus;
        sol[1] = num;
        sol[2] = minus;

        return sol;
    }

    public static void Ordenar2(char[] e) {

        int vueltas = 0;
        while (true) {// se pone una condición que se vaya a cumplir siempre para obtener un bucle infinito a no ser que se ponga un if que lo rompa
            //este true es igual que poner 1==1, que es algo que se va a cumplir siempre
            if (estaOrdenadoASC(e) == true) {
                break;
            }
            for (int i = 0; i < e.length - 1 - vueltas; i++) {
                if (e[i] > e[i + 1]) {//orden ascendente
                    char aux = e[i];//se crea un auxiliar para guardar el caracter original (o el que estaba antes) y que no se pierda
                    e[i] = e[i + 1];
                    e[i + 1] = aux;
//con un solo for {20, 40, 10, 30}, se mueve el 40 a la derecha del todo
                }
            }
        }
    }

    public static boolean estaOrdenadoASC(char[] e) {
        //buscar cuando un número no esté ordenado y dar un aviso
        for (int i = 0; i < e.length - 1; i++) {
            if (e[i] > e[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
