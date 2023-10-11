package L15_ExerciseMethods;

import java.util.Scanner;

public class Task09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        A palindrome is a number that reads the same backward as forward, such as 323 or 1001.
        Write a program that reads a positive integer number until you receive "END".
        For each numbered print, whether the number is palindrome or not.
            Examples:

            Input       Output;         Input       Output;
            123         false           32          false
            323         true            2           true
            421         false           232         true
            121         true            1010        false
            END                         END
            ----------------------------------------------
         */
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (isPalindrome(input)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String input) {

        int leftIndex = 0;
        int rightIndex = input.length() - 1;
        while (leftIndex < rightIndex) {
            if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}

