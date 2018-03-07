import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Game {
    Player player1, player2;
    Card card;
    Deck deck;
    public Game(){
        deck = new Deck();
    }

    public String compareHands(Player player1, Player player2) {
        if (player1.cardValue() > player2.cardValue()) {
            return "player1 wins";
        } else if (player1.cardValue() < player2.cardValue()) {
            return "player2 wins";}
        else return "draw";
    }

    public void dealCard(Player player1) {
        deck.shuffleDeck();
        if (player1.handCount() < 2) {
            Card card = deck.deal();
            player1.addCard(card);
        }
    }


}
