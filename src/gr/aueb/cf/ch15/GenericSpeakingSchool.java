package gr.aueb.cf.ch15;

public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable; //can be whatever is iSpeakable, not only cats as SpeakingSchool does. We inject whatever is Ispeakable

    /**
     * Dependecy Injection (DI) - IoC - Inversion of Control
     * @param iSpeakable
     */
    public GenericSpeakingSchool(ISpeakable iSpeakable) { //costructor makes dependecy injection
        this.iSpeakable = iSpeakable;
    }

    public void learnToSpeak() {
        iSpeakable.speak();
    }
}
