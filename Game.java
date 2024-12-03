public class Game {

	private String gameId;
	private List<User> players;
	private Game board;
	private List<Move> moves;
	private GameStatus status;

	/**
	 * 
	 * @param player
	 * @param position
	 */
	public Boolean makeMove(User player, Position position) {
		// TODO - implement Game.makeMove
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param winner
	 */
	public Void endGame(User winner) {
		// TODO - implement Game.endGame
		throw new UnsupportedOperationException();
	}

}