package gr.aueb.cf.ch17.callbacks;

public class Main2 {
    public static void main(String[] args) {

        doPrint(() -> System.out.println("Hello World")); //implementing print()

        doPrint(() -> System.out.println("Hello Coding"));

    }

    public static void doPrint(Printable printable) { //it's like passing print from Printable
        printable.print();
    }
}
