package L18_ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10_V2SoftuniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> topics = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] commandParts = input.split(":");
            String command = commandParts[0];
            String lessonTitle = commandParts[1];

            if (command.equals("Add")) {
                if (!topics.contains(lessonTitle)) {
                    topics.add(lessonTitle);
                }

            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(commandParts[2]);

                if (!topics.contains(lessonTitle)) {
                    topics.add(index, lessonTitle);
                }

            } else if (command.equals("Remove")) {
                topics.remove(lessonTitle);
                topics.remove(lessonTitle+"-Exercise");

            } else if (command.equals("Swap")) {
                String secondLessonTitle = commandParts[2];
                swapLessons(topics, lessonTitle, secondLessonTitle);

            } else if ((command.equals("Exercise"))) {
                addExercise(topics, lessonTitle);
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < topics.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, topics.get(i));
        }
    }

    private static void swapLessons(List<String> topics, String firstLesson, String secondLesson) {
        int firstLessonIndex = topics.indexOf(firstLesson);
        int secondLessonIndex = topics.indexOf(secondLesson);

        if (firstLessonIndex != -1 && secondLessonIndex != -1) {
            topics.set(firstLessonIndex, secondLesson);
            topics.set(secondLessonIndex, firstLesson);

            // Check for and swap associated exercises
            String firstExercise = firstLesson + "-Exercise";
            String secondExercise = secondLesson + "-Exercise";

            if (topics.contains(firstExercise)) {
                int firstExerciseIndex = topics.indexOf(firstExercise);
                topics.remove(firstExercise);
                topics.add(secondLessonIndex + 1, firstExercise);
            }
            if (topics.contains(secondExercise)) {
                int secondExerciseIndex = topics.indexOf(secondExercise);
                topics.remove(secondExercise);
                topics.add(firstLessonIndex + 1, secondExercise);
            }
        }
    }


    private static void addExercise(List<String> topics, String lessonTitle) {
        String exercise = lessonTitle + "-Exercise";
        if (topics.contains(lessonTitle) && !topics.contains(exercise)) {
            int lessonIndex = topics.indexOf(lessonTitle);
            topics.add(lessonIndex + 1, exercise);
        } else if (!topics.contains(lessonTitle)) {
            topics.add(lessonTitle);
            topics.add(lessonTitle + "-Exercise");
        }
    }
}