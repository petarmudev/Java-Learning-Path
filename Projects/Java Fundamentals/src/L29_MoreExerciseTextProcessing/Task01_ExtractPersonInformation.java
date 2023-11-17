package L29_MoreExerciseTextProcessing;

import java.util.Scanner;

public class Task01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();

            if (input.contains("@") && input.contains("#")) {
                String name = input.substring(input.indexOf("@") + 1, input.indexOf("|"));
                String age = input.substring(input.indexOf("#") + 1, input.indexOf("*"));
                System.out.printf("%s is %s years old.%n", name, age);
            }
        }
    }
}
