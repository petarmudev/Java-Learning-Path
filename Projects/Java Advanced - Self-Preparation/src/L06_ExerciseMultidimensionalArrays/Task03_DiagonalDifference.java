package L06_ExerciseMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];
        readMatrix(matrix, scanner);

        int primaryDiagonalSum = getPrimaryDiagonal(matrix);
        int secondaryDiagonalSum = getSecondaryDiagonal(matrix);

        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }

    private static int getPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            sum += matrix[r][r];
        }
        return sum;
    }

    private static int getSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        int c = matrix.length - 1;
        for (int r = 0; r < matrix.length; r++) {
            sum += matrix[r][c];
            c--;
        }
        return sum;
    }

    private static void readMatrix(int[][] matrix, Scanner scanner) {
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
