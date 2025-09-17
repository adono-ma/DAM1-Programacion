/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenacion;

public class repaso_jq {

    public static void main(String[] args) {
        // TODO code application logic here
        //mySubString , Split,  burbuja, MenorMAyor
//        String s = "CeramicasAna.com";
//        System.out.println(mySubString(s, 9, 11));
//        System.out.println(Split(s, "m"));
//        int[] a = {1, 5, 7, 9, 6, 3, 2, 4, 8};
//        System.out.print("original: ");
//        impr(a);
//        System.out.println();
//        System.out.print("ordenarArray ");
//        impr(ordenarArray(a));
//        System.out.println();
//        System.out.print("ordenarmM ");
//        impr(ordenarmM(a));
//        System.out.println();
//        System.out.print("ordenarArrayMemoria ");
//        impr(ordenarArrayMemoria(a));

//SUBSTRING
        String s = "Ojala aprobar";
        int ini = 6;
        int fin = s.length() - 1;//Siempre desde length -1 (mínimo, para no salirnos del String)

        System.out.println(mySubStrings(s, ini, fin));

//REPLACE
        String re = "Ojala no llorar";
        char og = 'a';
        char replace = 'i';

        System.out.println(myReplace(re, og, replace));

//SPLIT
        String s1 = "hola,adios,casa";
        String s2 = ",";

        System.out.println("===========Split String");
        System.out.println(mySplit(s1, s2));
        System.out.println("(\"===========Split arr");
        imprS(mySplitArr(s1, s2));
        System.out.println("");
        System.out.println("(\"===========Split arr Jorge");

        imprS(mySplitArrJ(s1, s2));

//ORDENAR
        String arr = "Az1bY30yBD5m";

        System.out.println("(\"===========ORIGINAL");
        System.out.println(arr);

        System.out.println("(\"===========MAYUS - NUMEROS - MINUSCULAS:");

        System.out.println(dividirChupi(arr));

//ES PRIMO Y QUITAR ALGO
        int n = 1234567890;
        System.out.println(esPrimo(n));
        System.out.println(quitarNums(n));
        
        //ESPEJO
        String es="hola";
        String[] esp = {"hola", "adios"};
        System.out.println(espejo(es));
        
        imprS(espejoArr(esp));

    }
    
    public static String espejo(String s){
        String sol = "";
        for (int i = s.length()-1; i >=0; i--) {
            sol += s.charAt(i);
        }
        return sol;
    }
    
    public static String[] espejoArr(String[] s){
        String[] sol = new String[s.length];

        for (int i = 0; i < s.length; i++) {
            sol[i] = "";
            for (int j = s[i].length()-1; j >= 0; j--) {
                sol[i] += s[i].charAt(j);
            }
        }
        
        return sol;
    }
    
    public static boolean esPrimo (int n) {
        for (int i = 2; i < n; i++) {//1 es primo, así que se empieza desde el siguiente, el 2
            if (n % i == 0) {//si el resto da 0, no es primo
                return false;
            }
        }
        return true;
    }
    
    public static int quitarNums(int n){
        String s = String.valueOf(n);
        String sol = "";
        int aux = 0;
        for (int i = 0; i < s.length(); i++) {
            aux = Integer.valueOf(String.valueOf(s.charAt(i)));
            if (esPrimo(aux) == false) {
                sol += s.charAt(i);
            }
        }
        return Integer.valueOf(sol);
    }

    public static String myReplace(String s, char o, char c) {
        String sol = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == o) {// si encuentra el caracter
                sol += c;//mete el nuevo
            } else {
                sol += s.charAt(i);//sino, lo copia tal cual
            }
        }
        return sol;
    }

    public static String mySubString(String s, int ini, int fin) {
        String sol = "";
        for (int i = ini; i < fin; i++) {//vas desde el inicio que hayas puesto en el main hasta fin
            sol += s.charAt(i);//nuestro nuevo String recogerá los caracteres del original
        }
        return sol;
    }

    public static String mySplit(String og, String p) {
        String sol = "";
        for (int i = 0; i < og.length(); i++) {
            if (og.charAt(i) != p.charAt(0)) {
                sol += og.charAt(i);
            } else {
                sol += " ";
            }
        }
        return sol;
    }

    public static String[] mySplitArr(String og, String p) {
        int cont = 1;//comienza en 1 para que cuente el número de casillas del array
        int index = 0;//esto nos va a controlar la entrada de nulls

        for (int i = 0; i < og.length(); i++) {
            if (og.charAt(i) == p.charAt(0)) {
                cont++;
            }
        }
        String[] sol = new String[cont];

        for (int i = 0; i < og.length(); i++) {
            if (og.charAt(i) != p.charAt(0)) {
                if (sol[index] == null) {
                    sol[index] = String.valueOf(og.charAt(i));//inicio
                } else {
                    sol[index] += og.charAt(i);//añadimos
                }
            } else {
                index++;
            }
        }
        return sol;
    }

    public static String[] mySplitArrJ(String og, String p) {
        int cont = 1;//comienza en 1 para que cuente el número de casillas del array
        int index = 0;//esto nos va a controlar la entrada de nulls

        for (int i = 0; i < og.length(); i++) {
            if (og.charAt(i) == p.charAt(0)) {
                cont++;
            }
        }
        String[] sol = new String[cont];
        for (int i = 0; i < sol.length; i++) {
            sol[i] = "";
        }

        for (int i = 0; i < og.length(); i++) {
            if (og.charAt(i) != p.charAt(0)) {
                sol[index] += og.charAt(i);//añadimos
            } else {
                index++;
            }
        }
        return sol;
    }

    public static String mySubStrings(String s, int a, int b) {
        String sub = "";
        if (a < 0 || b < 0) {
            return s;
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sub += s.charAt(i);
            }
        }

        if (b > a) {
            for (int i = a; i <= b; i++) {
                sub += s.charAt(i);
            }
        }

        return sub;
    }


    public static void ordenarArrayAna(char[] arr) { //BURBUJAAAAAA

        int vueltas = 0;
        boolean se_ha_hecho_cambio = false;

        while (se_ha_hecho_cambio == false) {
            se_ha_hecho_cambio = true;
            for (int i = 0; i < arr.length - 1 - vueltas; i++) {
                if (arr[i] > arr[i + 1]) { //PARA ASC, DESC = arr[i]<
                    char aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    se_ha_hecho_cambio = false;
                }
            }
            //System.out.print(vueltas + ": ");
            //impr(arr);
            //System.out.println();
            vueltas++;
        }
    }

    public static String dividirChupi(String a) {
        //Contar mayusculas, numeros, minusculas
        int ind_M = 0;
        int ind_m = 0;
        int ind_n = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                ind_M++;
            }
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                ind_m++;
            }
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                ind_n++;
            }
        }

        //CREAMOS UN ARRAY DEL TAMAÑO DEL INDICE PARA TIPO DE CARACTER
        char[] arr_M = new char[ind_M];
        char[] arr_m = new char[ind_m];
        char[] arr_n = new char[ind_n];

        //REINICIAMOS LOS INDICES
        ind_M = 0;
        ind_m = 0;
        ind_n = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                arr_M[ind_M++] = a.charAt(i);
            }
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                arr_m[ind_m++] = a.charAt(i);
            }
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                arr_n[ind_n++] = a.charAt(i);
            }
        }

        //Ahora ordenamos
        ordenarArrayAna(arr_M);
        ordenarArrayAna(arr_m);
        ordenarArrayAna(arr_n);

        impr(arr_M);
        System.out.println();
        impr(arr_m);
        System.out.println();
        impr(arr_n);
        System.out.println();

        return juntarArray(arr_M, arr_n, arr_m);
    }

    public static String juntarArray(char[] may, char[] num, char[] min) {
        //a = "";//se reinicia el array 
        String a = new String();//haces uno nuevo y a tirar
        for (int i = 0; i < may.length; i++) {
            a += may[i];
            //ind_final++;
        }
        //System.out.println(nuevo);
        for (int i = 0; i < num.length; i++) {
            a += num[i];
            //ind_final++;
        }
        //System.out.println(nuevo);
        for (int i = 0; i < min.length; i++) {
            a += min[i];
            //ind_final++;
        }
        //System.out.println(nuevo);
        return a;
    }

    

    public static void imprS(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void impr(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
