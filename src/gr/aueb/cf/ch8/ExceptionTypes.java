package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {

    }

    /**
     * System.in.read() throws IOException
     * Since a checked exception is thrown, it has
     * to be explicitly to be thrown in method signature
     * Or it has to be caught in catch {}
     * This type of exception / method happens when we don't need
     * to handle the exception
     * Is this meaningful? No. Ideally we want to handle
     * the exception and not only propagate them
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char)System.in.read();
    }

    /**
     * If we catch the exception, there in no need for throws in the signature
     * and the exception does not propagate. Is it a good practice to not propagate?
     * If there is a caller(method) then we have to propagate
     * If there is client(user) then we don't have to propagate the exception
     * @return
     */
    public static char readAnotherChar() {
        try {
            return (char)System.in.read();

        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

    /**
     * in this type of method exception, we take action (eg logging)
     * and also rethrow the exception to propagate to the caller
     * the exception will get to the main
     * @return
     * @throws IOException
     */
    public static char readAnotherOneChar() throws IOException {
        try {
            return (char)System.in.read();

        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readAgainOneChar (char ch) throws IOException, IllegalArgumentException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit"); //logical exception
            return inputChar;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println((e.getMessage()));
            throw e;
        }
//        } catch (IllegalArgumentException ex1) { //unchecked exception
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//
//        }
    }
}
