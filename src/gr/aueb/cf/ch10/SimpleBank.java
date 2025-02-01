package gr.aueb.cf.ch10;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("---Simple Bank Menu ---");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("Choose an option: ");

                try {
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            deposit(-50);
                            break;
                        case 2:
                            withdraw(100);
                            break;
                        case 3:
                            System.out.println("Current balance: $" + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for using Simple Bank. Goodbye!");
                            return;
                        default:
                            System.out.println("Invalid option. Please choose again");
                    }
                } catch (Exception e) {
                    System.out.println("An error happened. Please try again");
                }

            }
        }

        public static void withdraw(double amount) throws Exception{
            try {
                if (amount <= 0 ) { //if balance <= amount
                    throw new Exception("Error.Amount: " + amount + "must not be positive or zero.");
                }

                if (amount > balance) {
                    throw new IllegalArgumentException("Error.Amount: " + amount + " is greater than balance. ");
                }
                balance -= amount; //balance = balance - amount
                System.out.println("Successfully deposited " + amount); //logging δεν μιλάνε με το χρήστη
            } catch(Exception e) {
                System.err.println("Error " + e.getMessage());
                throw e;
            }
        }

        public static void deposit(double amount) throws Exception{
            try {
                if (amount <= 0 ) { //if balance <= amount
                    throw new Exception("Error.Amount: " + amount  + "must not be positive or zero.");
                }
                balance += amount; //balance -=amount
                System.out.println("Successfully deposited " + amount); //logging δεν μιλάνε με το χρήστη
            } catch(Exception e) {
                System.err.println("Error " + e.getMessage());
                throw e;
            }
        }

}
