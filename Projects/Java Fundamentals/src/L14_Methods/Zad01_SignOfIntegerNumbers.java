package L14_Methods;

import java.util.Scanner;

public class Zad01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        checkNumberSign(n);
    }

    public static void checkNumberSign(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
