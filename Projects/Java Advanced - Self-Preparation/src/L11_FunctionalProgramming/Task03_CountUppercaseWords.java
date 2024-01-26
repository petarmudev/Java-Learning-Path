package L11_FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task03_CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Input example: "The following example shows how to use Predicate"

        //Check the words to:
        Predicate<String> checkUpperCase = word -> Character.isUpperCase(word.charAt(0));
        //Exercise the functions, so make a printer
        Consumer<String> printer = word -> System.out.println(word);
        //Read the input.
        //Fill the result with the checked words
        List<String> resultList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(checkUpperCase)
                .collect(Collectors.toList());


        System.out.println(resultList.size());
        resultList.forEach(printer);  //println();
    }
}
