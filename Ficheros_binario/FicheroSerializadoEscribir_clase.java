/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ficheros_binario;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ixche
 */
public class FicheroSerializadoEscribir_clase {

    public static void main(String[] args) {

        N n1 = new N();
        N n2 = new N(false, 'V', 555, 9.99, "Jaja no");
        
        File f = new File("./FILES/ejemplobinSerieb.obj");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        MyOOS mOOS = null;

        try {

            if (!f.exists()) {//si el fichero no existe, te crea la cabecera normal
                fos = new FileOutputStream(f, false);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(n1);
                oos.writeObject(n2);
            } else {//si ya existe, usamos nuestro método para que no vuelva a hacerla y pete todo
                fos = new FileOutputStream(f, true);
                mOOS = new MyOOS(fos);
                mOOS.writeObject(n1);
                mOOS.writeObject(n2);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error al acceder al fichero");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error al escribir en el fichero");
            ex.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {

                    oos.close();
                }
                if (mOOS != null) {

                    mOOS.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero.");
                System.out.println(e.toString());
                System.out.println("Finalizando el programa.");
            }
        }
    }
}
