package L06_ExerciseMultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task07_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        List<List<Integer>> matrix = new ArrayList<>();

        fillMatrix(matrix, rows, cols);

        while (true) {
            String input = scanner.nextLine();
            if ("Nuke it from orbit".equals(input)) {
                break;
            }
            int[] targetArgs = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int targetRow = targetArgs[0];
            int targetCol = targetArgs[1];
            int radius = targetArgs[2];

            for (int row = targetRow - radius; row <= targetRow + radius; row++) {
                if (isInsideMatrix(matrix, row, targetCol)) {
                    matrix.get(row).set(targetCol, 0);
                }
            }
            for (int col = targetCol - radius; col <= targetCol + radius; col++) {
                if (isInsideMatrix(matrix, targetRow, col)) {
                    matrix.get(targetRow).set(col, 0);
                }
            }

            for (int row = 0; row < matrix.size(); row++) {
                List<Integer> currentRow = matrix.get(row);
                currentRow.removeAll(List.of(0));

                if (matrix.get(row).size() == 0) {
                    matrix.remove(row);
                    row--;
                }
            }
        }
        printMatrix(matrix);
    }

    private static boolean isInsideMatrix(List<List<Integer>> matrix, int row, int col) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            row.forEach(e -> System.out.print(e + " "));
            System.out.println();
        }
    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int count = 1;
        for (int r = 0; r < rows; r++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int c = 0; c < cols; c++) {
                numbers.add(count++);
            }
            matrix.add(numbers);
        }
    }
}
