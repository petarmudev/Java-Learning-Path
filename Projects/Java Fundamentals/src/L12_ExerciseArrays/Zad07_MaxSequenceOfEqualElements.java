package L12_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that finds the longest sequence of equal elements in an array of integers.
        If several longest sequences exist, print the leftmost one.

        Input                       Output
        2 1 1 2 3 3 2 2 2 1	        2 2 2
        -----------------------------------
        1 1 1 2 3 1 3 3	            1 1 1
        -----------------------------------
        4 4 4 4	                    4 4 4 4
        -----------------------------------
        0 1 1 5 2 2 6 3 3	        1 1

         */
        String[] string = scanner.nextLine().split(" ");

        String element = string[0];
        int lenght = 1;
        int startIndex = 0;
        int maxLenght = 1;
        int bestStartIndex = 0;
        //  ["1 1 1 2 3 1 3 3"]
        for (int i = 0; i < string.length - 1; i++) {
            element = string[i];
            if (element.equals(string[i + 1])) {
                lenght++;

            } else {
                lenght = 1;
                startIndex = i + 1;

            }
            if (lenght > maxLenght) {
                maxLenght = lenght;
                bestStartIndex = startIndex;

            }
        }
        for (int i = bestStartIndex; i < bestStartIndex + maxLenght; i++) {
            System.out.printf(string[i] + " ");
        }
    }
}
