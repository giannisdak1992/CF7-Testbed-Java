package gr.aueb.cf.ch4;

import java.io.IOException;

public class CharInputApp {

    public static void main(String[] args) throws IOException {

        int inputChar = ' ';

        System.out.println("Please insert an ASCII char");
        inputChar = System.in.read();

        System.out.println("char: " + (char) inputChar);
        System.out.println("char: " + (int) inputChar);

    }
}
