package L26_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> peopleResults = new LinkedHashMap<>();
        Map<String, Integer> submits = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exam finished")) {
                break;
            }

            String[] command = input.split("-");

            if (command.length == 3) {
                String name = command[0];
                String language = command[1];
                int points = Integer.parseInt(command[2]);

                if (!peopleResults.containsKey(name)) {
                    peopleResults.put(name, points);
                } else if (peopleResults.get(name) < points) {
                    peopleResults.put(name, points);
                }

                if (!submits.containsKey(language)) {
                    submits.put(language, 1);
                } else {
                    submits.put(language, submits.get(language) + 1);
                }
            } else {
                peopleResults.remove(command[0]);
            }
        }
        System.out.println("Results:");
        peopleResults.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",
                            entry.getKey(), entry.getValue()));
                });

        System.out.println("Submissions:");
        submits.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",
                            entry.getKey(), entry.getValue()));
                });
    }
}
