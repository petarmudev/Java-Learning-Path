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

        int totalPeople = people;

        for (int count : wagons) {
            totalPeople += count;
        }
        int totalAboard = totalPeople;
        for (int i = 0; i < wagons.length; i++) {
            if (totalAboard > 4) {
                wagons[i] = 4;
                totalAboard -= 4;
            }else if (totalAboard > 0 ){
                wagons[i]=totalAboard;
                totalAboard = 0;

            }
        }

        if (wagons.length * 4 > totalPeople) {
            System.out.println("The lift has empty spots!");

        } else if (wagons.length * 4 < totalPeople) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", totalAboard);
        }
        for (int peopleAboard : wagons) {
            System.out.print(peopleAboard + " ");
        }
    }
}
