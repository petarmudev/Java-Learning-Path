package L15_ExerciseMethods;

import java.util.Scanner;

public class Task10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
            A top number holds the following properties:
        Its sum of digits is divisible by 8, e.g. 8, 16, 88.
        Holds at least one odd digit, e.g. 232, 707, 87578.
        */
        int num = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= num; number++) {
            boolean isValidSumDigits = checkSumDigitsDivisibleBy8(number);
            boolean itContainsOddDigit = checkIfHasOddDigit(number);

            if (isValidSumDigits && itContainsOddDigit) { //isTop
                System.out.println(number);
            }
        }
    }

    public static boolean checkSumDigitsDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIfHasOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }

        }
        return false;
    }
}