package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two integers from the
 * std input (keyboard) and calculates the result
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Eντολές
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτύπωση των αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι %d\n", num1, num2, sum);
    }

}
