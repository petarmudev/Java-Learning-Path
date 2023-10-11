package L15_ExerciseMethods;

import java.util.Scanner;

public class Task07_NxNMartix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a method that receives a single integer n and prints a N x N matrix with that number.
         */
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    public static void printMatrix(int number) {
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
