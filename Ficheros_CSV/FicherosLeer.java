package Ficheros_CSV;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FicherosLeer {
    public static void main(String[] args) {
        //esto es para leer un archivo:
        File f = new File("./FILES/hola.txt");
        Scanner sc = null;// se iguala a null y ya en el try se iguala

        try {
            sc = new Scanner(f);//abre el fichero
            //sc.useDelimiter(",");//para poner como separador, en lugar del espacio, lo que queramos, también sirve para expresiones regulares
            
            while(sc.hasNext() == true) {
                System.out.println(sc.nextLine());
            }
            
        } catch (FileNotFoundException ex) {//(IOException ex) también entraría porque está un nivel por encima, por lo que abarca más que el FileNotFound
            //Logger.getLogger(Main_files.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al encontrar el fichero.");
            ex.printStackTrace();
        } finally{
            if (sc != null) {
               sc.close(); 
            }
        }
    }  
}
