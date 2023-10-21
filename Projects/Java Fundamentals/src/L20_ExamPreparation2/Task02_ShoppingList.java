package L20_ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // https://judge.softuni.org/Contests/Practice/Index/2031#1

        List<String> shoppingList = Arrays.stream(scanner.nextLine()
                        .split("!"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            String item = commandParts[1];
            switch (command) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;

                case "Unnecessary":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                    }
                    break;

                case "Correct":
                    String newItem = commandParts[2];
                    if (shoppingList.contains(item)) {
                        int indexOfOldItem = shoppingList.indexOf(item);
                        shoppingList.set(indexOfOldItem, newItem);
                    }
                    break;

                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(shoppingList.toString().replaceAll("[\\[\\]]", ""));
    }
}
