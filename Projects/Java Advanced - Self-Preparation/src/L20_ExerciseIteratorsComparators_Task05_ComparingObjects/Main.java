package L20_ExerciseIteratorsComparators_Task05_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        int allPeople = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            String[] inputData = input.split("\\s+");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);
            String town = inputData[2];
            Person person = new Person(name, age, town);
            people.add(person);
            allPeople++;
        }
        int n = Integer.parseInt(scanner.nextLine());

        Person searchedPerson = people.get(n - 1);
        people.remove(n -1);
        int count = 0;
        for (Person person : people) {
            if (searchedPerson.compareTo(person) == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No matches");
        } else  {
            System.out.printf("%d %d %d%n", count + 1, allPeople - (count + 1), allPeople);
        }
    }
}
