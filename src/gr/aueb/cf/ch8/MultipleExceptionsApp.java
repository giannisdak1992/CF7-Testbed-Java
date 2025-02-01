package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File ("C:\\Users\\osfp_\\OneDrive\\Υπολογιστής\\file7.txt");

        try (Scanner in = new Scanner(file)){
            char ch = (char)System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IOException " + e.getMessage());
        } catch (Exception e) { //apo to eidiko sto geniko exception
            System.err.println("Generic Exception");
            e.printStackTrace();
        }
    }
}
