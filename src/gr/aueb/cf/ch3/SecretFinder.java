package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένας secret integer και ο χρήστης
 * προσπαθεί να τον βρει
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0 ;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret ");
        num = in.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!!");
        } else { //num != secret
            System.out.println("Failure");
        }
    }
}
