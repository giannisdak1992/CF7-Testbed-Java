package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δίνει
 * 1. τους συνολικούς βαθμούς μαθημάτων
 * 2. το πλήθος των μαθημάτων
 * Το πρόγραμμα θα υπολογίζει το
 * 1. Μέσο όρο
 * 2. Θα χαρακτηρίζει με Άριστα αν ΜΟ>=9
 * 3. Πολύ καλά αν ο μ.ο είναι >=7
 * 4. Καλός αν ο μ.ο είναι >=5
 * 5. Αποτυχία αν ο μ.ο είναι <5
 */
public class GradesApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = in.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero");
            System.exit(1);
        }

        System.out.println("Please insert courses count");
        coursesCount = in.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error, the average must be less or equal to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if ( average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }
    }
}
