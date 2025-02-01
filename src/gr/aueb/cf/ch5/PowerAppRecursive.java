package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            System.out.println(power(i,i));
        }

    }

    /**
     * a the b
     * n the power
     * @param a
     * @param n
     * @return
     */
    public static long power(int a, int n) {

//        if (n == 0) return 1;
//        return power(a, n-1) * a;

        return (n == 0 ? 1L : power(a, n-1) * a);
    }
}
