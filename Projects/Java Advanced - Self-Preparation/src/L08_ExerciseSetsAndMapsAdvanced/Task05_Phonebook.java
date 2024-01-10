package L08_ExerciseSetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();

        String data = scanner.nextLine();

        while (!data.equals("search")) {
            String name = data.split("-")[0];
            String phoneNumber = data.split("-")[1];

            if (phonebook.containsKey(name)) {
                phonebook.put(name, phoneNumber);
            }
            phonebook.putIfAbsent(name, phoneNumber);
            data = scanner.nextLine();
        }

        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            if (phonebook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = scanner.nextLine();
        }
    }
}
