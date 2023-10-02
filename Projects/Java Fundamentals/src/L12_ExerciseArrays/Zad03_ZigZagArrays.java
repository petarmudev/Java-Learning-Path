package L12_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] arrayOne = new int[rows];
        int[] arrayTwo = new int[rows];

        for (int i = 0; i < arrayOne.length; i++) {
            String [] input = scanner.nextLine().split(" ");
            int number1 = Integer.parseInt(input[0]);
            int number2 = Integer.parseInt(input[1]);
            if (i % 2 == 0) {
                arrayTwo[i] = number2;
                arrayOne[i] = number1;
            }else {
                arrayOne[i] = number2;
                arrayTwo[i] = number1;
            }

        }
        for (int number:arrayOne) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number:arrayTwo) {
            System.out.print(number + " ");
        }
    }
}
