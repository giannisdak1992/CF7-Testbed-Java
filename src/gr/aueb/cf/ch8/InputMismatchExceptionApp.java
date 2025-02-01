package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        while (true) {

            try {
                System.out.println("Please insert an int");
                inputNum = in.nextInt();
                if (inputNum == 12) break; //βγαίνουμε απ το βρόχο αν ο χρήστης δώσει 12
                System.out.println("Input number: " + inputNum);
            } catch (InputMismatchException e) { //σε περιπτωση που ο χρήστης δώσει κατι άλλο πέρα απο int
                in.nextLine(); // cleaning the buffer, απορρίπτεται ότι μη έγκυρο διαβάστηκε απ τον Scanner, και ξαναγυρνάμε πισω για να διαβάσουμε νέα τιμή
                System.out.println("Error in input, please insert an int");
            }
        }
    }
}
