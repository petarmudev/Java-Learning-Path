package L23_Workshop_AlgorithmsIntroduction;

import java.util.Scanner;

public class FibonacciRecursion_Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(calcFibonacci(n));
    }

    private static long calcFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return calcFibonacci(n - 1) + calcFibonacci(n - 2);
    }
}
