public class Move {
    private String moveId;
    private Game game;
    private User player;
    private Position position;
    private Symbol symbol;

    public Move(Game game, User player, Position position, Symbol symbol) {
        this.moveId = "MOVE-" + System.currentTimeMillis();
        this.game = game;
        this.player = player;
        this.position = position;
        this.symbol = symbol;
    }

    public Boolean validateMove(Position position) {
        return game != null && game.makeMove(player, position);
    }
}
