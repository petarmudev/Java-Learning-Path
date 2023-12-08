package L04_StacksAndQueuesExercise;

import java.util.*;

public class Task04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        int n = Integer.parseInt(tokens[0]);   //number of elements to enqueue(add)
        int s = Integer.parseInt(tokens[1]);   //number of elements to dequeue(remove/poll)
        int x = Integer.parseInt(tokens[2]);   //check for presence in the queue. If fount ->print true ,
        // else -> print the smallest present

        int[] objects = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Queue<Integer> queue = new ArrayDeque<>();

        //Add N elements to stack
        for (int i = 0; i < n; i++) {   //number of elements to enqueue(add)
            queue.offer(objects[i]);
        }
        //Remove S elements from stack
        for (int i = 0; i < s; i++) {   //number of elements to dequeue(remove/poll)
            queue.poll();
        }
        //Check whether X is present in the queue
        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(x)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(queue));
        }

    }
}
