package L06_ExerciseMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine()
                .split("\\(")[1]
                .replaceAll("\\)", ""));
        int rotationAngle = rotation % 360;

        String input = scanner.nextLine();
        List<String> words = new ArrayList<>();
        int maxLenght = Integer.MIN_VALUE;

        while (!"END".equals(input)) {
            if (input.length() > maxLenght) {
                maxLenght = input.length();
            }
            words.add(input);
            input = scanner.nextLine();
        }
        int rows = words.size();
        int cols = maxLenght;

        char[][] matrix = new char[rows][cols];

        fillMatrix(matrix, words);

        rotate(rotationAngle, rows, cols, matrix);
    }

    private static void rotate(int angleRotation, int rows, int cols, char[][] matrix) {
        if (angleRotation == 90) {
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleRotation == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleRotation == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);

                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }

//    private static char[][] rotate90(char[][] matrix, int rows, int cols) {
//        char[][] rotatedMatrix = new char[cols][rows];
//
//        for (int col = 0; col < cols; col++) {
//            int colCounter = 0;
//            for (int row = rows - 1; row >= 0; row--) {
//                rotatedMatrix[col][colCounter++] = matrix[row][col];
//            }
//        }
//        return rotatedMatrix;
//    }

    private static void fillMatrix(char[][] matrix, List<String> words) {
        for (int row = 0; row < matrix.length; row++) {
            String currentWord = words.get(row);
            for (int col = 0; col < matrix[row].length; col++) {
                if (col < currentWord.length()) {
                    matrix[row][col] = currentWord.charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
