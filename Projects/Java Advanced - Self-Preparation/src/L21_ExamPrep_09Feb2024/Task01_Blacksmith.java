package L21_ExamPrep_09Feb2024;

import java.util.*;

public class Task01_Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> swordTable = new HashMap<>();
        swordTable.put(70, "Gladius");
        swordTable.put(80, "Shamshir");
        swordTable.put(90, "Katana");
        swordTable.put(110, "Sabre");

        Deque<Integer> steelQueue = new ArrayDeque<>();
        Deque<Integer> carbonStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(steelQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(carbonStack::push);

        System.out.println();






    }
}
