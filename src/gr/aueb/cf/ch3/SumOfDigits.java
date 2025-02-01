package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ΄Αθροισμα των ψηφίων ενός αριθμού
 * ενός ακεραίου. Για παράδειγμα το άθροισμα
 * του 123 είναι 6
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer");
        inputNum = in.nextInt();

        tempNum = inputNum;
        while ( tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum /= 10;
        }

        System.out.println("The sum of digits of " + inputNum + " is " + sum);
    }
}
