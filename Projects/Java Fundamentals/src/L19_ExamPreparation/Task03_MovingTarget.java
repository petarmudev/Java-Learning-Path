package L19_ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Link: https://judge.softuni.org/Contests/Practice/Index/2305#2
         */

        List<Integer> targets = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            int index = Integer.parseInt(commandParts[1]);
            int value = Integer.parseInt(commandParts[2]);
            switch (command) {
                case "Shoot":
                    if (isInside(targets, index)) {
                        targets.set(index, (targets.get(index) - value));
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }

                    break;

                case "Add":
                    if (isInside(targets, index)) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    int leftIndex = index - value;
                    int rightIndex = index + value;
                    if (isInside(targets, leftIndex) && isInside(targets, rightIndex)) {
                        for (int i = leftIndex; i <= rightIndex; i++) {
                            targets.remove(leftIndex);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;

                default:
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join("|", targets.stream()
                .map(String::valueOf).collect(Collectors.toList())));
    }

    public static boolean isInside(List<Integer> list, int index) {
        return index >= 0 && index < list.size();
    }
}
