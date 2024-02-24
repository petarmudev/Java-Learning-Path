package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {

        //Stack: Last In First Out - LIFO

        // Push  -  pushes item on top
        // Pop  -   pops(remove) item from the top
        // Peek -   show the topmost item, without removing it

        String input ="10 20 30 40 50";
        String[] tokens = input.split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            stack.push(Integer.parseInt(tokens[i]));
        }
        // Collections.addAll(stack, tokens);  - another option to fill the stack
        stack.push(100);
        stack.pop();
        stack.peek();
        stack.size();
        stack.isEmpty();
        stack.contains(2);
        //----------------------------------------------------------------------------
        //Queue - First In First Out - FIFO

        //Offer (or Add) -   adds element (return false if queue is full -> .add() - throws Exception if queue is full
        //Poll (or Remove) - returns null if queue is empty -> .remove - throws exception if queue is empty
        //Peek - to see/check the FIRST element

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            queue.offer(Integer.parseInt(tokens[i]));
        }
        System.out.println(queue.peek());

        int size = queue.size();
        Integer[] arr = (Integer[]) queue.toArray();
        boolean containsTwo = queue.contains(2);

    }
}
