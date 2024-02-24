package L21_ExamPrep_09Feb2024;

import java.util.*;
import java.util.stream.Collectors;

public class Task01_Blacksmith {
    public static void main(String[] args) {

        //https://judge.softuni.org/Contests/Practice/Index/3402#0

        Map<Integer, String> swordTable = new HashMap<>();
        swordTable.put(70, "Gladius");
        swordTable.put(80, "Shamshir");
        swordTable.put(90, "Katana");
        swordTable.put(110, "Sabre");

        Deque<Integer> steelQueue = new ArrayDeque<>();
        Deque<Integer> carbonStack = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        //Queue: offer  poll  peek
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(steelQueue::offer);

        //Stack: push   pop   peek
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(carbonStack::push);

        Map<String, Integer> forgedSwords = new TreeMap<>();

        while (!steelQueue.isEmpty() && !carbonStack.isEmpty()) {
            Integer steel = steelQueue.poll();
            Integer carbon = carbonStack.pop();
            Integer forgedValue = steel + carbon;

            if (swordTable.containsKey(forgedValue)) {
                String sword = swordTable.get(forgedValue);
                forgedSwords.putIfAbsent(sword, 0);
                forgedSwords.put(sword, forgedSwords.get(sword) + 1);
            } else {
                carbon += 5;
                carbonStack.push(carbon);
            }
        }
        if (forgedSwords.isEmpty()) {
            System.out.println("You did not have enough resources to forge a sword.");
            //PrintSteelDeque
            printDeque(steelQueue, "Steel left: %s%n");
            //PrintCarbonDeque
            printDeque(carbonStack, "Carbon left: %s%n");
        } else {
            System.out.printf("You have forged %d swords.%n", forgedSwords.values()
                    .stream()
                    .mapToInt(e -> e)
                    .sum()); //IntStream -> to have .sum() function
            //PrintSteelDeque
            printDeque(steelQueue, "Steel left: %s%n");
            //PrintCarbonDeque
            printDeque(carbonStack, "Carbon left: %s%n");
            //Print the swords
            forgedSwords.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }

    private static void printDeque(Deque<Integer> deque, String format) {
        if (deque.isEmpty()) {
            System.out.printf(format, "none");
        } else {
            System.out.printf(format, deque.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
    }
}
