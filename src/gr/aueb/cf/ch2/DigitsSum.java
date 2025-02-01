package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * να λαμβάνει απο τον χρήστη έναν διψήφιο ακέραιο
 * και να υπολογίζει το άθροισμα των ψηφίων του
 * Για παράδειγμα αν ο χρήστης δώσει τον ακέραιο 15
 * θα πρέπει να πάρει το αποτέλεσμα να είναι 1 + 5 = 6
 */
public class DigitsSum {

    public static void main(String[] args) {
        int inputNum;
        int leftPart;
        int rightPart;
        int sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Give me a double digit integer number");

        inputNum = in.nextInt();
        leftPart = inputNum / 10;
        rightPart = inputNum % 10;
        sum = leftPart + rightPart;

        System.out.printf("Input num = %d, LeftDigit = %d, RightDigit = %d, sum = %d\n",inputNum, leftPart, rightPart, sum);
    }
}
