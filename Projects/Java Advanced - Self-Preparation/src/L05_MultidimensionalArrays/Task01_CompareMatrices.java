package L05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);
        boolean areEqual = true;

        if (firstMatrix.length != secondMatrix.length) {
            //System.out.println("not equal");
            areEqual = false;
            //return;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {
                int[] firstArray = firstMatrix[i];
                int[] secondArray = secondMatrix[i];

                areEqual = firstArray.length == secondArray.length;

                if (areEqual) {
                    for (int j = 0; j < firstArray.length; j++) {
                        if (firstArray[j] != secondArray[j]) {
                            areEqual = false;
                            break;
                        }
                    }
                } else {
                    areEqual = false;
                    break;
                }
            }
        }
        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);
//        if (areEqual) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] matrixSize = readArray(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];
        //int[][] secondMatrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] array = readArray(scanner);
            matrix[row] = array;
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
