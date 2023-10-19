package L18_ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads a sequence of numbers and a special bomb number with a certain power.
        Your task is to detonate every occurrence of the special bomb number and according to its power
         - his neighbors from left and right.
        Detonations are performed from left to right, and all detonated numbers disappear.
        Finally, print the sum of the remaining elements in the sequence.
        */

        List<String> elements = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);

        while (elements.contains(bombNumber)) {
            int elementIndex = elements.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {
                elements.remove(i);
            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());

    }
}
