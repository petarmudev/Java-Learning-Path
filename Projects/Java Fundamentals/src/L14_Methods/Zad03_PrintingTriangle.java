package L14_Methods;

import java.util.Scanner;

public class Zad03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        printTriangleFigure(rows);
    }

    public static void printTriangleFigure(int rowsNumber) {
        for (int i = 1; i <= rowsNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        for (int i = rowsNumber - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
