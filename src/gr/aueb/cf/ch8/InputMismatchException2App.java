package gr.aueb.cf.ch8;

import java.util.Scanner;

public class InputMismatchException2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC = 12;

        while (true) {

            System.out.println("Please insert an int");

            if (in.hasNextInt()) { //θα επιστρέψει true ή false ανάλογα με το τι καταχωρήθηκε στον inputNum
                inputNum = in.nextInt(); //
            } else {
                System.out.println("Please insert a valid int"); //εδω φτάνουμε αν δώσουμε διαφορετική τιμή απο int
                in.nextLine(); // καθαρίζουμε το buffer
                continue; //ξαναγυρνάμε πίσω να διαβάσουμε άλλη τιμή
            }

            if (inputNum == MAGIC) break; //αν όμως δώσαμε int και μάλιστα το 12 τότε βγαινουμε απ τη while
            System.out.println("Input num = " + inputNum); //εκτυπώνεται ο int που δόθηκε
        }
    }
}
