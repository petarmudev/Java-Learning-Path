package L03_WorkingWithAbstraction;

import java.util.Scanner;

public class Task01_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        printTopHalf(size);
        printBottomHalf(size);
    }

    private static void printBottomHalf(int size) {
        for (int starsCount = size - 1; starsCount >= 1; starsCount--) {
            printRow(size, starsCount);
        }
    }

    private static void printTopHalf(int size) {
        for (int starsCount = 1; starsCount <= size; starsCount++) {
            printRow(size, starsCount);
        }
    }

    private static void printRow(int size, int starsCount) {
        for (int i = 0; i < size - starsCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starsCount - 1; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
