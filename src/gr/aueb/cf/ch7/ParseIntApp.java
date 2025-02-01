package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Μετατρέπει έναν String σε ακέραιο
 */
public class ParseIntApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert an int");
        s = scanner.nextLine();

        num = Integer.parseInt(s);
        System.out.println(num);
    }
}
