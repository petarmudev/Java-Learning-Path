package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input); // Попълване на стека с функция

        while (stack.size() > 1) {
            int firstNum = Integer.parseInt(stack.pop()); // Integer.valueOf(stack.pop())
            String operator = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            switch (operator) {
                case "+":
                    stack.push(String.valueOf(firstNum + secondNum));
                    break;
                case "-":
                    stack.push(String.valueOf(firstNum - secondNum));
            }
        }
        System.out.println(stack.pop());

    }
}
