package L04_Exercise_WorkingWithAbstraction.Task02_CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        CardRank[] cardRTanks = CardRank.values();
        for (CardRank card : cardRTanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.toString());
        }
    }
}
