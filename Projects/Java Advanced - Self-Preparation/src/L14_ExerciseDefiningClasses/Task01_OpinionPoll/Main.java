package L14_ExerciseDefiningClasses.Task01_OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);

            Person person = new Person(name, age);
            people.add(person);
        }
        //filter person -> (age > 30), sort alphabetically and Print.
        people.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> {
                    //System.out.printf("%s - %d%n", person.getName(), person.getAge());
                    System.out.println(person);
                });
    }
}
