package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student(); // invoke default Constructor
        Student bob = new Student(2, "Bob", "D."); //invoke overloaded constructor and inject it values

        bob.setLastname("Dylan");
        //εισαγωγή τιμών
        student.setId(1);                   //student.id =1;
        student.setFirstname("Alice");      //student.firstname = "Alice";
        student.setLastname("w.");          //student.lastname = "W.";

        //διάβασμα τιμών
        System.out.println("Id: " + student.getId());                    // System.out.println("Id: " + student.id);
        System.out.println("Firstname: " + student.getFirstname());     // System.out.println("Firstname: " + student.firstname);
        System.out.println("Lastname: " + student.getLastname());       // System.out.println("Lastname: " +student.lastname);

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("Student instances' count: " + Student.getStudentsCount()); //την καλούμε έτσι γιατί ανήκει στην κλαση η getStudentsCount
        /**
         * η new κάνει χώρο στο heap, καλέι τον constructor() και οταν δεν εχει τυπικες παραμέτρους() ονομάζεται default constructor
         * και αρχικοποιεί τις τιμές (στους ακεραίους το 0, σε Strings και arrays to null)
         * τις boolean σε (false)
         * Η new Student πηγαινει στο heap και δεσμεύσει χώρο για "εναν student"
         * το alice είναι ένας δείκτης προς τα περιεχόμενα
         */

    }
}
