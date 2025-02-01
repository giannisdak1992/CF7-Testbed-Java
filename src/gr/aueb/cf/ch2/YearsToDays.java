package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (ages) to days
 */
public class YearsToDays {

    public static void main(String[] args) {
        //Δήλωση και εκτύπωση αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int DAYS_TO_YEARS = 365;
        int age= 0;
        int days = 0;

        //Εντολές
        System.out.printf("How old are you? ");
        age = in.nextInt();
        days = age * DAYS_TO_YEARS;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Age in years: " + age + ", Age in days: " + days);
    }
}
