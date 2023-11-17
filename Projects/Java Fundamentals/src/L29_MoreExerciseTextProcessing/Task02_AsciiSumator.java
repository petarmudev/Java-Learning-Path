package L29_MoreExerciseTextProcessing;

import com.sun.jdi.CharValue;

import java.util.Scanner;


public class Task02_AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int lowerChar = Math.min(firstChar, secondChar);
        int higherChar = Math.max(firstChar, secondChar);
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar > lowerChar && currentChar < higherChar) {
                sum += currentChar;
            }
        }
        System.out.println(sum);
    }
}
