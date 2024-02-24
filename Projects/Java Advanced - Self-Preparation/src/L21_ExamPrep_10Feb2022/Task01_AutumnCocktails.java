package L21_ExamPrep_10Feb2022;

import java.util.*;
import java.util.stream.Collectors;

public class Task01_AutumnCocktails {
    //Константи
    private static final int PEAR_SOUR = 150;
    private static final int THE_HARVEST = 250;
    private static final int APPLE_HINNY = 300;
    private static final int HIGH_FASHION = 400;

    public static void main(String[] args) {
        //Link: https://judge.softuni.org/Contests/Practice/Index/3203#0 - 23 October 2021

        Scanner scanner = new Scanner(System.in);

        //List<Integer> input1 = getListData(scanner);
        ArrayDeque<Integer> ingredientsQueue = new ArrayDeque<>(getListData(scanner)); //One option to fill

        List<Integer> input2 = getListData(scanner);
        Collections.reverse(input2); //reversed, because it is going to fill Stack
        ArrayDeque<Integer> freshnessStack = new ArrayDeque<>(input2); //Another variant to fill

        Map<String, Integer> cocktails = new TreeMap<>();
        cocktails.put("Pear Sour", 0);
        cocktails.put("The Harvest", 0);
        cocktails.put("Apple Hinny", 0);
        cocktails.put("High Fashion", 0);

        while (!ingredientsQueue.isEmpty() && !freshnessStack.isEmpty()) {
            Integer firstIngredient = ingredientsQueue.poll();
            if (firstIngredient == 0) {
                continue;
            }
            Integer secondtIngredient = freshnessStack.pop();

            int totalLevel = firstIngredient * secondtIngredient;

//        int pearSourCount = 0;
//        int theHarvest = 0;
//        int appleHinny = 0;
//        int highFashion = 0;
            switch (totalLevel) {
                case PEAR_SOUR: //case 150
                    int currentPearSours = cocktails.get("Pear Sour");
                    currentPearSours++;
                    cocktails.put("Pear Sour", currentPearSours);
                    break;
                case THE_HARVEST:   //case 250
                    cocktails.put("The Harvest", cocktails.get("The Harvest") + 1);
                    break;
                case APPLE_HINNY:   //case 300
                    cocktails.put("Apple Hinny", cocktails.get("Apple Hinny") + 1);
                    break;
                case HIGH_FASHION:  //case 400
                    cocktails.put("High Fashion", cocktails.get("High Fashion") + 1);
                    break;
                default:
                    firstIngredient += 5;
                    ingredientsQueue.offer(firstIngredient);
                    break;

            }
        }
        if (cocktails.get("Pear Sour") > 0
                && cocktails.get("The Harvest") > 0
                && cocktails.get("Apple Hinny") > 0
                && cocktails.get("High Fashion") > 0) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }
        int leftIngredients = ingredientsQueue.stream().mapToInt(e -> e).sum();
        if (leftIngredients > 0) {
            System.out.println("Ingredients left: " + leftIngredients);
        }
        cocktails.entrySet().stream().filter(entry -> entry.getValue() > 0).forEach(entry -> System.out.printf(" # %s --> %d%n", entry.getKey(), entry.getValue()));
    }

    private static List<Integer> getListData(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    }
}
