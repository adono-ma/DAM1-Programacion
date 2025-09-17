
public class RepasoOrdinaria {

    public static void main(String[] args) {
//    int[] arr = {8, 6, 5, 1, 3, 3};
//    
//    int menor;
//    int index;
//    
//    //odenar mM
//    for (int i = 0; i < arr.length; i++) {
//        menor = arr[i];
//        index = i;
//        for (int j = 0; j < arr.length; j++) {//método menor, recibe el menor y el índice
//            if (arr[j] < menor) {menor = arr[j];
//            index = j;
//                
//            }
//        }
//        int aux = arr[i];
//        arr[i] = menor;
//        arr[index] = aux;
//        impr(arr);
//    }
//    impr(arr);
//}
//
//public static int[] menor (int[] e){
//    int menor;
//    int ind;
//    int sol[] new int[menor, ind];
//    for (int i = 0; i < e.length; i++) {
//        menor = e[i];
//        ind = i;
//        for (int j = 0; j < e.length; j++) {
//            if (e[j] < menor){
//                ind = j;
//            }
//        }
//    }
//    return sol;
//}
//        
//        
//public static void impr(int[] s){
//    for (int i = 0; i < s.length; i++) {
//        System.out.println(s[i] + " ");    
//    }
//}
//
//public static int[] ord(String s) {
//    
//}
//    
//   public static int[] repeticiones(int[] array) {// Método que elimina los números repetidos del array.
//        int[] arr2 = new int[array.length];  // Creamos una nueva caja (arr2) del mismo tamaño pero vacía.
//        int cont = 0;  // Este contador nos dice cuántos números únicos hemos encontrado.
//
//        // Empezamos a revisar cada número del array original (array).
//        for (int i = 0; i < array.length; i++) {
//            boolean encontrado = false;  // Nos dice si el número ya está en arr2.
//
//            // Revisamos si el número ya está en arr2 (la caja donde guardamos los únicos).
//            for (int k = 0; k < cont; k++) {
//                if (array[i] == arr2[k]) {  // Si encontramos el número repetido en arr2...
//                    encontrado = true;  // Decimos que el número ya fue encontrado.
//                    break;  // Salimos del bucle porque ya no necesitamos seguir buscando.
//                }
//            }
//
//            // Si el número NO está repetido (no lo encontramos en arr2), lo agregamos a arr2.
//            if (!encontrado) {
//                arr2[cont++] = array[i];  // Guardamos el número en arr2 y aumentamos j.
//            }
//        }
//
//        // Ahora ajustamos el tamaño del array (arr2) para devolver solo los números que sí se guardaron.
//        int[] resultado = new int[cont];  // Creamos un nuevo array de tamaño j (solo números únicos).
//
//        // Copiamos los números únicos de arr2 a resultado.
//        for (int i = 0; i < cont; i++) {
//            resultado[i] = arr2[i];
//        }
//
//        // Devolvemos el array con los números sin duplicados.
//        return resultado;
//    } 
        String s1 = "Ola, que ase";
        String s2 = ",";
    }

    public static boolean myEquals(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static String[] mySplit(String s1, String s2){
        int cont = 1;
    }
}
