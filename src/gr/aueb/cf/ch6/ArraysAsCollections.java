package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int [] arr = {1, 5, 7, 9};

    }

//filtering
    public static int[] getEvens(int[] arr) {

        //Θέλουμε να δουμε πρωτα ποσοι άρτιοι είναι για να ξέρουμε το μέγεθος
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                count++;
            }
        }
        // ο πινακας με τους άρτιους θα είναι διάστασης count
        int[] evens = new int[count];

        //μετρητής pivot για να έχω evens[0], evens[1] σε κάθε στοιχείο που θα βρίσκει
        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                evens[pivot++] = el;

            }
        }
        return evens;

    }

//mapping
    public static int[] mapToDouble(int [] arr) {

        int [] mapped = new int [arr.length];

        for (int i = 0; i< arr.length; i++) {
            mapped[i] = 2 * arr[i];
        }

        return mapped;
    }

//reducing
    public static int sum(int [] arr) {
        int sum = 0;

        for(int el: arr) {
            sum += el;
        }

        return sum;
    }


    //average
    public static double avg(int [] arr) {
        return ( sum(arr) / (double)arr.length);
    }

    //at least one even

    public static boolean anyEven(int [] arr) {
        boolean isAnyEven = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 ==0) {
//                isAnyEven = true;
//                break;
//            }
//        }

        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }

        return isAnyEven;
    }

    //more than 2 evens

    public static boolean moreThanTwoEvens(int[] arr) {

        int count = 0;

        for (int el:arr) {
            if (el % 2 == 0) {
                count++;
            }
        }

        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) { //για να είμαστε εντος όταν παμε arr[i+2] να πάρουμε arr[arr.length -1] το τελευταίο στοιχείο
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }
        //        for (int i = 0; i < arr.length; i++) {
//            endings[arr[i] % 10]++;
//        }

        for (int count : endings) {
            if (count > 2 ) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEven(int [] arr) {
//        return  getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;
        for (int el: arr) {
            if (el % 2 == 0) {
                count++;
            }
        }

        return count == arr.length;
    }
}

