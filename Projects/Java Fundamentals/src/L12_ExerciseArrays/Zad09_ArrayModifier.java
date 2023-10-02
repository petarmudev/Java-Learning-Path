package L12_ExerciseArrays;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Arrays;
import java.util.Scanner;

public class Zad09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.contains("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                numbers[index1] = secondIndexNumber;
                numbers[index2] = firstIndexNumber;

            } else if (input.contains("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                numbers[index1] = numbers[index1] * numbers[index2];
            } else if (input.equals("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i]--;
                }
            }
            input = scanner.nextLine();

        }
        /*for (int number:numbers) {
            System.out.printf("%d, ", number);
        }
        System.out.println();
        */
        System.out.println(Arrays.toString(numbers)
                .replace("[", "")
                .replace("]", ""));
    }
}