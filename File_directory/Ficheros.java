/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_directory;

import java.io.File;//io es la libreria input output

public class Ficheros {

    public static void main(String[] args) {
        //. -> Directorio Actual.
        //String nombre_fichero o ruta: "./manifest.io"
//        String ruta = "./manifest.io"; //Fichero
        String ruta = "."; //Directorio

        //Constructor - String: Ruta de un Fichero
        File f = new File(ruta);

        //METODOS DE FILE
        //.exists(): T|F si esxiste ese directorio/fichero
        //.isfile() | .isDirectory()
        System.out.println("Buscando " + ruta);
        if (f.exists()) { //si no pone == es que es: f.exists() == true 
            System.out.println("El fichero / Directorio existe");
            if (f.isFile()) {
                System.out.println("Es un Fichero");
            }
            if (f.isDirectory()) {
                System.out.println("Es un Directorio");
                //Si es un directorio vamos a sacar el contenido del directorio.
                //.listFiles();

                File array_ficheros[] = f.listFiles();

                for (int i = 0; i < array_ficheros.length; i++) {
                    System.out.println("-------" + i + "-------");
                    System.out.println("Nombre: " + array_ficheros[i].getName());
                    System.out.println("Permiso lectura: " + array_ficheros[i].canRead());
                    System.out.println("Permiso Escritura: " + array_ficheros[i].canWrite());
                    System.out.println("Permiso Ejecucion: " + array_ficheros[i].canExecute());
                    System.out.println("Es Directorio?: " + array_ficheros[i].isDirectory());

                    System.out.println("-------");
                }
            } else {
                System.out.println("El directorio está vacío o no se pudo acceder.");
            }

        } else {
            System.out.println("El fichero / directorio NO existe.");

        }

    }

}
