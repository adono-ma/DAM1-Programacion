/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ficheros_binario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ixche
 */
public class Fichero_bin_leer {
    public static void main(String[] args) {
        File f = new File("./FILES/ejemplobin.data");
        
        FileInputStream fis = null;
        DataInputStream dis = null;

        ArrayList<N> a1 = new ArrayList();
        try {
            fis = new FileInputStream(f);
            dis = new DataInputStream(fis);//no siempre vamos a trabajar con ficheros, por lo que se pone data
            

            while (dis.available() > 0) {
                boolean b_aux = dis.readBoolean();
                char c_aux = dis.readChar();
                int n_aux = dis.readInt();
                double d_aux = dis.readDouble();
                String s_aux = dis.readUTF();
                
                N aux = new N(b_aux, c_aux, n_aux, d_aux, s_aux);
                a1.add(aux);
            }
            for (N n : a1) {
                System.out.println(n);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al encontrar el fichero.");
        } catch (IOException ex) {
            System.out.println("Error al abrir el fichero.");
            
        } finally {//necesitas hacer otro try-catch porque te puede dar otro error al cerrar el fichero tras su escritura.
            try {
                if (fis != null) {

                    fis.close();
                }
                if (dis != null) {
                    dis.close();
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
