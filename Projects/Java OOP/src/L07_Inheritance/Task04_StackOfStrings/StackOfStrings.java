package L07_Inheritance.Task04_StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    // Method to pop an item from the stack
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.remove(data.size() - 1);
    }

    // Method to peek at the top item of the stack
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.get(data.size() - 1);
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
