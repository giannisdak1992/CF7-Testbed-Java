package gr.aueb.cf.ch10;

public class ArraysAdd {

    public static void main(String[] args) {
        int [] arr1 = {9, 9, 9, 8};
        int [] arr2 = {9, 9, 9,9};
        int [] arrOut;

        arrOut = addTwoInts(arr1, arr2);

        for (int digit: arrOut) {
            System.out.print(digit + " ");
        }
    }

    public static int [] addTwoInts (int [] arr1, int [] arr2) {
        int [] arrOut;
        int currentSum;
        int carry = 0;

        if ((arr1==null) || (arr2 == null) ||  (arr1.length != arr2.length)) {

            throw new IllegalArgumentException();
        }

        arrOut = new int[arr1.length + 1];

        for (int i = arr1.length -1; i >= 0; i--) {
            currentSum = arr1[i] + arr2[i] + carry;
            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }
}
