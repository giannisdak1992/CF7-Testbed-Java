package gr.aueb.cf.ch14.services;

public class CodingFactorySingleton {
    /**
     * το INSTANCE όσες φορές κληθεί θα δείχνει στο ίδιο ακριβώς INSTANCE - Immutability
     */
    /**Eager - με το που γίνεται το class load δημιουργείται το instance*/
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton(); //it will be called by the static factory (getInstance())

    private CodingFactorySingleton () {

    }

    public static CodingFactorySingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
