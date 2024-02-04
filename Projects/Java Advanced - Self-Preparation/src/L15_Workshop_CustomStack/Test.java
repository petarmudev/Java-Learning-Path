package L15_Workshop_CustomStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();

        for (int i = 0; i < 6; i++) {
            customStack.push(i);
        }
        System.out.println(customStack.pop());

        customStack.forEach(System.out::println);
    }
}
