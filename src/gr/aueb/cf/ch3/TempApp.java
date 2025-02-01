package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μια θερμοκρασία και εμφανίζει κατάλληλο μήνυμα
 */
public class TempApp {

    public static void main(String[] args) {

        int temp;

        boolean isTempBelowZero;
        Scanner in = new Scanner(System.in);


        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTempBelowZero = temp < 0 ;
        System.out.println("Temperature is below zero: " + isTempBelowZero);


    }
}
