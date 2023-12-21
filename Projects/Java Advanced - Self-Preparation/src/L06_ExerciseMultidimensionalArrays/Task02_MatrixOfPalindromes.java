package L06_ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class Task02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        String[][] matrix = new String[rows][cols];

        fillPalindromeMatrix(matrix);
        printMatrix(matrix);
    }

    public static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillPalindromeMatrix(String[][] matrix) {
        char startChar = 'a';
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.valueOf("" + (char) (startChar + row) + (char) (startChar + row + col) + (char) (startChar + row));
                //matrix[row][col] = ((char) (startChar + row) + (char) (startChar + row + col) + (char) (startChar + row) + "");
            }
        }
    }
}
