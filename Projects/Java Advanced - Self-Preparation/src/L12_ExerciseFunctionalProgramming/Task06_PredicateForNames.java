package L12_ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Task06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> checkName = name -> name.length() <= n;

        Arrays.stream(names).filter(checkName).forEach(System.out::println);

    }
}
