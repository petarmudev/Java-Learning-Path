package L11_FunctionalProgramming;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Task02_V2SumNumbersWithBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(", ");

        System.out.println("Count = " + split.length);

        BiFunction<Integer, String, Integer> parseAndSumTwoNums = (x, y) -> x + Integer.parseInt(y);
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum = parseAndSumTwoNums.apply(sum, split[i]);
        }
        System.out.println("Sum = " + sum);
    }
}
