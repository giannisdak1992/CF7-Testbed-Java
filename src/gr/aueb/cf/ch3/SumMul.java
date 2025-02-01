package gr.aueb.cf.ch3;

/**
 * Calculates the sum and the mul of the 10
 * first integers
 */
public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;

            i++;
        }

        System.out.printf("sum = %d , mul = %d", sum, mul);
    }
}
