package L14_Methods;

import java.util.Scanner;

public class Task07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, count));

    }

    public static String repeatString(String text, int count) {
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = text;
        }
        return String.join("", result);
    }
}
