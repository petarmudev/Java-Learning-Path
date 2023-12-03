package FinalExam;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task03_Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> usernameLikes = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> usernameComments = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Log out")) {
                break;
            }
            String[] commandParts = input.split(":");
            String command = commandParts[0].trim();
            String username = commandParts[1].trim();
            switch (command) {
                case "New follower":        //"New follower: {username}"
                    usernameLikes.putIfAbsent(username, 0);
                    usernameComments.putIfAbsent(username, 0);
                    break;
                case "Like":        //"Like: {username}: {count}"
                    int likes = Integer.parseInt(commandParts[2].trim());
                    if (usernameLikes.containsKey(username)) {
                        usernameLikes.put(username, usernameLikes.get(username) + likes);
                    } else {
                        usernameLikes.putIfAbsent(username, likes);
                        usernameComments.putIfAbsent(username, 0);
                    }
                    break;
                case "Comment":     //"Comment: {username}"
                    if (usernameComments.containsKey(username)) {
                        usernameComments.put(username, usernameComments.get(username) + 1);
                    } else {
                        usernameLikes.putIfAbsent(username, 0);
                        usernameComments.putIfAbsent(username, 1);
                    }
                    break;
                case "Blocked":     //"Blocked: {username}"
                    if (usernameLikes.containsKey(username)) {
                        usernameLikes.remove(username);
                        usernameComments.remove(username);
                    } else {
                        System.out.printf("%s doesn't exist.%n", username);
                    }
                    break;
                default:
                    break;
            }
        }
        //Print:
        System.out.printf("%d followers%n", usernameLikes.size());
        if (!usernameLikes.isEmpty()) {
            usernameLikes.entrySet().forEach(user -> {
                String username = user.getKey();
                int sum = user.getValue() + usernameComments.get(username);
                System.out.printf("%s: %d%n", username, sum);
            });

        }
    }
}
