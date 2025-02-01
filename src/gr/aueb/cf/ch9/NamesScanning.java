package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει απο ένα αρχείο δεδομένα
 */
public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:\\Users\\osfp_\\OneDrive\\Υπολογιστής\\names.txt";
        String outFilePath = "C:\\Users\\osfp_\\OneDrive\\Υπολογιστής\\names-formatted.txt";
        // Reading line by line
        String line;
        //making split
        String[] tokens;

        try (BufferedReader reader = new BufferedReader (new FileReader (inFilePath));
        PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(", +\\s");
                // ps.printf("{ \"Firstname\": \"%s\" , \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens); //αν θέλουμε να τα βλέπουμε στην κονσόλα
           }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\" , \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);

    }
}
