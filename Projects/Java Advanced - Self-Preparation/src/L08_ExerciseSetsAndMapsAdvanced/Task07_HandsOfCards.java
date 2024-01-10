package L08_ExerciseSetsAndMapsAdvanced;

import java.util.*;

public class Task07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> playersList = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String playerName = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];
            String[] cardsArray = cards.split(", ");
            //Съхраняваме картите в Сет-а
            Set<String> cardsSet = new LinkedHashSet<>();

            cardsSet.addAll(Arrays.asList(cardsArray));

            //Добавям в Мап-а:
            //1. Ако не сме го записали до момента
            if (!playersList.containsKey(playerName)) {
                playersList.put(playerName, cardsSet);
            }//2.Ако го имаме вече
            else {
                Set<String> currentCards = playersList.get(playerName);
                //Към текущите карти добавям новите карти
                currentCards.addAll(cardsSet);
                //Добавям промяната в лист-а
                playersList.put(playerName, currentCards);
            }
            input = scanner.nextLine();
        }

        playersList.entrySet().forEach(entry -> {
            Set<String> cards = entry.getValue();
            int points = getCardsPoints(cards);
            String name = entry.getKey();
            System.out.printf("%s: %d%n", name, points);
        });

    }

    private static int getCardsPoints(Set<String> cards) {
        //cards = "2C", "4H", "9H", "AS", "QS"
        //Всяка една карта -> намираме точките и и я добавяме към сумата
        Map<Character, Integer> symbolValues = getSymbolValues();
        int sumPoints = 0;

        for (String card : cards) {
            //card = "2C"[сила][тип]
            // сила: 2, 3, 4, 5, 6, 7, 8, 9, 10, J(11), Q(12), K(13), A(14)
            //тип: S(4), H(3), D(2), C(1)
            //точки = сила * тип

            int points = 0;
            if (card.startsWith("10")) {
                // "10C"
                char power = 10;
                char type = card.charAt(2);
                points = 10 * symbolValues.get(type);
            } else {
                // "4H"
                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolValues.get(power) * symbolValues.get(type);
            }
            sumPoints += points;
        }


        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolValues() {
        Map<Character, Integer> characterValues = new HashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);

        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);

        return characterValues;
    }
}
