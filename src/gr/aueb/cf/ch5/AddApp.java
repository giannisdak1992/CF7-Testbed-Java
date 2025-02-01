package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα 2 ακεραίων με τη χρήση
 * μεθόδων
 */
public class AddApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please insert two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = add(a, b);
        sub = AddApp.sub(a, b);

        System.out.println(sum);
        System.out.println(sub);


    }

    /**
     * add two integers
     * @param a the first parameter
     * @param b the second parameter
     * @return the sum of the two integers
     */



    public static int add (int a, int b) {
//        int result = 0;
//        result = a + b;
//        return result;
        return a + b ;
    }

    /**
     * substract two integers
     * @param a the first integer to substract from
     * @param b the second parameter that is substracted.
     * @return the substraction of the two integers
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}
