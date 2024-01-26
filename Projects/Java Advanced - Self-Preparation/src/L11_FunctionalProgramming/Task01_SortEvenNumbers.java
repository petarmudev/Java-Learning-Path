package L11_FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class Task01_SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] stringNumbers = scanner.nextLine().split(", ");

        //make the List int
        //filter only the even numbers
        //parse them to String
        //Print with String.join
        List<String> evenNumbers = Arrays.stream(stringNumbers)
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenNumbers));

        //sort the List
        //print sorted
        //evenNumbers.removeIf(num -> num % 2 == 0);   // Това ще работи ако лист-а е останал с интеджъри
        //evenNumbers.sort(Integer::compareTo);       //// Това ще работи ако лист-а е останал с интеджъри  най-вероятно

        evenNumbers = evenNumbers.stream().map(Integer::parseInt)
                .sorted()
                .map(Objects::toString)
                .collect(Collectors.toList());
        System.out.println(String.join(", ", evenNumbers));
    }
}
