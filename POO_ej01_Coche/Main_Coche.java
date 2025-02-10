/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO_ej01_Coche;

/**
 *
 * @author ixche
 */
public class Main_Coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Coche c1 = new Coche();
//        Coche c2 = new Coche();
//        Coche c3 = c1;
//
//        String s1 = new String("Hola");
//        int n = 3;
//
//        String s2 = "";
//        String s3 = "";
//
//        Integer n1 = 333;
//        Integer n2 = 333;
//
//        System.out.println(c1.equals(c2));
//        System.out.println(s2.equals(s3));
//        System.out.println(c1.getClass());//devuelve una clase
//        System.out.println(c1.getClass().toString());// devuelve un objeto (en este caso, tipo clase)
//        System.out.println(c1.toString());
//        System.out.println(c2.toString());
//// al hacer el modelo privado, ya no se puede sacar de la clase Coche.java
////        System.out.println(c1.modelo);
////        System.out.println(c2.modelo);
////        System.out.println(c3.modelo);
////        
////        c1.modelo = "BMW";
////        c2.modelo = "Audi";
////        c3.modelo = "Mercedes";
////        
////        System.out.println(c1.modelo);
////        System.out.println(c2.modelo);
////        System.out.println(c3.modelo);
//
//        //c1.equals(c2);//compara c1 y c2 para ver si son iguales
//        //c1.getClass();//lo que haya en la clase (en este caso, el paquete "POO_ej01_Coche"
//        //c1.toString();//hace un puntero que apunta a la dirección de memoria de otro objeto
//        
//        c1.setModelo("BMW");
//        c2.setModelo("Audi");//set es void porque introduce los datos dentro del atributo
//        
//        
//        
//        String aux = c1.getModelo();
//        System.out.println(aux);
//
//        System.out.println(c2.getModelo());
//
//        c1.conducir(7);
//        c1.conducir(200);
        
        //_____________________________________________________________________________      
        Coche c4 = new Coche();
        Coche c5 = new Coche("Audi", 0, false);
        
        c4.setModelo("BMW");
        c4.setKm(123);
        c4.setSegundaMano(true);
        
        c5.setModelo("Audi");
        c5.setKm(0);
        c5.setSegundaMano(false);
        
        System.out.println(c4.getModelo() + " - " + c4.getKm() + " - " + c4.isSegundaMano());
        System.out.println(c5.getModelo() + " - " + c5.getKm() + " - " + c5.isSegundaMano());
        
        System.out.println("===============");
        
        
        //System.out.println(Coche.myToString(c5));//si el myToString se hace static, se llama al coche + método + c5 concretamente y te lo pone y sale bien
        /*
        to String es una fórmula "heredada" del sistema, por lo que hay que sobreescribirlo con las características que queramos nosotros        
        */
        
        System.out.println(c4.myToString(c5));// lo malo de este es que puedes llamar a un coche y que ponga los atributos del otro
        System.out.println(c5.myToString(c5));
        System.out.println("");
        System.out.println(c4.toString());
        System.out.println(c5.toString());
    }

}
