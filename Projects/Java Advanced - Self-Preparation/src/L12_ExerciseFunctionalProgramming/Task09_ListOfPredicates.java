package L12_ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<Integer, List<Integer>, Boolean> isDivisible = (number, list) -> {
            for (int numberInList : list) {
                if (number % numberInList != 0) {
                    return false;
                }
            }
            return true;
        };

        //Печатаме числата от 1, до N, който се делят едновременно на всички числа в списъка
        for (int number = 1; number <= n; number++) {
            if (isDivisible.apply(number, numbers)) {
                System.out.print(number + " ");
            }
        }
    }
}
