/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package File_directory;

/**
 *
 * @author ixche
 */
public class Menu {

    public static void main(String[] args) {
    menu();

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
                System.out.println("Error, debe de introducir un nÂº de 1-6");
                error = true;
            } else {
                error = false;
            }
        }

        return Integer.valueOf(opc);
        
    }
}