package gr.aueb.cf.ch4;

/**
 * print chars
 */

public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '8';

        System.out.println("Char: " + ch1 + " Ordinal " + (int) ch1);
        System.out.println("Char: " + ch2 + " Ordinal " + (int) ch2);

        System.out.printf("Char: %s, Ordinal: %d\n", ch1, (int) ch1);
        System.out.printf("Char: %s, Ordinal: %d\n", ch2, (int) ch2);


    }
}
