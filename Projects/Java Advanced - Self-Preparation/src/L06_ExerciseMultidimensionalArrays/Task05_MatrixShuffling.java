package L06_ExerciseMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        String[][] matrix = new String[rows][cols];
        readMatrix(matrix, scanner);
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            if (command.equals("END")) {
                break;
            }
            if (!command.equals("swap") || input.length != 5) {
                System.out.println("Invalid input!");
                continue;
            } else {
                if (isValidInput(rows, cols, input)) {
                    int row1 = Integer.parseInt(input[1]);
                    int col1 = Integer.parseInt(input[2]);
                    int row2 = Integer.parseInt(input[3]);
                    int col2 = Integer.parseInt(input[4]);
                    String itemToSwap = matrix[row1][col1];

                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = itemToSwap;
                    printMatrix(matrix);

                }
            }
        }
    }

    public static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidInput(int rows, int cols, String[] input) {
        int row1 = Integer.parseInt(input[1]);
        int col1 = Integer.parseInt(input[2]);
        int row2 = Integer.parseInt(input[3]);
        int col2 = Integer.parseInt(input[4]);
        if (row1 >= 0 && row1 < rows && col1 >= 0 && col1 < cols && row2 >= 0 && row2 < rows && col2 >= 0 && col2 < cols) {
            return true;
        } else {
            System.out.println("Invalid input!");
            return false;
        }
    }

    private static void readMatrix(String[][] matrix, Scanner scanner) {
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split(" ");
        }
    }
}
