package pieces;

import java.util.List;

import board.Board;
import board.Move;

public abstract class Piece { //������� Ȯ�� - ��� ������ ������ �� ���� ����
	
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
