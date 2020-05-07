import Player.Player;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Hello, I am an awesome game !");
        Board board = new Board();
        Player player1 = new Player("You", 400, null);
        Player player2 = new Player("Me", 400, null);

        Game game = new Game(player1, player2, board);
        game.startGame();
    }
}