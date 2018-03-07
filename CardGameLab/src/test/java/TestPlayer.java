import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPlayer {
    Player player;
    Card card1, card2;

    @Before
    public void before() {
        player = new Player("Miles");
        card1 = new Card(Suit.HEARTS, Rank.SEVEN);
        card2 = new Card(Suit.SPADES, Rank.EIGHT);
    }

    @Test
    public void playerHandStartsEmpty(){
        assertEquals(0, player.handCount());
    }

//    @Test
//    public void playerHandTotalValue(){
//        player.addCard(card2);
//        player.addCard(card1);
//        assertEquals(15, player.handValue());
//
//    }

}
