package ExamSelfPreparation;

import java.util.Scanner;

public class Task02_ThroneConquering15DEC2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parisEnergy = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        char[][] matrixField = new char[rows][];
        for (int row = 0; row < rows; row++) {
            matrixField[row] = scanner.nextLine().toCharArray();  //Input: "--H--" -> toCharArray -> ['-', '-', 'H', '-', '-']
        }
        //Find Paris location
        int parisRow = -1;
        int parisCol = -1;
        for (int row = 0; row < matrixField.length; row++) {
            for (int col = 0; col < matrixField[row].length; col++) {
                if (matrixField[row][col] == 'P') {
                    parisRow = row;
                    parisCol = col;
                }
            }
        }
        while (true) {

            String[] commands = scanner.nextLine().split("\\s+");
            String direction = commands[0];
            int enemyRow = Integer.parseInt(commands[1]);
            int enemyCol = Integer.parseInt(commands[2]);

            matrixField[parisRow][parisCol] = '-';  //Paris тръгва и слагам - на мястото му
            matrixField[enemyRow][enemyCol] = 'S';
            switch (direction) {
                case "up":
                    if (parisRow - 1 >= 0) {
                        parisRow--;
                    }
                    break;
                case "down":
                    if (parisRow + 1 < matrixField.length) {
                        parisRow++;
                    }
                    break;
                case "left":
                    if (parisCol - 1 >= 0) {
                        parisCol--;
                    }
                    break;
                case "right":
                    if (parisCol + 1 < matrixField.length) {
                        parisCol++;
                    }
                    break;
                default:
                    break;
            }

            //1.
            parisEnergy--;
            //2. Check
            if (parisEnergy <= 0) {
                parisIsDead(matrixField, parisRow, parisCol);
                break;
            }

            //3. Check for enemy

            if (matrixField[parisRow][parisCol] == 'S') {
                //3.1 fight and if win -> energy-2
                parisEnergy -= 2;
                //3.2 Check if died again
                if (parisEnergy <= 0) {
                    parisIsDead(matrixField, parisRow, parisCol);
                    break;
                } else {
                    matrixField[parisRow][parisCol] = 'P';
                }

                //4. Is there H (Helena)?
            } else if (matrixField[parisRow][parisCol] == 'H') {
                //На мястото слагаме тире и...
                //Двамата изчезват от полето
                matrixField[parisRow][parisCol] = '-';
                //Печатаме колко енергия има
                System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", parisEnergy);
                printField(matrixField);
                break;
            }
            //Слагам си Парис на мястото
            matrixField[parisRow][parisCol] = 'P';
        }
    }

    public static void parisIsDead(char[][] field, int row, int col) {
        field[row][col] = 'X';
        System.out.printf("Paris died at %d;%d.%n", row, col);
        printField(field);
    }

    private static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }
    }
}
