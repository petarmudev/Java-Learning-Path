package L20_ExerciseIteratorsComparators_Task03_StackIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String createInput = scanner.nextLine();
        List<Integer> data = Arrays.stream(createInput.split("\\s+"))
                .filter(s -> !s.equalsIgnoreCase("Push"))
                .map(s -> s.replaceAll(",", "")) // Remove commas
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        CustomStack customStack = new CustomStack(data);
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("END")) {
                break;
            } else if (command.equals("Pop")) {
                if (customStack.getSize() >= -1) {
                    customStack.pop();
                } else {
                    break;
                }
            }
        }
        if (customStack.getSize() > 0) {
            customStack.forEach(System.out::println);
            customStack.forEach(System.out::println);
        }


    }
}
