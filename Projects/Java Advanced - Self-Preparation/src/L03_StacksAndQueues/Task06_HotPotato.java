package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] children = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());
        for (String child : children) {
            queue.offer(child);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < number; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
