package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream( new FileOutputStream("C:\\Users\\osfp_\\OneDrive\\Υπολογιστής\\file7-ps.txt", true), true, StandardCharsets.UTF_8)) {
            printMessage(ps, "Hello Coding Factory");
            //printMessage(System.out, "Hello CF!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Generic PrintStream method
     * @param ps
     * @param message
     */
    public static void printMessage (PrintStream ps, String message) {
        ps.println(message);
    }
}
