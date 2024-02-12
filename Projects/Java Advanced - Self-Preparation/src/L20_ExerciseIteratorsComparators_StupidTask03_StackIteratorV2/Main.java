package L20_ExerciseIteratorsComparators_StupidTask03_StackIteratorV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomStack<Integer> customStack = new CustomStack<>();

        Scanner scanner = new Scanner(System.in);
        String commandInput = scanner.nextLine();

        while (!commandInput.equals("END")) {
            String[] tokens = commandInput.split("[,\\s]+");

            if (tokens[0].equals("Push")) {
                for (int i = 1; i < tokens.length; i++) {
                    customStack.push(Integer.parseInt(tokens[i]));
                }
            } else if (tokens[0].equals("Pop")) {
                try {
                    customStack.pop();
                } catch (Exception e) {
                    System.out.println("No elements");
                }
            }

            commandInput = scanner.nextLine();
        }
        if (customStack.iterator().hasNext()) {
            customStack.forEach(System.out::println);
            customStack.forEach(System.out::println);
        }
    }
}
