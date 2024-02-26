package L04_Exercise_WorkingWithAbstraction.Task06_GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safeDeposit = scanner.nextLine().split("\\s+");

        Map<String, Map<String, Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < safeDeposit.length; i += 2) {
            String name = safeDeposit[i];
            long amount = Long.parseLong(safeDeposit[i + 1]);

            String itemType = getItemType(name);

            if (itemType.isEmpty() || exceedsCapacity(bagCapacity, bag, amount)
                    || incorrectItemInput(itemType, bag, amount)) {
                continue;
            }

            bag.putIfAbsent((itemType), new LinkedHashMap<>());

            bag.get(itemType).putIfAbsent(name, 0L);

            bag.get(itemType).put(name, bag.get(itemType).get(name) + amount);

        }

        printBag(bag);
    }

    private static boolean exceedsCapacity(long bagCapacity, Map<String, Map<String, Long>> bag, long amount) {
        return bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + amount;
    }

    private static boolean incorrectItemInput(String itemType, Map<String, Map<String, Long>> bag, long amount) {
        switch (itemType) {
            case "Gem":
                if (!bag.containsKey(itemType)) {
                    if (bag.containsKey("Gold")) {
                        if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (bag.get(itemType).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
                break;
            case "Cash":
                if (!bag.containsKey(itemType)) {
                    if (bag.containsKey("Gem")) {
                        if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (bag.get(itemType).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
                break;
        }
        return false;
    }

    private static String getItemType(String name) {
        String itemType = "";

        if (name.length() == 3) {
            itemType = "Cash";
        } else if (name.toLowerCase().endsWith("gem") && name.length() >= 4) {
            itemType = "Gem";
        } else if (name.equalsIgnoreCase("gold")) {
            itemType = "Gold";
        }
        return itemType;
    }

    private static void printBag(Map<String, Map<String, Long>> bag) {
        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();
            System.out.printf("<%s> $%s%n", x.getKey(), sumValues);
            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }
    }
}