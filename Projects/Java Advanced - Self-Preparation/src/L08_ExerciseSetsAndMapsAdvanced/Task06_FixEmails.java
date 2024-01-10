package L08_ExerciseSetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailsList = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                emailsList.put(name, email);
            }
            name = scanner.nextLine();
        }
        emailsList.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
