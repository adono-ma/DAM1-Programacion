package Ficheros_CSV;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FicherosEscribir {
    public static void main(String[] args) {
        //esto es para escribir un archivo:
        File f = new File("./FILES/coches.txt");//no crea directorios, pero sí archivos aunque no existan
        FileWriter fw = null;
        Scanner sc = new Scanner(System.in);
        try {
            fw = new FileWriter(f, true);//se abre  en modo append. por defecto es false, pero al hacerlo en true, no sobreescribe, sino que escribe a continuación de lo que había
            
            System.out.println("Introduzca ** para finalizar.");
            String linea = null;
            
            do {
                linea = sc.nextLine();
                fw.write(linea);
                fw.write("\n");
                //System.out.println("");
                
            } while(!linea.equals("**"));
            fw.flush();//para vaciar el buffer (en nextline no hace falta, pero por si acaso hay que hacerlo).es como hacer un sc.nextLine() vacío, que quitaba lo que hubiese en buffer.
        } catch (IOException ex) {
            System.out.println("Error al encontrar el fichero.");
        } finally{//necesitas hacer otro try-catch porque te puede dar otro error al cerrar el fichero tras su escritura.
            if (fw != null) {
                try { 
                    fw.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero.");  
                }
                System.out.println("Finalizando el programa."); 
            }
        }
    }  
    /*hacer un metodo que le pides coches y te mete lo que necesites. Los datos deberán estar dentro del objeto.
    vamos a guardar los getters y cada objeto va a ir una por línea (meter un espacio o un caracter especial para diferenciar cada atributo).
    se usa String.split para separar los atributos
    ej:
    String aux = "Marta-17-1.80";
    aux.split("-");
    Collections.sort();
    Arrays.sort();
    
    Te tiene que crear un array con los atributos:
    Marta//String
    17//casteo a Integer
    1.80//casteo a Double
    */
}
