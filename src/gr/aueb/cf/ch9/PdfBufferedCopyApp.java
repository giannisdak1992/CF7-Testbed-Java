package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfBufferedCopyApp {

    public static void main(String[] args) {

        //bytes
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;
        //προσθέτω ένα buffered
        byte [] buffer = new byte [8192]; //8kb πίνακας με 8kB
        try (FileInputStream fis = new FileInputStream("C:\\Users\\osfp_\\OneDrive\\Υπολογιστής\\10MB-TESTFILE.ORG.pdf");
             FileOutputStream fos = new FileOutputStream ("C:\\Users\\osfp_\\OneDrive\\Υπολογιστής\\10MB-TESTFILE-COPY.ORG.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1 ) { //o πραγματικός αριθμός των bytes που έχουν διαβαστεί
                fos.write(buffer, 0, b); // γράφουμε απ τα 0 έως το b
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("Το αρχείο με μέγεθος %.1fKB (%d bytes) αντιγράφηκε επιτυχώς\n ", (counter / 1024.0), counter);
            System.out.println("Elapsed Time: " + elapsedTime + " seconds" );
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
