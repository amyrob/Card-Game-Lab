import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGame {
    Player player1, player2;
    Card card1, card2, card3;
    Game game;

    @Before
    public void before() {
        player1 = new Player("Miles");
        player2 = new Player("Rodrigo");
        card1 = new Card(Suit.HEARTS, Rank.SEVEN);
        card2 = new Card(Suit.DIAMONDS, Rank.SIX);
        card3 = new Card(Suit.SPADES, Rank.SIX);
        game = new Game();
    }

    @Test
    public void canAddCardToHand() {
        player1.addCard(card1);
        assertEquals(1, player1.handCount());
    }

    @Test
    public void canCheckCardValue() {
        player1.addCard(card1);
        assertEquals(7, player1.cardValue());
    }

    @Test
    public void canCompareHandsPlayer1Wins() {
        player1.addCard(card1);
        player2.addCard(card2);
        assertEquals("player1 wins", game.compareHands(player1, player2));
    }

    @Test
    public void canCompareHandsPlayer2Wins(){
        player1.addCard(card2);
        player2.addCard(card1);
        assertEquals("player2 wins", game.compareHands(player1, player2));
    }

    @Test
    public void canCompareHandsDraw(){
        player1.addCard(card2);
        player2.addCard(card3);
        assertEquals("draw", game.compareHands(player1, player2));
    }
}
