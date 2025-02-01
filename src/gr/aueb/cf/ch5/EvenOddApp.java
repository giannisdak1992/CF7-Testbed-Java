package gr.aueb.cf.ch5;

public class EvenOddApp {

    public static void main(String[] args) {

        int num = 5;
        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is odd: " + isOdd(num));

    }

    public static boolean isEven(int num) {
        return  num % 2 == 0;
    }

    /**
     * Delegation desing patter
     * @param num
     * @return
     */
    public static boolean isOdd(int num) {

        //το αντίθετο απο αυτό που επιστρέφει η isEven
        return !isEven(num);
    }
}
