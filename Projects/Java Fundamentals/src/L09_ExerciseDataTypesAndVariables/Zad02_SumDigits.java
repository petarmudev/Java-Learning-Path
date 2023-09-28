package L09_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You will be given a single integer. Your task is to find the sum of its digits.
            Examples
            Input	Output
            245678	32
            97561	28
            543	12
         */

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
