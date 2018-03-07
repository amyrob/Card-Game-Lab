import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;
    public Deck() {
        cards = new ArrayList<>();
        setupDeck();
    }

    private void setupDeck() {
        for(Suit suit : Suit.values()) {
            for(Rank value : Rank.values()) {
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }
    public int countDeck() {
        return cards.size();
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }
    public Card deal() {
        Card card = cards.remove(0);
        return card;
    }
}
