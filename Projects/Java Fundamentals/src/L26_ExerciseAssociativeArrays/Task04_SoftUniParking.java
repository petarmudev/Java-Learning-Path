package L26_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingData = new LinkedHashMap<>();
        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int count = 0; count < countCommands; count++) {
            String input = scanner.nextLine();
            String[] commandParts = input.split(" ");

            String command = commandParts[0];
            String username = commandParts[1];

            switch (command) {
                case "register":
                    String carNumberplate = commandParts[2];
                    //1. имаме в паркинга такъв човек -> не го допускаме отново
                    if (parkingData.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingData.get(username));
                    }//2. Нямаме в паркинга такъв човек -> допускаме го:
                    else {
                        parkingData.put(username, carNumberplate);
                        System.out.printf("%s registered %s successfully%n", username, carNumberplate);
                    }
                    break;
                case "unregister":
                    //1. Няма такъв собственик
                    if (!parkingData.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    //2. Има такъв собственик
                    if (parkingData.containsKey(username)) {
                        parkingData.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
                default:
                    break;
            }
        }
        parkingData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}

