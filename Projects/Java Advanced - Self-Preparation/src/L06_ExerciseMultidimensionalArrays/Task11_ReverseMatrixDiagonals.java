package L06_ExerciseMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arraySize = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = arraySize[0];
        int cols = arraySize[1];

        int[][] matrix = new int[rows][cols];

        readMatrix(matrix, scanner);

        printReversedDiagonalMatrix(matrix);
    }

    private static void printReversedDiagonalMatrix(int[][] matrix) {
        int rowsLenght = matrix.length;
        int colsLenght = matrix[0].length;

        //Print the first part - columns descending part
        for (int c = colsLenght - 1; c > 0; c--) {
            for (int row = rowsLenght - 1, col = c; row >= 0 && col < colsLenght; row--, col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        //Print the second part - rows descending part
        for (int r = rowsLenght - 1; r >= 0; r--) {
            for (int row = r, col = 0; row >= 0 && col < colsLenght; row--, col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
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
