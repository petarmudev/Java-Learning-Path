package L12_ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        //Reverse the order
        Collections.reverse(numbers);

        //Remove the divisible by N numbers
        Predicate<Integer> checkDivision = number -> number % n == 0;

        numbers.removeIf(checkDivision);

        numbers.forEach(number -> System.out.print(number + " "));
    }
}
