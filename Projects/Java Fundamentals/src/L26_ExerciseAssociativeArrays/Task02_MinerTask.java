package L26_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task02_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (true) {
            String resource = scanner.nextLine();
            if (resource.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());


            if (resources.containsKey(resource)) {
                resources.put(resource, resources.get(resource) + quantity);
            }
            resources.putIfAbsent(resource, quantity);

        }
        resources.entrySet().forEach(entry -> {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        });
    }
}
