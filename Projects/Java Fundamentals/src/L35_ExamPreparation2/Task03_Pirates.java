package L35_ExamPreparation2;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> townsPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goldContained = new LinkedHashMap<>();
        while (true) {
            String input = scanner.nextLine();      //Tortuga||345000||1250
            if (input.equals("Sail")) {
                break;
            }
            String[] commandParts = input.split("\\|\\|"); //Tortuga||345000||1250
            String town = commandParts[0];
            int population = Integer.parseInt(commandParts[1]);
            int gold = Integer.parseInt(commandParts[2]);

            if (townsPopulation.containsKey(town)) {
                townsPopulation.put(town, (townsPopulation.get(town) + population));
            }
            if (goldContained.containsKey(town)) {
                goldContained.put(town, (goldContained.get(town) + gold));
            }
            townsPopulation.putIfAbsent(town, population);
            goldContained.putIfAbsent(town, gold);
        }
//        System.out.println(citiesPopulation);
//        System.out.println(goldContained);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] commandParts = input.split("=>");
            //"Plunder=>{town}=>{people}=>{gold}"
            //"Prosper=>{town}=>{gold}"
            String event = commandParts[0];
            String town = commandParts[1];

            switch (event) {
                case "Plunder":     //"Plunder=>{town}=>{people}=>{gold}"
                    int peopleToKill = Integer.parseInt(commandParts[2]); //always valid
                    int goldToSteal = Integer.parseInt(commandParts[3]);   //always valid
                    int peopleKilled = 0;
                    int goldStolen = 0;
                    if (townsPopulation.containsKey(town)) {
                        if (townsPopulation.get(town) >= peopleToKill) {
                            peopleKilled = peopleToKill;
                        } else {
                            peopleKilled = townsPopulation.get(town);
                        }
                        if (goldContained.get(town) >= goldToSteal) {
                            goldStolen = goldToSteal;
                        } else {
                            goldStolen = goldContained.get(town);
                        }
                        townsPopulation.put(town, (townsPopulation.get(town) - peopleToKill)); //kill people
                        goldContained.put(town, (goldContained.get(town) - goldToSteal));  //steal gold


                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, goldStolen, peopleKilled);

                        //If the population and/or gold < 0 -> Delete the town with the population and the gold remaining.
                        if (townsPopulation.get(town) <= 0 || goldContained.get(town) <= 0) {
                            townsPopulation.remove(town);
                            goldContained.remove(town);
                            System.out.printf("%s has been wiped off the map!%n", town);
                        }
                    }
                    break;

                case "Prosper":     //"Prosper=>{town}=>{gold}"
                    town = commandParts[1];
                    int gold = Integer.parseInt(commandParts[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        goldContained.put(town, (goldContained.get(town) + gold));
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, goldContained.get(town));
                    }
                    break;
                default:
                    break;
            }
        }
        if (!townsPopulation.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", townsPopulation.size());
            townsPopulation.entrySet().forEach(town -> {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", town.getKey(), town.getValue(), goldContained.get(town.getKey()));
            });
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
