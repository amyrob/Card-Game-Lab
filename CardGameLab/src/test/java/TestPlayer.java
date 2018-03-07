import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestPlayer {
    Player player;
    Card card;

    @Before
    public void before() {
        player = new Player("Miles");
        card = new Card(Suit.HEARTS, Rank.SEVEN);
    }

    @Test
    public void playerHandStartsEmpty(){
        assertEquals(0, player.handCount());
    }


}
