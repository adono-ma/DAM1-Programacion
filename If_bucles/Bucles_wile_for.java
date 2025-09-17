/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If_bucles;

/**
 *
 * @author ixche
 */
import java.util.Scanner;//hay que introducir la librería del Scanner
public class Bucles_wile_for {

    public static void main(String[] args) {
        /*int a = 3;
        int b = 10;

        while (a <= b) {
            //bucle infinito siempre que la condición del while se cumpla. Cuando no se cumpla la condición, se saldrá del while
            System.out.println("hola");
            //System.out.println(a);
            //a++;
            if (a < 5) {//sube 2
                a++;//a = a+1;
            } else {//baja 6
                b--;//b = b-1;
            }*/

        Scanner sc = new Scanner(System.in);
        int n;
        int suma;
        //n = sc.nextInt();
        suma = 0;//Tiene que empezar como valor neutro para la suma

        //do {
        System.out.print("Introduce un numero (<0 para fin): ");
        n = sc.nextInt();//se escoge el número que queremos sumar para empezar
        //}
        while (n >= 0) {
            System.out.println(n);
            suma = suma + n;
            //System.out.print(suma + "\n");
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
        }
        System.out.print("La suma es:"+suma);


        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = 1;
        int i = 0;

        for (int m = 1; m <= 10; m++) {//se mete la variable en el 1 cuadro, la condición en el 2º cuadro y la operacion en el 3º
            i = m * n;
            System.out.print(n+"x"+m+"=" +i+ "\n");
        }*/
    }
}
