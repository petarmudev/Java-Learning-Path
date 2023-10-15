package L17_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Now we will implement more complicated list commands.
        Again, read a list, and until you receive "end" read commands:
        ⦁	Contains {number} – check if the list contains the number. If yes, print "Yes",
          otherwise, print "No such number"
        ⦁	Print even – print all the numbers that are even separated by a space
        ⦁	Print odd – print all the numbers that are oddly separated by a space
        ⦁	Get sum – print the sum of all the numbers
        ⦁	Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="

         */
//        List<Integer> numbers = Arrays.stream(scanner.nextLine()
//                        .split(" "))
//                        .map(Integer::parseInt)
//                        .collect(Collectors.toList());

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {
            String command = input[0];
            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(input[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    String secondCommand = input[1];
                    if (secondCommand.equals("even")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();

                    } else if (secondCommand.equals("odd")) {
                        for (Integer number : numbers) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case "Get":
                    secondCommand = input[1];
                    if (secondCommand.equals("sum")) {
                        int totalSum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            totalSum += numbers.get(i);
                        }

                        System.out.println(totalSum);
                    }
                    break;

                case "Filter":                  // Filter <= 100  // '<', '>', ">=", "<="
                    secondCommand = input[1];
                    int commandNumber = Integer.parseInt(input[2]);
                    switch (secondCommand) {
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < commandNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > commandNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) >= commandNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= commandNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;

                        default:
                            break;
                    }
                    break;
            }
            input = scanner.nextLine().split(" ");
        }
    }
}