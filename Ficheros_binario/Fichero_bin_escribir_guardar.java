/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros_binario;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
Se guarda información tipada (de distinto tipo) primitivos + String
 */
public class Fichero_bin_escribir_guardar {

    public static void main(String[] args) {
        File f = new File("./FILES/ejemplobin.data");
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        

        try {
            fos = new FileOutputStream(f, true);//se abre  en modo append. por defecto es false, pero al hacerlo en true, no sobreescribe, sino que escribe a continuación de lo que había
            dos = new DataOutputStream(fos);//no siempre vamos a trabajar con ficheros, por lo que se pone data

            N n1 = new N();
            N n2 = new N(false, 'V', 555, 9.99, "adios");

            dos.writeBoolean(n1.isB());
            dos.writeChar(n1.getC());
            dos.writeInt(n1.getN());
            dos.writeDouble(n1.getD());
            dos.writeUTF(n1.getS());

            dos.writeBoolean(n2.isB());
            dos.writeChar(n2.getC());
            dos.writeInt(n2.getN());
            dos.writeDouble(n2.getD());
            dos.writeUTF(n2.getS());

            //recorro el AL de personas o lo que tengamos.
            /*for (PERSONA persona : aL) {
                dos tiene muchos tipos distintos de write, no solo el String, aunque es el predefinido
                UTF guarda un String con caracteres especiales, letras acentuadas
                dos no tiene el .write(String e) como el FileWriter
            
                
            
            
            
            dos.writeUTF(persona.getCodigo());
            dos.writeUTF(persona.getNombre());
            dos.writeUTF(persona.getApellido());
            dos.writeDouble(persona.getSalario());
            
             */
        } catch (FileNotFoundException ex) {
            System.out.println("Error al encontrar el fichero.");
        } catch (IOException ex) {
            System.out.println("Error al encontrar el fichero.");

        } finally {//necesitas hacer otro try-catch porque te puede dar otro error al cerrar el fichero tras su escritura.
            try {
                if (fos != null) {
                    fos.close();
                }
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero.");
                System.out.println(e.toString());
                System.out.println("Finalizando el programa.");
            }
        }
    }
}
