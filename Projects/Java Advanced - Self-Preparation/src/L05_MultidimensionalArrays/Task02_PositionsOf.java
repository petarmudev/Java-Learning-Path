package L05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            int[] arr = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        int specialNum = Integer.parseInt(scanner.nextLine());
        boolean notFound = true;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == specialNum) {
                    System.out.println(row + " " + col);
                    notFound = false;
                }
            }
        }
        if (notFound) {
            System.out.println("not found");
        }
    }
}
