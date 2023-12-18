package L05_MultidimensionalArrays;

import java.util.Scanner;

public class Task03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstCharMatrix = new char[rows][cols];
        char[][] secondCharMatrix = new char[rows][cols];

        for (int row = 0; row < firstCharMatrix.length; row++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            firstCharMatrix[row] = line.toCharArray();
        }

        for (int row = 0; row < secondCharMatrix.length; row++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            secondCharMatrix[row] = line.toCharArray();
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char outputSymbol = '*';
                if (firstCharMatrix[r][c] == secondCharMatrix[r][c]) {
                    outputSymbol = firstCharMatrix[r][c];
                }
                System.out.print(outputSymbol + " ");
            }
            System.out.println();
        }
    }
}
