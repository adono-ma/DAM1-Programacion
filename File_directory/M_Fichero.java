/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_directory;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ixche
 */
public class M_Fichero {
    Scanner sc = new Scanner(System.in);
    String nombre_fichero = ".";//directorio actual
    File f = new File(nombre_fichero);
    
    public void listarContenido(boolean orden) {
        if (f.isDirectory()) {
            String[] ficheros =f.list();
            if (ficheros != null && orden == true) {
                Arrays.sort(ficheros);
                for (String nombre : ficheros) {
                    System.out.println(nombre);
                }
            } else {
                System.out.println("Directorio vacio o no valido.");
            }
        }
    }
    
    
}
