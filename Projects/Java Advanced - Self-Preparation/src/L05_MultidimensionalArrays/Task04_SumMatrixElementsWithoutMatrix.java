package L05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_SumMatrixElementsWithoutMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][cols];
        int totalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            int sum = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();
            totalSum += sum;
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(totalSum);


    }
}
