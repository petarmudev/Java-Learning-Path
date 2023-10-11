package L14_Methods;

import java.util.Scanner;

public class Task10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        getMultipleOfEvensAndOdds(number);
    }

    public static void getMultipleOfEvensAndOdds(int number) {
        int result = getSumOfEvenDigits(number) * getSumOfOddDigits(number);
        System.out.println(result);
    }

    public static int getSumOfEvenDigits(int number) {
        int sum = 0;
        int numberCopy = Math.abs(number);
        while (numberCopy > 0) {
            int currentDigit = numberCopy % 10;
            if (currentDigit % 2 == 0) {
                sum += currentDigit;
            }
            numberCopy /= 10;
        }
        return sum;
    }

    public static int getSumOfOddDigits(int number) {
        int sum = 0;
        int numberCopy = Math.abs(number);
        while (numberCopy > 0) {
            int currentDigit = numberCopy % 10;
            if (currentDigit % 2 != 0) {
                sum += currentDigit;
            }
            numberCopy /= 10;
        }
        return sum;
    }
}
