package L03_DataTypesAndVariables;

import java.util.Scanner;

public class Zad12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You are given a working code that is a solution to Problem 9. - Special Numbers.
        However, the variables are improperly named, declared before they are needed,
         and some of them are used for multiple things.
         Without using your previous solution, modify the code so that it is easy to read and understand.
         */
        int range = Integer.parseInt(scanner.nextLine()); //give a range of numbers to check them

        for (int number = 1; number <= range; number++) {
            int lastDigit = number;
            int sum = 0;
            while (lastDigit > 0) {
                sum += lastDigit % 10;
                lastDigit = lastDigit / 10;
            }
            boolean isFound = (sum == 5) || (sum == 7) || (sum == 11);
            if (isFound) {
                System.out.printf("%d -> %s%n", number, "True");
            } else {
                System.out.printf("%d -> %s%n", number, "False");
            }
        }
    }
}
