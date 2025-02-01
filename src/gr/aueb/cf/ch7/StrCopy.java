package gr.aueb.cf.ch7;

/**
 * Τα strings είναι immutable και δεν επηρεάζει
 * το αντίγραφο της αναφοράς
 * Οπότε έχουμε έγκυρο copy
 */
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;
        System.out.printf("%s",s1);
        System.out.println();
        System.out.printf("%s", s2);
    }
}
