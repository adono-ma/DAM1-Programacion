package Interfaces;

public interface OperacionesArrayable {

    default void m1() {
        System.out.println("Hola caracola");
    }

    public static void imprArray(OperacionesArrayable entrada[]) {
        for (int i = 0; i < entrada.length; i++) {
            if (entrada[i] != null) {
                System.out.println(entrada[i].myToString());
            } else {
                System.out.println("null");
            }
        }
    }

//    public static String myToString () {
//           return "asd";
    //HACER ESTO ASÍ TIENE 0 PUTO SENTIDO PORQUE NO TODAS LAS CLASES VAN A DEVOLVER LO MISMO
//    }
    /**
     * myToString crea su propio método myToString en cada clase que implemente
     * esta interfaz
     */
    public abstract String myToString();

    public static OperacionesArrayable[] ordenar(OperacionesArrayable[] entrada) {//throws Exception {

        OperacionesArrayable copia[] = copiarArray(entrada);

        int vueltas = 0;
        boolean cambio = false;

        while (cambio == false) {
            cambio = true;

            for (int i = 0; i < copia.length - 1 - vueltas; i++) {//throws Exception {
                //si se pone el throws exception aquí, el try catch deberá gestionarlo quien llame a ordenar (en este caso el main)

                try {
                    if (copia[i].myCompareTo(copia[i + 1]) < 0) {
                        OperacionesArrayable aux = copia[i].myClone();
                        copia[i] = copia[i + 1].myClone();
                        copia[i + 1] = aux;
                        cambio = false;
                    }
                } catch (MyExpNull e) {
                    //System.out.println(e.toString());
                    e.printStackTrace();
                    return entrada;
                }
                vueltas++;
            }
        }
        return copia;
    }

    public static OperacionesArrayable[] ordenar2(OperacionesArrayable[] entrada) {//throws Exception {
        /*
        1. copia array (usa clon)
        
        2. ordena array
        se puede hacer con el algoritmo de la burbuja 
        hay que cambiar la parte del if(arr[i]>arr[i+1], que hará una llamada a myCompareTo
         */
        OperacionesArrayable copia[] = copiarArray(entrada);

        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < (copia.length - i - 1); j++) {
                try {
                    if (copia[j].myCompareTo(copia[j + 1]) > 0) {
                        OperacionesArrayable aux = copia[j];
                        copia[j] = copia[j + 1];
                        copia[j + 1] = aux;
                    }
                } catch (MyExpNull e) {
                    //System.out.println("Error: " + e.getMessage());
                    System.out.println(e.toString());
                    return entrada;
                }
            }
        }
        return copia;
    }

    public abstract int myCompareTo(OperacionesArrayable entrada) throws MyExpNull;

    /*comprueba que sea null, que sea un objeto del tipo que queremos comparar y que sea uno mismo
    en lugar de devolver un boleano, este devuelve <0, 0, >0
    int compare (Object o) {
    if(o == null) {
    throwsNullPointerException ("array vacío")
    }
    if(o instanceof Persona)
    trhows ClassCrashException
    
    no se hace aux, se pone un arr[i].myClon
    
    *Ambas excepciones se pueden hacer con una clase que se llame MyExpNull que herede de exception en el que se le meten los métodos con los casos de throw según sea necesario
     */
    public static OperacionesArrayable[] copiarArray(OperacionesArrayable[] entrada) {
        OperacionesArrayable[] copia = new OperacionesArrayable[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            if (entrada[i] != null) {
                copia[i] = entrada[i].myClone();
            }
        }
        return copia;
    }

    public abstract OperacionesArrayable myClone();
    //al clone le tenemos que meter un constructor copia que le entra un objeto tipo this (para que copie los atributos)

    public static void imprArr(OperacionesArrayable entrada[]) {
        for (int i = 0; i < entrada.length; i++) {
            if (entrada[i] != null) {
                System.out.println(entrada[i].myToString());
            } else {
                System.out.println("null");
            }
        }
    }
}
