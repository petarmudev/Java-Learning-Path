package L20_ExerciseIteratorsComparators_Task05_ComparingObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            
        }
    }
}
