package gr.aueb.cf.ch2;

/**
 * Expressions demo
 */

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = num1++; // θα καταχωρηθεί πρώτα το num1=10 στο result και μετα θα γίναι num1 = 11
        result2 = ++num2; // πρώτα το num2 θα γίνει 11 και μετά θα καταχωρηθεί στο result = 11

        System.out.printf("result1: %d\n", result1);
        System.out.printf("result2: %d\n", result2);
        System.out.printf("num1: %d\n",num1);
    }
}
