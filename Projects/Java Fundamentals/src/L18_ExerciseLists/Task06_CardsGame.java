package L18_ExerciseLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You will be given two hands of cards, which will be integer numbers.
        Assume that you have two players. You must find the winning deck and, respectively, the winner.
        You start from the beginning of both hands.
        Compare the cards from the first deck to those from the second.
        The player, who has a bigger card, takes both cards and puts them on the back of his hand - the second
        player's card is last, and the first person's card (the winning one) is before it (second to last),
        and the player with the smaller card must remove the card from his deck. If both players'
        cards have the same values - no one wins, and the two cards must be removed from the decks.
        The game is over when one of the decks is left without any cards.
        You have to print the winner on the console and the sum of the left cards:
         "{First/Second} player wins! Sum: {sum}".
         */
        List<Integer> firstDeck = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstDeck.size() > 0 && secondDeck.size() > 0) {
            int firstPlayerPoints = firstDeck.get(0);
            int secondPlayerPoints = secondDeck.get(0);
            if (firstPlayerPoints > secondPlayerPoints) {
                firstDeck.add(firstPlayerPoints);
                firstDeck.add(secondPlayerPoints);
                firstDeck.remove(0);
                secondDeck.remove(0);

            } else if (secondPlayerPoints > firstPlayerPoints) {
                secondDeck.add(secondPlayerPoints);
                secondDeck.add(firstPlayerPoints);
                secondDeck.remove(0);
                firstDeck.remove(0);
            } else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }
        int sum = 0;
        for (int i = 0; i < firstDeck.size(); i++) {
            sum += firstDeck.get(i);
        }
        for (int i = 0; i < secondDeck.size(); i++) {
            sum += secondDeck.get(i);
        }
        if (!firstDeck.isEmpty()) {
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (!secondDeck.isEmpty()) {
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
