package boardgame;

public abstract class Piece {
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
	
	public abstract boolean[][] possibleMoves(); // precisa usar o tipo primitivo para ele assumir os valores padroes quando criado
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		
		for (int i = 0 ; i < mat.length ; i++) {
			for (int j = 0 ; j < mat.length ; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
