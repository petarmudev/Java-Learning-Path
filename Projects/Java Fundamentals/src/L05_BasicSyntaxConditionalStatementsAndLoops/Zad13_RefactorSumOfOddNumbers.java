package L05_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        You are assigned to find and fix the bugs in an existing piece of code, using the debugger.
        You should trace the program execution to find the lines of code that produce incorrect or unexpected results.
        You are given a program (existing source code) that prints the next n odd numbers (starting from 1) and on the last row,
        prints the sum of them.

         */
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
