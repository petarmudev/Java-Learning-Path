package ExamPreparationDesislava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02_MouseAndCheese23OCT2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //N - size of square martix
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int row = 0; row < matrix.length; row++) {
            char[] rowContent = scanner.nextLine().toCharArray();
            matrix[row] = rowContent;
        }
        //намираме къде е мишката
        int mouseRow = -1;
        int mouseCol = -1;
        int cheeseCount = 0;

        //Find the mouse location
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char currentSymbol = matrix[row][col];
                if (currentSymbol == 'M') {
                    mouseRow = row;
                    mouseCol = col;
                    break;
                }
            }
        }

        String direction = scanner.nextLine();
        while (!direction.equals("end")) {
            matrix[mouseRow][mouseCol] = '-';  //махаме мишката от позицията/изчистваме позицията с: '-'

            switch (direction) {
                case "up":
                    mouseRow--;
                    break;
                case "down":
                    mouseRow++;
                    break;
                case "left":
                    mouseCol--;
                    break;
                case "right":
                    mouseCol++;
                    break;
                default:
                    break;
            }
            if (mouseRow < 0 || mouseRow >= n || mouseCol < 0 || mouseCol >= n) {
                System.out.println("Where is the mouse?");
                break;
            }

            if (matrix[mouseRow][mouseCol] == 'c') {
                cheeseCount++;
            } else if (matrix[mouseRow][mouseCol] == 'B') {
                //one bonus move "forward", and...
                continue;
                //...than: bonus disappears
            }
            matrix[mouseRow][mouseCol] = 'M';
            direction = scanner.nextLine();
        }
        if (cheeseCount >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheeseCount);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - cheeseCount);
        }
        printMatrix(matrix);
    }

    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
