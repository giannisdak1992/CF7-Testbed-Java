package gr.aueb.cf.ch6;

public class ArrayMinAndMax {

    public static void main(String[] args) {


    }

    public static int getMinPosition(int [] arr) {
        if (arr == null || arr.length < 1) { //ένα στοιχείο τουλάχιστον να υπάρχει
            return -1;
        }
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i<arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }

    public static int getMaxPosition(int [] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        int maxPositon = 0;
        int maxValue = arr[maxPositon];

        for (int i = 1; i<arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPositon = i;
                maxValue = arr[i];
            }
        }

        return maxPositon;
    }
}
