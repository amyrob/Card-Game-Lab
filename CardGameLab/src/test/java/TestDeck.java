import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDeck {
    ArrayList<Card> cards;
    Deck deck;
    @Before
    public void before() {
        this.cards = new ArrayList<>();
        this.deck = new Deck();
    }

    @Test
    public void deckHas52Cards() {
        assertEquals(52, deck.countDeck());
    }

    @Test
    public void deckCanGiveCard() {
        deck.deal();
        assertEquals(51, deck.countDeck());
    }
}
