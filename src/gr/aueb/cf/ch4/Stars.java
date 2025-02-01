package gr.aueb.cf.ch4;

/**
 * prints different outputs of starts
 */
public class Stars {

    public static void main(String[] args) {

        //οριζόντια αστεράκια
        for (int i = 1; i<=10; i++) {
            System.out.printf("*");
        }

        //κάθετα αστεράκια
        for (int i = 1; i<=10; i++) {
            System.out.println("*");
        }

        //10 * 10 αστεράκια, 10 γραμμές, 10 αστεράκια η κάθε γραμμή
        for (int i = 1; i<=10; i++) {
            for (int j = 1; j<=10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1row: 1 star
        // 2 row: 2 stars
        // 3 row: 3 starts

        //Ascending
        for (int i = 1; i<=10; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }

        //Descending

        for (int i = 1; i<=10; i++) {
            for (int j = 10; j>=i; j--) { //or j=i, j<=10, j++
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
