package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat 24%
 */

public class PriceWithVat {

    public static void main(String[] args) {
        final double VAT_RATE = 0.24;
        double wholesale = 0.0;
        double retail = 0.0 ;
        double vat = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the wholesale ");
        wholesale = in.nextDouble();
        vat = wholesale * VAT_RATE;
        retail = vat + wholesale;

        System.out.println("Wholesale: " + wholesale + " Vat: " + vat + ", Retail: " + retail);
    }
}
