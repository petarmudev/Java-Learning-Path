package L12_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad05_TopIntegers {
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
        int maxNumber = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                index = i;
            }

        }
        for (int i = index; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
