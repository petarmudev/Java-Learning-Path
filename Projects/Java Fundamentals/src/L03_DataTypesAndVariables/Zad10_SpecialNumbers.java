package L03_DataTypesAndVariables;

import java.security.KeyStore;
import java.util.Scanner;

public class Zad10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        A number is special when its sum of digits is 5, 7, or 11.
        Write a program to read an integer n and for all numbers in the range 1…n to print the number,
         and if it is special or not (True / False).
         */
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                sum += lastDigit;
                number /= 10;
            }
            boolean isSpecial = (sum == 5 || sum == 7 || sum == 11);
            if (isSpecial){
                System.out.printf("%d -> %s%n", i, "True");
            } else {
                System.out.printf("%d -> %s%n", i, "False");
            }

        }

    }
}
