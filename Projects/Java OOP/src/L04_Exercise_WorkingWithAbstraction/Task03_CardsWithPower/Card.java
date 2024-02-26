package L04_Exercise_WorkingWithAbstraction.Task03_CardsWithPower;

public class Card {
    private CardSuit cardSuit;
    private CardRank cardRank;
    private int power;

    public Card(CardSuit cardSuit, CardRank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public int getPower() {
        //suit power + rank power
        return this.cardSuit.getSuitPower() + cardRank.getPowerRank();
    }

    public void setPower(int power) {
        this.power = power;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }
}
