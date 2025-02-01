package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator");
        while (!scanner.hasNextInt()) { //όσο δεν υπάρχει int , state test
            System.out.println("Error. Input must be int. Please insert numerator");
            scanner.nextLine(); // θα πρέπει να καταναλωθεί το λάθος
        }

        numerator = scanner.nextInt();

        System.out.println("Please insert denominator ");
        while (!scanner.hasNextInt()) { //όσο δεν δίνει ο χρήστης int
            System.out.println("Error. Input must be int. Please insert denominator");
            scanner.nextLine(); //
            // Αν υπάρχει int
        }

        denominator = scanner.nextInt();

        if (denominator == 0) {  //state test
            System.out.println("Error. Denominator must be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }
}
