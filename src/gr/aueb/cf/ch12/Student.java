package gr.aueb.cf.ch12;

/**
 * Data class
 * POJO (Plain Old Java Objects)
 * Java Bean
 */
//Encapsulation

public class Student { //ορισμός κλάσης
    private static int studentsCount = 0; //ανήκει στην κλάση

    private int id; //δεδομένα
    private String firstname; //δεδομένα
    private String lastname; //δεδομένα

    static {
        studentsCount = 0; //second way storing static variables
    }

    //Default constructor
    public Student() {
        studentsCount++; //μετράει πόσα instances έχουν δημιουργηθεί
    }



    //Overloaded constructor
    public Student (int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

