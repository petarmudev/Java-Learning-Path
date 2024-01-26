package L11_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<Integer, Integer> sumM = x -> x + 5;

        //Input: "4, 2, 1, 3, 5, 7, 1, 4, 2, 12"
        List<Integer> sumNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Count = " + sumNumbers.size());

        int sum = sumNumbers.stream()
                .mapToInt(e -> Integer.parseInt(String.valueOf(e)))
                .sum();

        System.out.println("Sum = " + sum);
    }
}
