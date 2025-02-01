package gr.aueb.cf.ch10;

public class StackApp {

    static int[] myStack = new int [50];
    static int top = -1; //δειχνει πάντα στο τελευταίο στοιχείο της στίβας

    public static void main(String[] args) {
        int num;

        try {
            push(1);
            push(20);
            push(3);
            num = pop();
//            System.out.println("Popped num: " + num);
            printStack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void push (int num) throws Exception{
        try {
            if (isFull() ) throw new Exception("Error. Stack is full");
            //or top++;
            //myStack[top];
            myStack[++top] = num; //για να γίνει απο -1 μηδέν και να μπει ο πρωτος αριθμός στο myStack[0]
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static int pop() throws Exception{
        try {
            if (isEmpty()) throw new Exception("Error. Stack is empty");
            return myStack[top--]; //επιστρέφει το τελευταίο στοιχείο και κάνει τον top = top - 2, άρα θα δείχνει στο προ τελευταίο στοιχείο
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static boolean isEmpty() {
        return top == -1; //τότε είναι empty ο πίνακας
    }

    public static boolean isFull() {
        return  top == myStack.length -1; //όταν ο top δείχνει στο τελευταίο (myStack.length - 1)
    }

    public static void printStack () throws Exception{
        try {
            if (isEmpty()) {
                throw new Exception("Stack is Empty");
            }
//            for (int i = 0; i<= top; i++) {
//                System.out.print(myStack[i] + " ");
//            }
            for (int i = top; i>=0; i--) { //ο top δείχνει στο τελευταίο γεμάτο στοιχείο
                System.out.print(myStack[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }
}
