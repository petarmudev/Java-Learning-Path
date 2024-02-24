package L21_ExamPrep_09Feb2024;

import java.util.Scanner;

public class Task02_StickyFingers {
    public static void main(String[] args) {
        // https://judge.softuni.org/Contests/Practice/Index/3482#1
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        String[] commands = scanner.nextLine().split(",");
        //Find the initial coordinates
        int myRow = -1;
        int myCol = -1;
        for (int row = 0; row < size; row++) {
            char[] input = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = input[col];
                if (input[col] == 'D') {
                    myRow = row;
                    myCol = col;
                }
            }
        }
        //Movement/action:
        int stolenSum = 0;
        boolean gotCought = false;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            matrix[myRow][myCol] = '+';
            switch (command) {
                case "up":
                    if (isValidDirection(matrix, myRow - 1, myCol)) {
                        myRow--;
                    } else {
                        continue;
                    }
                    break;
                case "down":
                    if (isValidDirection(matrix, myRow + 1, myCol)) {
                        myRow++;
                    } else {
                        continue;
                    }
                    break;
                case "left":
                    if (isValidDirection(matrix, myRow, myCol - 1)) {
                        myCol--;
                    } else {
                        continue;
                    }
                    break;
                case "right":
                    if (isValidDirection(matrix, myRow, myCol + 1)) {
                        myCol++;
                    } else {
                        continue;
                    }
                    break;
                default:
                    break;
            }
            char currentSymbol = matrix[myRow][myCol];
            if (currentSymbol == '$') {
                matrix[myRow][myCol] = '+';
                int stolen = myRow * myCol;
                stolenSum += stolen;
                System.out.printf("You successfully stole %d$.%n", stolen);
            }
            if (currentSymbol == 'P') {
                matrix[myRow][myCol] = '#';
                gotCought = true;
                System.out.printf("You got caught with %d$, and you are going to jail.%n", stolenSum);
                break;
            }
            matrix[myRow][myCol] = 'D';
        }
        //Print end case
        if (!gotCought) {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", stolenSum);
        }
        //Print the matrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidDirection(char[][] matrix, int myRow, int myCol) {
        if (myRow < 0 || myRow > matrix.length - 1 || myCol < 0 || myCol > matrix.length - 1) {
            System.out.println("You cannot leave the town, there is police outside!");
            return false;
        }
        return true;
    }
}
