package L20_ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commandParts = input.split(" - ");
            String command = commandParts[0];
            String item = commandParts[1];
            switch (command) {
                case "Collect":
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                    break;

                case "Drop":
                    inventory.remove(item);
                    break;

                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    if (inventory.contains(oldItem)) {
                        inventory.add(inventory.indexOf(oldItem) + 1, newItem);
                    }
                    break;

                case "Renew":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                        inventory.add(item);
                    }
                    break;

                default:
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
