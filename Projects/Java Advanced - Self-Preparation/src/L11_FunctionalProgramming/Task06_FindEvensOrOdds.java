package L11_FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Task06_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = range[0];
        int stop = range[1];

        String typeForFilter = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();

        for (int i = start; i <= stop; i++) {
            numbers.add(i);
        }
        Predicate<Integer> filterPredicate = null;
        if (typeForFilter.equals("odd")) {
            filterPredicate = number -> number % 2 != 0;
        } else if (typeForFilter.equals("even")) {
            filterPredicate = number -> number % 2 == 0;
        }

        numbers.stream().filter(filterPredicate).forEach(element -> System.out.print(element + " "));
    }
}
