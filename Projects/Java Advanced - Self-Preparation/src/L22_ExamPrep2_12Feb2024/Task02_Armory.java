package L22_ExamPrep2_12Feb2024;

import java.util.Scanner;

public class Task02_Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        int myRow = -1;
        int myCol = -1;
        for (int row = 0; row < matrix.length; row++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input[col];
                if (input[col] == 'A') {
                    myRow = row;
                    myCol = col;
                }
            }
        }
        //Action
        int amount = 0;

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
                System.out.println("I do not need more swords!");
                break;
            }
            char digit = matrix[myRow][myCol];
            if (Character.isDigit(digit)) {
                amount += Integer.parseInt(String.valueOf(digit));
            }
            boolean isMirror = matrix[myRow][myCol] == 'M';
            if (isMirror) {
                matrix[myRow][myCol] = '-';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'M') {
                            myRow = row;
                            myCol = col;
                            matrix[row][col] = '-';
                        }
                    }
                }
            }
            //Place the A before the eventual brake from the amount check
            matrix[myRow][myCol] = 'A';

            if (amount >= 65) {
                break;
            }
        }
        //End print
        if (amount >= 65) {
            System.out.println("Very nice swords, I will come back for more!");
        }
        System.out.printf("The king paid %d gold coins.%n", amount);
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }
}