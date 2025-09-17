/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package File_directory;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_menu {
    
    private static Scanner sc = new Scanner(System.in);
    private static String ruta_directorio = ".";//directorio actual
    private static File f = new File(ruta_directorio);//Constructor de clase file, no crea el archivo, solo el puntero.

    public static void main(String[] args) {
        switch (menu()) {
            case 1:
                listarFicheros(f);
                break;
            
            case 11:
                File[] files = {f};
                ordenarFicheros(files);
                break;
            
            case 2:
                
                break;
            
            case 3:
                crearDirectorio();
                break;
            
            case 4:
                crearFichero();
                break;
            
            case 5:
                
                break;
            
            case 6:
                
                break;
            
            case 7:
                System.out.println("Fin de programa.");
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
    
    public static void listarFicheros(File files) {
        if (f.exists() && f.isDirectory()) {
            File arr_ficheros[] = f.listFiles();
            if (arr_ficheros != null) {
                for (File ficheros : arr_ficheros) {
                    System.out.println(ficheros.getName());
                    System.out.println(DirOFile(ficheros));
                }                
            } else {
                throw new NullPointerException("Directorio vacio.");
            }
        } else {
            System.out.println("Error al buscar el directorio. La ruta no existe o no es valida.");
        }
        
    }
    
    public static void ordenarFicheros(File[] files) {
        ArrayList<File> aux = new ArrayList();
        aux.addAll(Arrays.asList(files));
        
        Collections.sort(aux);
        for (int i = 0; i < files.length; i++) {
            files[i] = aux.get(i);
        }
    }
    
    public static String DirOFile(File files) {
        if (files.isDirectory()) {
            return ("Es un directorio.");
        } else {
            return ("Es un fichero.");
        }
    }
    
    public static void crearFichero() {
        System.out.println("Introduzca un nombre para el fichero:");
        String rutaFile = sc.nextLine();
        File f_path = new File(f.getAbsolutePath() + "/" + rutaFile);
        try {
            if (f_path.createNewFile()) {
                System.out.println("Fichero creado.");
            } else {
                System.out.println("No se ha podido crear el fichero.");
            }
        } catch (Exception e) {
            
        }
    }
    
    public static void crearDirectorio() {
        System.out.println("Introduzca el nombre del directorio:");
        String rutaDir = sc.nextLine();
        File d_path = new File(f.getAbsolutePath() + "/" + rutaDir);
        try {
            if (d_path.mkdir()) {
                System.out.println("Directorio creado.");
            } else {
                System.out.println("No se ha podido crear el directorio.");
            }
        } catch (Exception e) {
            
        }
    }
    
    public static void selecFicheros() {
        int op = sc.nextInt();
        boolean existe;
        int n;
        System.out.println("Elija fichero/directorio:");
        do {
            existe = true;
            
        } while (existe);
    }

    /*
    2. Subir de nivel de directorio.    
    5. Borrar:
        -seleccionar ficheros/directorios
    6. Renombrar
     */
}
