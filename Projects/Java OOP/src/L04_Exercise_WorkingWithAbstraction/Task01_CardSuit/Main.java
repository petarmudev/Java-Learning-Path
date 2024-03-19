package L04_Exercise_WorkingWithAbstraction.Task01_CardSuit;

public class Main {
    public static void main(String[] args) {


        System.out.println("Card Suits:");
        CardSuit[] cardSuits = CardSuit.values();
        for (CardSuit card : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.toString());
        }

    }
}
