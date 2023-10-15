package L17_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads a list of integers. Then until you receive "end",
         you will be given different commands:
        ⦁	Add {number} – add a number to the end of the list
        ⦁	Remove {number} – remove a number from the list
        ⦁	RemoveAt {index} – remove a number at a given index
        ⦁	Insert {number} {index} – insert a number at a given index
        Note: All the indices will be valid!
        When you receive the "end" command, print the final state of the list (separated by spaces).

         */

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")) {
            String command = input[0];
            int givenNumber = Integer.parseInt(input[1]);

            switch (command) {
                case "Add":
                    numbers.add(givenNumber);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(givenNumber));
                    break;
                case "RemoveAt":
                    numbers.remove(givenNumber);
                    break;
                case "Insert":
                    int numberIndex = Integer.parseInt(input[2]);
                    numbers.add(numberIndex, givenNumber);
                    break;
                default:
                    break;
            }

            input = scanner.nextLine().split(" ");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
