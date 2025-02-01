package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Read a char as a byte
 */

public class CharInApp {

    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        //διαβάζει int η System.in.read() και χρεάζεται (char) για να το μετατρέψει σε char
        // ch = (char)System.in.read();

        //διαβάζει και UTF-16 η charAt
        ch = scanner.nextLine().charAt(0);
        System.out.printf("%c\n", ch);
        String s1 = "Bob";
        String s2 = "Alice";
        s2 = s1 + s2;
        System.out.println(s2);
    }
}
