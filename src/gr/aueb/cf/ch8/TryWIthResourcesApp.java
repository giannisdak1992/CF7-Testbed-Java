package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWIthResourcesApp {
    public static void main(String[] args) {
        int num = 0;

        try (Scanner in = new Scanner(System.in)){ //kleinei edw o scanner eite ginei to try eite to catch
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
