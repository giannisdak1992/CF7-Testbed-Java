package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει απο τον χρήστη 1 ποσό σε Ευρώ και τα μετατρέπει σε Δολλάρια
 * Η ισοτιμία είναι 99 cent = 1 ευρώ
 */

public class EuroUsdConverter {

    public static void main(String[] args) {

        // Δηλώσεις και αρχικοποιήσεις
        int inputEuros = 0;
        int totalUSACents = 0;
        int usaDollars = 0;
        int usaCents = 0 ;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        // Εντολές
        System.out.println("Please insert an integer amount (Euro)");

        inputEuros = in.nextInt();
        totalUSACents = inputEuros * PARITY;
        usaDollars = totalUSACents / 100;
        usaCents = totalUSACents % 100;
        System.out.printf("%d \u20AC = %d \u0024 , %d usa cents\n", inputEuros, usaDollars, usaCents);

    }
}
