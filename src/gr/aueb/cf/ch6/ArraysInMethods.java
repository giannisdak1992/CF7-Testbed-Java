package gr.aueb.cf.ch6;

/**
 * Έστω ότι έχουμε μια μέθοδο που θα
 * εκτυπώνει τα στοιχεία ενός πίνακα
 */
public class ArraysInMethods {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        printArray(arr); //Περνάμε μόνο το όνομα του πίνακα, δείκτη περιμένει
        printArray(arr, 1, 4);
        printArray(arr, 0, arr.length-1);

    }

    public static void printArray(int[] arr) {
        for (int el: arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * overloaded version of printArray
     * @param arr the input array
     * @param low the start index
     * @param high the end index
     */
    public static void printArray(int [] arr, int low, int  high) {
        if (low < 0 || low > arr.length -1) {
            return; //ειναι σαν το break, κόβει την εκτέλεση
        }

        for (int i = low; i<=high; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
