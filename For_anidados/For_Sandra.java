/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package For_anidados;

/**
 *
 * @author ixche
 */
public class For_Sandra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {3, -2, 8, -11, 15};
        int pos[];
        int longPos = 0;
        int longNeg = 0;
        int neg[];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                longPos++;
            } else {
                longNeg++;
            }
        }
        pos = new int[longPos];
        neg = new int[longNeg];
        int p = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                pos[p] = arr[i];
                p++;
            } else {
                neg[n] = arr[i];
                n++;
            }
        }
        for (int i = 0; i < pos.length; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < neg.length; i++) {
            System.out.print(neg[i] + " ");
        }
        System.out.println("");
    }

}
