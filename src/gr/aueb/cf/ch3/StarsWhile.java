package gr.aueb.cf.ch3;

/**
 * print 10 horizontal stars
 */

public class StarsWhile {

    public static void main(String[] args) {
        int i = 1;
        int j = 10;

        while (i <= 10) {
            System.out.printf("*");
            i++;
        }
        System.out.println();
        while (j >= 1) {
            System.out.printf("*");

            j--;
        }
    }
}
