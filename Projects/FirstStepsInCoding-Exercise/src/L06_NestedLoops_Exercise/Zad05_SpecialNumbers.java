package L06_NestedLoops_Exercise;

import java.util.Scanner;

public class Zad05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int forthDigit = 0;

        for (int i = 1111; i < 9999; i++) {
            firstDigit = i / 1000;
            secondDigit = i / 100 % 10;
            thirdDigit = i / 10 % 10;
            forthDigit = i % 10;
            if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0 && forthDigit !=0) {
                if (number % firstDigit == 0 && number % secondDigit == 0 && number % thirdDigit == 0 && number % forthDigit == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
