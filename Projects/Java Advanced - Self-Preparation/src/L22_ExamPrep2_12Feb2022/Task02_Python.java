package L22_ExamPrep2_12Feb2022;

import java.util.Scanner;

public class Task02_Python {
    public static void main(String[] args) {
        //26.June.2021
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        String[] commands = scanner.nextLine().split(",\\s+");
        int myRow = -1;
        int myCol = -1;
        int foodLeft = 0;
        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", ""); //replace all the empty spaces
            char[] input = line.toCharArray(); //String -> charArray
            //Both upper lines written in one:
            //char[] input = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = input[col];
                if (input[col] == 's') {
                    myRow = row;
                    myCol = col;
                } else if (input[col] == 'f') {
                    foodLeft++;
                }
            }
        }
        int lenght = 1;
        boolean isAlive = true;

        for (String command : commands) {
            matrix[myRow][myCol] = '*';
            switch (command) {
                case "up":
                    myRow--;
                    break;
                case "down":
                    myRow++;
                    break;
                case "left":
                    myCol--;
                    break;
                case "right":
                    myCol++;
                    break;
            }
            if (myRow > size - 1) {
                myRow = 0;
            } else if (myRow < 0) {
                myRow = size - 1;
            } else if (myCol > size - 1) {
                myCol = 0;
            } else if (myCol < 0) {
                myCol = size - 1;
            }
            char currentSymbol = matrix[myRow][myCol];
            if (currentSymbol == 'e') {
                System.out.println("You lose! Killed by an enemy!");
                isAlive = false;
                break;
            }
            if (currentSymbol == 'f') {
                lenght++;
                foodLeft--;
            }
            matrix[myRow][myCol] = 's';
            if (foodLeft == 0) {
                System.out.printf("You win! Final python length is %d", lenght);
                break;
            }
        }

        if (foodLeft > 0 && isAlive) {
            System.out.printf("You lose! There is still %d food to be eaten.", foodLeft);
        }
    }
}
