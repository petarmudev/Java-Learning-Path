package L05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = getArray(scanner);

        int rows = dimentions[0];
        int cols = dimentions[0];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = getArray(scanner);

        }
        int biggestSum = Integer.MIN_VALUE;
        int indexRow = 0;
        int indexCol = 0;
        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {
                int currentSubmatrix = matrix[r][c] + matrix[r][c + 1] + matrix[r + 1][c] + matrix[r + 1][c + 1];
                if (currentSubmatrix > biggestSum) {
                    biggestSum = currentSubmatrix;
                    indexRow = r;
                    indexCol = c;
                }
            }
        }
        if (biggestSum > Integer.MIN_VALUE) {
            printSubMatrix(indexRow, indexCol, matrix);
            System.out.println(biggestSum);
        }
    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void printSubMatrix(int r, int c, int[][] matrix) {
        System.out.println(matrix[r][c] + " " + matrix[r][c + 1]);
        System.out.println(matrix[r + 1][c] + " " + matrix[r + 1][c + 1]);
    }
}
