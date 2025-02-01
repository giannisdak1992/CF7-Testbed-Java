package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] copied;

        copied = arrDeepCopy(arr);
        for (int el : copied) {
            System.out.println(el + " ");
        }

    }

    /**
     * it does a fresh copy of an array
     * @param source the source array
     * @return the copied array
     */
    public static int[] arrDeepCopy (int[] source) {
        int [] destination = new int [source.length];

        for (int i = 0 ; i<source.length; i++) {
            destination[i] = source[i];
        }

//        System.arraycopy(source , 0 (start position), destination, 0, source.length);
//        destination = Arrays.copyOf(source (pinakas eisodou), source.length(posa stoixeia));
//        destination = Arrays.copyOfRange(source, 0(start index), source.length(end index -1)); έως length-1
        return destination;
    }
}
