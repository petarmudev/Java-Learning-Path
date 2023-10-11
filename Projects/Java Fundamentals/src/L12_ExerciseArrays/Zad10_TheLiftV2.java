package L12_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad10_TheLiftV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());

        int[] wagons = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 15
        // 0 0 2 0
        boolean liftFull = true;
        for (int i = 0; i < wagons.length; i++) {
            int freeSpace = 4 - wagons[i];
            if (freeSpace > 0) {
                if (freeSpace > people) {
                    wagons[i] += people;
                    people = 0;
                    liftFull = false;
                } else {
                    wagons[i] = 4;
                    people -= freeSpace;
                }
            }
        }
        if (!liftFull) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
