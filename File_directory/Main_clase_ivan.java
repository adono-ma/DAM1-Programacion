/*
METODOS DE LA CLASE FILE:

boolean exists() --> Devuelve true si el fichero o directorio existe
boolean isDirectory() --> Devuelve true si es un directorio válido
boolean isFile() --> Devuelve true si es un fichero válido
String getName() --> Devuelve el nombre del fichero o directorio 
String getPath() --> Devuelve la ruta con la que se creó el objeto File. Puede ser relativa o no.
boolean canRead() --> Devuelve true si se puede leer el fichero
boolean canWrite() --> Devuelve true si se puede escribir en el fichero
boolean delete() --> Elimina el fichero o directorio. Si es un directorio debe estar vacío. Devuelve true si se ha podido eliminar.
boolean renameTo(File dest) --> Cambia el nombre del fichero por el indicado en el parámetro dest. Devuelve true si se ha realizado el cambio.

FICHEROS:
boolean createNewFile() --> Crea el fichero asociado al objeto File. Devuelve true si se ha podido crear. Para poder crearlo el fichero no debe existir. Lanza una excepción del tipo IOException. -> Obligatorio tratar Excepcion IO

DIRECTORIOS:
boolean mkdir() -->Crea el directorio. Devuelve true si se ha podido crear.
String[] list() --> Devuelve un array de String con el nombre de los archivos y directorios que contiene el directorio indicado en el objeto File. Si no es un directorio devuelve null. Si el directorio está vacío devuelve un array vacío.
String getParent() --> Devuelve un String conteniendo el directorio padre del File. Devuelve null si no tiene directorio padre.
File getParentFile() --> Devuelve un objeto File conteniendo el directorio padre del File. Devuelve null si no tiene directorio padre.
 */
package File_directory;

import java.io.File;

public class Main_clase_ivan {
//La clase FILE: Manejo de Archivos y Directorios.
    //String nombre_fichero = "./manifest.mf";
        String nombre_fichero = ".";

        //Constructor - String: Ruta de un fichero.
        File f = new File(nombre_fichero);
    
    public static void main(String[] args) {
        
        //String nombre_fichero = "./manifest.mf";
        String nombre_fichero = ".";

        //Constructor - String: Ruta de un fichero.
        File f = new File(nombre_fichero);

        //MÃ©todos de FILE:
        //.exists(): T|F si existe ese fichero/directorio.
        //.isFile() | .isDirectory()
        System.out.println("Busacando: "+nombre_fichero);
        if (f.exists()) {
            System.out.println("El Fichero/Directorio existe.");
            if (f.isFile()){
                System.out.println("Es un Fichero");
            }
            if (f.isDirectory()){
                System.out.println("Es un Directorio.");
                //Si es un Directorio vamos a sacar el contenido del directorio.
                //.listFiles();
                            
                File array_ficheros [] = f.listFiles();
                                
                for (int i = 0; i < array_ficheros.length; i++) {
                    System.out.println("----"+i+"-----");
                    System.out.println(array_ficheros[i]);
                    //.getName() --> Como el toString pero sin la ruta.
                    System.out.println(array_ficheros[i].getName());
                    //.canRead() | .canWrite | .canExecute()
                    System.out.println("Permiso Lectura: "+array_ficheros[i].canRead());
                    System.out.println("Permiso Escritura: "+array_ficheros[i].canWrite());
                    System.out.println("Permiso EjecuciÃ³n: "+array_ficheros[i].canExecute());
                    System.out.println("Es directorio? "+array_ficheros[i].isDirectory());
                    System.out.println("---------");
                }
                System.out.println("=====Con List, solo String=============");
                    String array_String [] = f.list();
                    for (int j = 0; j < array_String.length; j++) {
                        System.out.print(array_String[j]+" ");
                    }
                    System.out.println("");
            }      
        } else {
            System.out.println("No Existe.");
        }

    }
    
      public static int menu() {
        String opc = "";
        boolean error = true;

        while (error) {
            System.out.println("Menu:");
            System.out.println("1.- Listar SIN ORDEN el contenido del directorio actual: " + f.getPath());
            System.out.println("11.- Listar ORDEN ALFABETICO el contenido del directorio actual: " + f.getPath());
            System.out.println("2.- Navegar a un nuevo directorio (.. para subir un nivel).");
            System.out.println("3.- Crear Directorio.");
            System.out.println("4.- Crear Fichero.");
            System.out.println("5.- Eliminar Directorio/Fichero.");
            System.out.println("6.- Renombrar.");
            System.out.println("7.- Salir");

            opc = sc.nextLine();

            if (!(opc.equalsIgnoreCase("1") | opc.equalsIgnoreCase("2") | opc.equalsIgnoreCase("3") | opc.equalsIgnoreCase("4") | opc.equalsIgnoreCase("5") | opc.equalsIgnoreCase("6") | opc.equalsIgnoreCase("11") | opc.equalsIgnoreCase("7"))) {
                System.out.println("Error, debe de introducir un nº de 1-6");
                error = true;
            } else {
                error = false;
            }
        }

        return Integer.valueOf(opc);
        
    }
}
