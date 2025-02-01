package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * copy line by line to a new file
 */

public class BufferReaderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //Δημιουργία stringbuilder για την αποθήκευση γραμμών του αρχείου

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\osfp_\\OneDrive\\Υπολογιστής\\bf-read.txt"))) {
            String line = "";

            while (( line = bf.readLine() ) != null ) { //διαβάζουμε το αρχείο γραμμή - γραμμή έως το τέλος
                sb.append(line).append("\n"); //πρσθέτουμε τη γραμμή στο stringbuilder και προσθέτουμε το νέο χαρακτήρα γραμμής
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
