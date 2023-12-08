package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task03_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 0) {
            System.out.println(0);
        } else {
            while (input != 0) {
                stack.push(input % 2);
                input /= 2;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }
    }
}
