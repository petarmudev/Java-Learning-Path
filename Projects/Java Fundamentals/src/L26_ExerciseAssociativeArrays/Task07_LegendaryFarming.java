package L26_ExerciseAssociativeArrays;

import java.util.*;

public class Task07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resourses = new LinkedHashMap<>();

        String command = scanner.nextLine();
        String[] commandParts = command.split(" ");

        for (int i = 0; i < commandParts.length - 1; i += 2) {
            int amount = Integer.parseInt(commandParts[i]);
            String resourse = commandParts[i + 1].toLowerCase();
            resourses.putIfAbsent(resourse, 0);
            resourses.put(resourse, resourses.get(resourse) + amount);

            if (resourses.get(resourse) >= 250) {
                if (resourse.equals("shards")) {
                    System.out.println("Shadowmourne obtained!");
                } else if (resourse.equals("fragments")) {
                    System.out.println("Valanyr obtained!");
                } else if (resourse.equals("motes")) {
                    System.out.println("Dragonwrath obtained!");
                }
            }
        }
        resourses.putIfAbsent("shards", 0);
        resourses.putIfAbsent("fragments", 0);
        resourses.putIfAbsent("motes", 0);
        System.out.println("shards: " + resourses.get("shards"));
        System.out.println("fragments: " + resourses.get("fragments"));
        System.out.println("motes: " + resourses.get("motes"));


        //System.out.println(resourses);
    }
}
