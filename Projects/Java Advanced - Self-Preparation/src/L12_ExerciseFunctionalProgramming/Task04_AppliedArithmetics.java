package L12_ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task04_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        Function<List<Integer>, List<Integer>> incrementNumbers = list -> list.stream()
                .map(number -> number += 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtract = list -> list.stream()
                .map(number -> number -= 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiply = list -> list.stream()
                .map(number -> number *= 2).collect(Collectors.toList());

        Consumer<List<Integer>> printList = list -> list
                .forEach(number -> System.out.print(number + " "));

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = incrementNumbers.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    printList.accept(numbers);
                    System.out.println();
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
