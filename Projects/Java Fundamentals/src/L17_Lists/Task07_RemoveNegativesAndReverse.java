package L17_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Task07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Read a list of integers, remove all negative numbers from it and print the remaining
         elements in reversed order. In case of no elements left in the list, print "empty".
        Input                   Output
        10 -5 7 9 -33 50	    50 9 7 10
        ------------------------------------
        7 -2 -10 1	            1 7
        ------------------------------------
        -1 -2 -3	            empty
         */

        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));


        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
