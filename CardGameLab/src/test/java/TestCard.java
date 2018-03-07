import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {

    Card card;

    @Before
    public void before() {
    card = new Card(Suit.HEARTS, Rank.SEVEN);
    }
    @Test
    public void cardHasSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void cardHasRank(){
        assertEquals(Rank.SEVEN, card.getRank());
    }

    @Test
    public void cardHasValue() {
        assertEquals(7, card.getValue());
    }

}
