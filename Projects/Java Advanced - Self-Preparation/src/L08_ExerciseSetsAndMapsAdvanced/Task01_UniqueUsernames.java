package L08_ExerciseSetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countUsernames = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < countUsernames; i++) {
            String username = scanner.nextLine();
            usernames.add(username);
        }

        usernames.forEach(username -> System.out.println(username));
    }
}
