package L26_ExerciseAssociativeArrays;

import java.util.*;

public class TaskUnknown_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Обработка на входните данни.

        int countPlants = Integer.parseInt(scanner.nextLine());
        //растение -> индекс на рядкост (rarity)
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        //растение -> списък с рейтинги
        Map<String, List<Double>> plantsRatings = new LinkedHashMap<>();

        for (int plant = 1; plant <= countPlants; plant++) {
            String input = scanner.nextLine();
            String plantName = input.split("<->")[0]; //име на разтението
            int rarity = Integer.parseInt(input.split("<->")[1]); //индекс на рядкост

            plantsRarity.put(plantName, rarity);
            plantsRatings.putIfAbsent(plantName, new ArrayList<>());
        }

        //2. Работа с командите.

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            //1. command = "Rate: {plant} - {rating}"
            String plantName = command.split(" ")[1]; // име на разтението, с което ще работим
            //Проверка дали има такова растение!
            if (!plantsRarity.containsKey(plantName)) {
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }
            if (command.contains("Rate")) {
                double rating = Double.parseDouble(command.split(" ")[3]);
                plantsRatings.get(plantName).add(rating);
            }
            //2. command = "Update: ..."
            else if (command.contains("Update")) {
                int newRarity = Integer.parseInt(command.split(" ")[3]);
                plantsRarity.put(plantName, newRarity);
            }
            //3. command = "Reset: ..."
            else if (command.contains("Reset")) {
                plantsRatings.get(plantName).clear();
            }
            command = scanner.nextLine();
        }
        //3. Отпечатване.

        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet().forEach(entry -> {
            String plantName = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = plantsRatings.get(plantName).stream().mapToDouble(a -> a).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRating);
        });

    }
}
