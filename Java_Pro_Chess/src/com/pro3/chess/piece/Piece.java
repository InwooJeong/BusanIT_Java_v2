package com.pro3.chess.piece;

import java.util.Collection;

import com.pro3.chess.board.Board;
import com.pro3.chess.board.Move;

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
	
	public abstract Collection<Move> possible(final Board board);

}