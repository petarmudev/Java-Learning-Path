package L21_ExamPrep_10Feb2022;

import java.util.Scanner;
public class Task02_CookingJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        //Fill the matrix and (my)S location
        int myRow = -1;
        int myCol = -1;
        for (int row = 0; row < size; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = input[col];
                if (matrix[row][col] == 'S') {
                    myRow = row;
                    myCol = col;
                }
            }
        }
        int sum = 0;
        while (true) {
            String command = scanner.nextLine();
            //Clear the current position
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
                default:
                    break;
            }
            if (myRow < 0 || myRow > size - 1 || myCol < 0 || myCol > size - 1) {
                break;
            }
            char digit = matrix[myRow][myCol];
            if (Character.isDigit(digit)) {
                sum += Integer.parseInt(String.valueOf(digit));
            }
            boolean isPillar = matrix[myRow][myCol] == 'P';
            if (isPillar) {
                matrix[myRow][myCol] = '-';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'P') {
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
        //Out from the while cycle
        if (sum >= 50) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        } else {
            System.out.println("Bad news! You are out of the pastry shop.");
        }
        System.out.printf("Money: %d%n", sum);
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }
}
