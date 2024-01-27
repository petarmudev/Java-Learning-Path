package L11_FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Task05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> people = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        //Read the input data
        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split(", ");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            people.put(name, age);
        }
        //The other left input:
        String comparison = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        //Logic for the filtering:
        BiPredicate<Integer, Integer> filterPredicate;
        if (comparison.equals("younger")) {
            filterPredicate = (personAge, age) -> personAge <= age;
        } else {
            filterPredicate = (personAge, age) -> personAge >= age;
        }

        //Logic for the printing
        Consumer<Map.Entry<String, Integer>> printConsumer;
        if (printType.equals("age")) {
            printConsumer = person -> System.out.println(person.getValue());
        } else if (printType.equals("name")) {
            printConsumer = person -> System.out.println(person.getKey());
        } else {
            printConsumer = person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
        }

        //filter the person
        //Print by the printType
        people.entrySet().stream()
                .filter(person -> filterPredicate.test(person.getValue(), ageLimit))
                .forEach(printConsumer);

    }
}
