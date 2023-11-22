package L32_ExerciseRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task06_ValidPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "(_\\.+)(?<pass>[A-Z][A-Za-z0-9]{4,}[A-Z])(_\\.+)";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            StringBuilder stringBuilder = new StringBuilder();
            boolean hasDigit = false;

            if (matcher.find()) {
                String currentPass = matcher.group();
                for (int j = 0; j < currentPass.length(); j++) {
                    if (Character.isDigit(currentPass.charAt(j))) {
                        hasDigit = true;
                        stringBuilder.append(currentPass.charAt(j));
                    }
                }
                if (hasDigit) {
                    System.out.printf("Group: %s%n", stringBuilder.toString());
                } else {
                    System.out.println("Group: default");
                }
            } else {
                System.out.println("Invalid pass!");
            }
        }

    }
}
