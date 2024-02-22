package L23_Workshop_AlgorithmsIntroduction;

import java.util.Scanner;

public class Task02_RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine());
        System.out.println(calcFact(n));
    }

    private static long calcFact(long n) {
        if (n == 1) {
            return 1;
        }
        return n * calcFact(n -1);
    }
}
