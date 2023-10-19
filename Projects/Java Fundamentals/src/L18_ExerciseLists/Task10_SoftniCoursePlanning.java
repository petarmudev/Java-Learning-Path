package L18_ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10_SoftniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*

         */
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

                boolean firstLessonFound = false;
                boolean secondLessonFound = false;
                int firstFoundIndex = 0;
                int secondFoundIndex = 0;
                for (int i = 0; i < topics.size(); i++) {
                    if (topics.get(i).equals(lessonTitle)) {
                        firstFoundIndex = i;
                        firstLessonFound = true;
                        //continue;
                    }
                    if (topics.get(i).equals(secondLessonTitle)) {
                        secondFoundIndex = i;
                        secondLessonFound = true;
                        //continue;
                    }

                }
                if (firstLessonFound && secondLessonFound) {
                    String dataHolder = topics.get(firstFoundIndex);
                    boolean hasExerciseToSwap =false;
                    int secondLessonTitleIndex = topics.indexOf(secondLessonTitle);
                    if (topics.contains(secondLessonTitle+"-Exercise")){
                        hasExerciseToSwap = true;
                    }
                    topics.set(firstFoundIndex, secondLessonTitle);
                    if (hasExerciseToSwap){
                        topics.remove(secondLessonTitle+"-Exercise");
                        topics.add(firstFoundIndex+1, secondLessonTitle+"-Exercise");
                    }
                    topics.set(secondFoundIndex, dataHolder);
                }

            } else if (commandParts[0].equals("Exercise")) {
                boolean lessonFound = false;
                int lessondFoundIndex = 0;
                boolean exerciseFound = false;
                for (int i = 0; i < topics.size(); i++) {
                    if (topics.get(i).equals(lessonTitle)) {
                        lessonFound = true;
                        lessondFoundIndex = i;
                        if (i < topics.size() - 1) {
                            if (lessonFound) {
                                if (topics.get(lessondFoundIndex + 1).contains("-Exersise")) {
                                    exerciseFound = true;
                                }
                            }
                        }
                    }
                }
                if (lessonFound && !exerciseFound){
                    topics.add(lessondFoundIndex+1, lessonTitle+"-Exercise");
                } else if (!lessonFound) {
                    topics.add(lessonTitle);
                    topics.add(lessonTitle+"-Exercise");
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < topics.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, topics.get(i));
        }
    }
}
/*
We swap the given lessons because both exist.
After receiving the Exercise command, we see that such a lesson doesn't exist,
 * so we add the lesson at the end, followed by the exercise.
We swap Lists and Databases lessons. The Databases-Exercise is also moved after the Databases lesson.
We skip the next command because we already have such a lesson in our schedule.
 */
