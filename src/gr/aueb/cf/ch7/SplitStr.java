package gr.aueb.cf.ch7;

public class SplitStr {

    public static void main(String[] args) {
        String s = "Athens Uni     of Econ    and Business";

        String[] tokes = s.split("\\s +");

        for (String token : tokes) {
            System.out.print(token + " ");
        }
    }
}
