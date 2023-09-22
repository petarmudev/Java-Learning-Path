package L02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program to display numbers from given start to given end and their sum.
        All the numbers will be integers.
        On the first line, you will receive the start number, on the second the end number.
         */
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = number1; i <= number2 ; i++) {
            System.out.print(i + " ");
            sum += i;

        }
        System.out.printf("%nSum: %d", sum);
    }
}
