package L29_ExerciseTextProcessing;

import java.util.Scanner;

public class Task06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        for (int index = 0; index < text.length() - 1; index++) {
            if (text.charAt(index) == text.charAt(index + 1)) {
                text.deleteCharAt(index + 1);
                index--;
            }
        }
        System.out.println(text);
    }
}
