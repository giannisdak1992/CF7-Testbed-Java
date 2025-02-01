package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11} ;
        int[] sorted = selectionSort(arr);

        for (int el: sorted) {
            System.out.println(el + " ");
        }

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i< arr.length - 1; i++) {

            //find min
            int minPosition = i;
            int minValue = arr[minPosition];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            //swap minPosition with i
            swap (arr, minPosition, i);
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
