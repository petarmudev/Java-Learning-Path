package L12_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad05_TopIntegersV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program to find all the top integers in an array. A top integer is an integer that is
         bigger than all the elements to its right.

        Input	                Output
        1 4 3 2	                4 3 2
        ------------------------------
        14 4 3 19 15 17	        24 9 17
        ------------------------------
        27 9 42 2 13 45 48	    48
        */
        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            boolean isBigger = true;
            for (int indexNext = index + 1; indexNext <= numbers.length - 1; indexNext++) {
                int currentNextNumber = numbers[indexNext];
                if (currentNumber <= currentNextNumber) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNumber + " ");
            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
