/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ficheros_binario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ixche
 */
public class FicheroSerializadoEscribir {

    public static void main(String[] args) {
        N n1 = new N();
        N n2 = new N(false, 'V', 555, 9.99, "Adios");
        File f = new File("./FILES/ejemplobinSerie.avj");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(f);//al ponerlo en true, da error IOE
            oos = new ObjectOutputStream(fos);

            oos.writeObject(n1);
            oos.writeObject(n2);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
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
}
