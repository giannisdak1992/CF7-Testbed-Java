package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ζητάει απο κάποιον την ηλικίας του
 * και ελέγχει αν μπορεί να ψηφίζει ή όχι
 */

public class VoteEligible {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        final int MIN_VOTING_AGE = 18;
        int age = 0;
        boolean isEligible = false;

        System.out.println("What is their age? ");
        age = in.nextInt();
        isEligible = ( age >= MIN_VOTING_AGE);

        System.out.printf("Age: %d is eligible to vote: %b", age, isEligible);

    }
}
