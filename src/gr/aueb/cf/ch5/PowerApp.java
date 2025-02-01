package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {

        for (int b = 1, p=1; p <=10; b++, p++) {
            System.out.printf("%,d\n", pow(b, p));
        }
//        long result;
//        long a;
//        long n;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Give me the base a and the power n");
//        a = scanner.nextLong();
//        n = scanner.nextLong();
//        result = pow(a , n);
//        System.out.println("Result: " + result);

    }

    public static long pow(long a, long n) {

//        long result = 1;
//        for (int i = 1; i<= n; i++) {
//            result *= a;
//        }
//
//        return result;

        return (long) Math.pow(a, n);
    }
}
