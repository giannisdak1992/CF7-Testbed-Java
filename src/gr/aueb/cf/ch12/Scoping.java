package gr.aueb.cf.ch12;

public class Scoping {
    static int result = 20; //class scope
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a, b);

        System.out.println(result);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        int result = 0; //outer scope, it has access into the inner scope
        if ( b == 0) {
            boolean isZero = true; //block score, inner scope
            System.out.println("Is zero: " +isZero);
        }

        return  a / b;
    }
}
