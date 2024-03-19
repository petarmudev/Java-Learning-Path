package L07_Inheritance.Task04_StackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings = new StackOfStrings();

        // Pushing elements onto the stack
        stackOfStrings.push("First");
        stackOfStrings.push("Second");
        stackOfStrings.push("Third");

        // Peeking at the top element
        System.out.println("Top element: " + stackOfStrings.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stackOfStrings.pop());
        System.out.println("Popped element: " + stackOfStrings.pop());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stackOfStrings.isEmpty());

        // Popping the last element
        System.out.println("Popped element: " + stackOfStrings.pop());

        // Trying to pop from an empty stack
        // System.out.println(stack.pop()); // This will throw an exception
    }
}