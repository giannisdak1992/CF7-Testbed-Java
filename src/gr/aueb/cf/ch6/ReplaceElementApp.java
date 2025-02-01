package gr.aueb.cf.ch6;

/**
 * Αντικαθιστά(update) ένα στοιχείο του πίνακα
 * με ένα άλλο
 */
public class ReplaceElementApp {

    public static void main(String[] args) {

    }

    public static void replace (int [] arr, int oldVal, int newVal) {
        int positionToUpdate; // η θέση που θα αναβαθμιστεί το στοιχείο

        positionToUpdate = getPosition(arr, oldVal);
        if (positionToUpdate == -1) {
            return;
        }
        // Αν όμως υπάρχει τότε arr[θέση στην οποία υπάρχει] = newVal
        arr[positionToUpdate] = newVal;
    }

    public static int getPosition (int [] arr, int value) {
        int positionToReturn = -1;

        //Αν δεν βρεθεί το στοιχείο θα επιστρέψουμε -1
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
