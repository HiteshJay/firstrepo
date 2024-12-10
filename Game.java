import java.util.ArrayList;
import java.util.List;

public class Game {
    private String gameId;
    private List<User> players;
    private Board board;
    private List<Move> moves;
    private GameStatus status;

    public Game(String gameId, int boardSize, List<User> players) {
        this.gameId = gameId;
        this.board = new Board(boardSize);
        this.players = players;
        this.moves = new ArrayList<>();
        this.status = GameStatus.IN_PROGRESS;
    }

    public Boolean makeMove(User player, Position position) {
        if (status != GameStatus.IN_PROGRESS) {
            return false;
        }

        Symbol playerSymbol = getPlayerSymbol(player);
        if (board.updateCell(position, playerSymbol)) {
            moves.add(new Move(this, player, position, playerSymbol));
            return true;
        }
        return false;
    }

    public void endGame(User winner) {
        this.status = GameStatus.FINISHED;
        System.out.println("Game Over! Winner: " + (winner != null ? winner.getUsername() : "Draw"));
    }

    private Symbol getPlayerSymbol(User player) {
        return players.get(0).equals(player) ? Symbol.X : Symbol.O;
    }
}

enum GameStatus {
    IN_PROGRESS, FINISHED
}
