package gr.aueb.cf.ch15;

public class SpeakingSchool {
    private final Cat cat = new Cat(); //δεν μπορεί να ξαναγίνει new η αναφορά

    public SpeakingSchool () {

    }

    public void learnToSchool() {
        cat.speak();
    }
}
