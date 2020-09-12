package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		// posi��o vai iniciar nula, quer dizer que ela n�o foi colocada no tabuleiro ainda
		position = null;
		this.board = board;
	}

	protected Board getBoard() {
		// somente classes do mesmo pacote e subclasses v�o acessar o tabuleiro
		return board;
	}
	
	
}
