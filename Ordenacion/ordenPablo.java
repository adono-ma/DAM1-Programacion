/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author ixche
 */
public class ordenPablo {

    public static void main(String[] args) {
        char c[] = {'1', '2', '3', '7', '1', 'f', '4', 'A', 'r'};

    }

    public static void Ordenar(char[] e) {

        int vueltas = 0;
        boolean cambio = false;
        while (cambio == false) {
            cambio = true;// al ponerle el boolean, cuando da una vuelta entera en la que no cambia, se sale del bucle
            for (int i = 0; i < e.length - 1 - vueltas; i++) {
                if (e[i] > e[i + 1]) {//orden ascendente
                    char aux = e[i];//se crea un auxiliar para guardar el caracter original (o el que estaba antes) y que no se pierda
                    e[i] = e[i + 1];
                    e[i + 1] = aux;
                    cambio = false;
//con un solo for {20, 40, 10, 30}, se mueve el 40 a la derecha del todo
                }
            }
        }
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
