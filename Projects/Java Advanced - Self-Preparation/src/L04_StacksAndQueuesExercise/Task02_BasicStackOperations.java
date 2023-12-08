package L04_StacksAndQueuesExercise;

import java.util.*;

public class Task02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        int count = Integer.parseInt(tokens[0]);
        int pop = Integer.parseInt(tokens[1]);
        int find = Integer.parseInt(tokens[2]);
        Deque<Integer> numbers = new ArrayDeque<>();

        int[] objects = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        //Add N elements to stack
        for (int i = 0; i < count; i++) {
            numbers.push(objects[i]);
        }
        //Remove S elements from stack
        for (int i = 0; i < pop; i++) {
            numbers.pop();
        }

        if (numbers.isEmpty()) {        //Check for empty stack
            System.out.println(0);
        } else if (numbers.contains(find)) {        //Check if X is found in the stack
            System.out.println(true);
        } else {
            System.out.println(Collections.min(numbers));       //Get the smallest element in the stack
        }
    }
}
