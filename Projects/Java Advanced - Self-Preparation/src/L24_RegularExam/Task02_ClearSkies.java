package L24_RegularExam;

import java.util.Scanner;

public class Task02_ClearSkies {
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
                if (input[col] == 'J') {
                    myRow = row;
                    myCol = col;
                }
            }
        }
        //Action
        int enemies = 4;
        int jetArmour = 300;

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
            char currentItem = matrix[myRow][myCol];
            if (currentItem == 'E') {
                if (enemies >= 1) {
                    jetArmour -= 100;
                }
                matrix[myRow][myCol] = 'J';
                if (jetArmour == 0) {
                    System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!%n", myRow, myCol);
                    break;
                } else {
                    enemies--;
                    if (enemies == 0) {
                        break;
                    }
                }
            }
            if (currentItem == 'R') {
                jetArmour = 300;
                matrix[myRow][myCol] = '-';
            }
            //Place back the plane before the while cycle ends
            matrix[myRow][myCol] = 'J';

        } //End print
        if (enemies == 0) {
            System.out.println("Mission accomplished, you neutralized the aerial threat!");
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
