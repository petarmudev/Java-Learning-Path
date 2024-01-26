package L11_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task01_V2SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Input example:   "4, 2, 1, 3, 5, 7, 1, 4, 2, 12"

        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        //Print before the sort
        System.out.println(evenNumbers.toString().replaceAll("\\[|]", ""));

        //Sort and...
        Collections.sort(evenNumbers);
        //Print after the sort
        System.out.println(evenNumbers.toString().replaceAll("\\[|]", ""));
    }
}
