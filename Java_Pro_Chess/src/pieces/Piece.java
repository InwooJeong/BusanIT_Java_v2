package pieces;

import java.util.List;

import board.Board;
import board.Move;

public abstract class Piece { //상속으로 확장 - 모든 말들이 가져야 할 공통 정보
	
	protected final int piecePosition;
	protected final Colour pieceColour;
	
	public Piece(final int piecePosition, final Colour pieceColour) {
		this.piecePosition = piecePosition;
		this.pieceColour = pieceColour;
	}
	
	public Colour getPieceColour() {
		return this.pieceColour;
	}
	
	public abstract List<Move> possible(final Board board);

}
