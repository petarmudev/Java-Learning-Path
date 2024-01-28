package L12_ExerciseFunctionalProgramming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestNum = list -> list.lastIndexOf(Collections.min(list));
        System.out.println(findSmallestNum.apply(numbers));
    }
}
