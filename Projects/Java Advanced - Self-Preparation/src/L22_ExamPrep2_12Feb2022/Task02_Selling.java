package L22_ExamPrep2_12Feb2022;

import java.util.Scanner;

public class Task02_Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];
        int myRow = -1;
        int myCol = -1;
        for (int row = 0; row < size; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = input[col];
                if (input[col] == 'S') {
                    myRow = row;
                    myCol = col;
                }
            }
        }
        int sum = 0;
        while (true) {
            String command = scanner.nextLine();
            matrix[myRow][myCol] = '-';
            switch (command) {
                case "left":
                    myCol--;
                    break;
                case "right":
                    myCol++;
                    break;
                case "up":
                    myRow--;
                    break;
                case "down":
                    myRow++;
                    break;
            }
            if (myRow < 0 || myRow > size - 1 || myCol < 0 || myCol > size - 1) {
                break;
            }
            char digit = matrix[myRow][myCol];
            if (Character.isDigit(digit)) {
                sum += Integer.parseInt(String.valueOf(digit));
            }
            boolean isPillar = matrix[myRow][myCol] == 'O';
            if (isPillar) {
                matrix[myRow][myCol] = '-';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'O') {
                            myRow = row;
                            myCol = col;
                            matrix[row][col] = '-';
                        }
                    }
                }
            }
            //Place the S before the eventual brake from the sum check
            matrix[myRow][myCol] = 'S';
            if (sum >= 50) {
                break;
            }
        }
        if (sum < 50) {
            System.out.println("Bad news, you are out of the bakery.");
        } else {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }
        System.out.printf("Money: %d%n", sum);
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }
}
