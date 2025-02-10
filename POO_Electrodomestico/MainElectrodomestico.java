
package POO_Electrodomestico;


public class MainElectrodomestico {
    public static void main(String[] args) {
        
     Electrodomestico listaElectrodomesticos[] = new Electrodomestico[5];

//        arr[0] = new Lavadora();//default
        listaElectrodomesticos[0] = new Lavadora(234, 60, 50, 'D');
//414
//precio, peso, carga
        listaElectrodomesticos[1] = new Lavadora(500, 94, 35, 'A');
//750
//        arr[2] = new Television();//default
        listaElectrodomesticos[2] = new Television(1000, 245, 144, true, 'B');
//1560
////precio, peso, resolucion, boolean
        listaElectrodomesticos[3] = new Television(4643, 43, 14, true, 'C');
//4803
listaElectrodomesticos[4] = new Electrodomestico(100, "Morado", 'X', 100);

        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;

        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            //if (!(arr[i] instanceof Lavadora || arr[i] instanceof Television)) {
// if (!(arr[i] instanceof Lavadora) && !(arr[i] instanceof Television)) {
            //!!(arr[i] instanceof Lavadora && arr[i] instanceof Television)
            //arr[i] instanceof Lavadora == false && arr[i] instanceof Television == false
//arr[i] instanceof Lavadora == false && arr[i] instanceof Television == false
                //m1();
                
                //instanceof para coger todas las clases y el getClass es para coger por clases
            if (listaElectrodomesticos[i].getClass() == Electrodomestico.class) {
                sumaElectrodomesticos += listaElectrodomesticos[i].getPrecio_base();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                //m2();
                sumaLavadoras += listaElectrodomesticos[i].getPrecio_base();
            }
            if (listaElectrodomesticos[i] instanceof Television) {
                //m3();
                sumaTelevisiones += listaElectrodomesticos[i].getPrecio_base();
            }
        }

        //Mostramos los resultados
        
        System.out.println("Electrodomesticos: " + sumaElectrodomesticos);
        System.out.println("Lavadoras: " + sumaLavadoras);
        System.out.println("Televisiones: " + sumaTelevisiones); //6363

//        double sumaElectrodomesticos = 0;
//        double sumaTelevisiones = 0;
//        double sumaLavadoras = 0;
//
//        for (int i = 0; i < elec.length; i++) {
//            elec[i].precioFinal();
//            if (elec[i] instanceof Electrodomestico) {
//                sumaElectrodomesticos += elec[i].getPrecio_base();
//            }
//            if (elec[i] instanceof Lavadora) {
//                sumaLavadoras += elec[i].getPrecio_base();
//            }
//            if (elec[i] instanceof Television) {
//                sumaTelevisiones += elec[i].getPrecio_base();
//            }
//        }
//
//        //Mostramos los resultados
//        System.out.println("Electrodomesticos: " + sumaElectrodomesticos);
//        System.out.println("Lavadoras: " + sumaLavadoras);
//        System.out.println("Televisiones: " + sumaTelevisiones); //6363
    }
}
