package gr.aueb.cf.ch6;

public class MyStack {

    static int[] stack = new int[50];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        stack[++top] = num; //για να γίνει απο -1 0
    }

    public static int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return stack[top--];
    }

    public static void printStack() {
       if(isEmpty()){
           System.out.println("Stack is Empty");
       }

       for (int i=0; i<= top; i++){
           System.out.println(stack[i]);
       }
    }

    private static boolean isFull() {
        //το stack ειναι full όταν το top είναι το τελευταίο στοιχείο της στίβας (το οποίο πάντα δείχνει στο τελευταίο)
        return top == stack.length -1;
    }

    private static boolean isEmpty() {
        return top == -1;
    }
}
