package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο Χρήστης θα δώσει ένα όριο (20)
 * και θα πρέπει να μετρήσεί όλους τους άρτιους
 */

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = in.nextInt();

        while ( i <= inputNum ){
            sum += i;
            i += 2;
        }
        //sum

        System.out.println("The sum of Even numbers up to " + inputNum  + " is equal to: " + sum);
    }
}
