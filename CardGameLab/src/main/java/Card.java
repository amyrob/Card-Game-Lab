public class Card {
    private Suit suit;
    private Rank value;

    public Card(Suit suit, Rank value) {
        this.suit = suit;
        this.value = value;
    }


    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.value;
    }

    public int getValue() {
        return this.value.getValue();
    }
}
