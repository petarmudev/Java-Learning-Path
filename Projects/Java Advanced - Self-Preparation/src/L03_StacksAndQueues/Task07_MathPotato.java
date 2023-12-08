package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Task07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> priorityQueuequeue = new PriorityQueue<>();
        String[] children = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());
        for (String child : children) {
            priorityQueuequeue.offer(child);
        }
        int cycle = 1;
        while (priorityQueuequeue.size() > 1) {
            for (int i = 1; i < number; i++) {
                priorityQueuequeue.offer(priorityQueuequeue.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + priorityQueuequeue.peek());
            } else {
                System.out.println("Removed " + priorityQueuequeue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + priorityQueuequeue.poll());
    }


    private static boolean isPrime(int number) {
        // Corner case
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
