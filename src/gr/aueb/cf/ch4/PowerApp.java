package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates power ^ 2
 */

public class PowerApp {

    public static void main(String[] args) {

        BigInteger bigresult = new BigInteger("1");
        int base = 2;
        int power = 100;
        int result = 1;

        for (int i=1; i<=power; i++) {
            result *= base; //result = result * base
            bigresult = bigresult.multiply(BigInteger.valueOf(base));
        }

        System.out.println("Result: " + result);
        System.out.println("Result: " +bigresult);
    }
}
