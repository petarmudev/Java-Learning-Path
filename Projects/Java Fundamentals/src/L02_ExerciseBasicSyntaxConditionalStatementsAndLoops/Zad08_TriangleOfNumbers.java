package L02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that receives a number – n and prints a triangle from 1 to n as in the examples.
            Constraints
            •	n will be in the interval [1...20].
        input  output
        1       1


        5       1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
        */
        int inputNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
