package L12_ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //todo the task!!!
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        //Custom comparator -> first all evens, after that all odds , sorted ascending
        Comparator<Integer> comparator = ((firstNum, secondNum) -> {
            //първото четно, второто нечетно
            if (firstNum % 2 == 0 && secondNum % 2 != 0) {
                return -1;
            }
            //първото нечетно, второто четно
            else if (firstNum % 2 != 0 && secondNum % 2 == 0) {
                return 1;
            }
            //първото и второто са четни , ИЛИ първото и второто са нечетни
            else {
                return firstNum.compareTo(secondNum);
            }
        });
        numbers.stream().sorted(comparator).forEach(number -> System.out.print(number + " "));
        //Компаратор функцията приема 2 елемента и връща при:
        //равни -> 0    -> НЕ разменя местата
        //1вото > 2рото -> 1    -> Разменя местата им
        //1вото < 2рото -> -1   -> НЕ разменя местата
    }
}
