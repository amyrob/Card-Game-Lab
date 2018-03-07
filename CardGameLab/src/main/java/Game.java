public class Game {
    Player player1, player2;

    public String compareHands(Player player1, Player player2) {
        if (player1.cardValue() > player2.cardValue()) {
            return "player1 wins";
        } else if (player1.cardValue() < player2.cardValue()) {
            return "player2 wins";}
        else return "draw";
    }
}
