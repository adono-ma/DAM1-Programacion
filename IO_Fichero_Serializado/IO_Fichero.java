/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Fichero_Serializado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class IO_Fichero implements Serializable{
    private static File f = new File ("./IO_FS/IO_FicheroSerial.txt");
    private static FileOutputStream fos = null;
    private static FileInputStream fis = null;
    private static ObjectOutputStream oos = null;
    private static ObjectInputStream ois = null;
    
    public static boolean escribir (ArrayList<Object> persona, boolean append) {
        try {
            fos = new FileOutputStream(f, append);//al ponerlo en true, da error IOE
            oos = new ObjectOutputStream(fos);
            oos.writeObject(persona);
            
            return true;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } finally {

            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {

                    oos.close();

                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero.");
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finalizando el programa.");
            }
        }
    }
    
    public static ArrayList<Object> leer() {
        return leer();//!!!????
    }
    
    
}

//Hacer una clase IO_FICHERO_SERIALIZADO que tenga un array de objetos y haga un método para leer a (personas), borra personas con un criterio (pj por edad) y luego lee la lista en el main (hacerlo con y sin append)
/*
public class IO_Ficheros_serializados

    private static File f = Ruta_default; //se define arriba como un final string
    private static fis = null
    private static fos = null
    private static oos = null
    private static ois = null

    public static boolean escribir (ArrayList<Objetos>, boolean append) {
T: todo ok
F: ha petado


    }

public ArrayList<Object> static leer () {
}
*/
