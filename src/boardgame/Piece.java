package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		// posição vai iniciar nula, quer dizer que ela não foi colocada no tabuleiro ainda
		position = null;
		this.board = board;
	}

	protected Board getBoard() {
		// somente classes do mesmo pacote e subclasses vão acessar o tabuleiro
		return board;
	}
	
	
}
