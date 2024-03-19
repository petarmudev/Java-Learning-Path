package L04_Exercise_WorkingWithAbstraction.Task05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = createMatrix(scanner);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] peterCoordinates = getPeter(command);
            int[] evilCoordinates = getEvil(scanner);

            moveEvil(evilCoordinates, matrix);

            sum = getHeroSum(peterCoordinates, matrix, sum);

            command = scanner.nextLine();
        }
        System.out.println(sum);
    }

    private static int[] getEvil(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[] getPeter(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static long getHeroSum(int[] peter, int[][] matrix, long sum) {
        int heroRow = peter[0];
        int heroCol = peter[1];

        while (heroRow >= 0 && heroCol < matrix[0].length) {
            if (heroRow < matrix.length && heroCol >= 0) {
                sum += matrix[heroRow][heroCol];
            }
            heroCol++;
            heroRow--;
        }
        return sum;
    }

    private static void moveEvil(int[] evil, int[][] matrix) {
        int evilRow = evil[0];
        int evilCol = evil[1];

        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < matrix.length && evilCol < matrix[0].length) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static int[][] createMatrix(Scanner scanner) {
        int[] dimensions = getEvil(scanner);
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
