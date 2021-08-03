package com.pro3.chess.piece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.pro3.chess.board.Board;
import com.pro3.chess.board.BoardUtils;
import com.pro3.chess.board.Move;
import com.pro3.chess.board.Move.AttackMove;
import com.pro3.chess.board.Move.PeaceMove;
import com.pro3.chess.board.Tile;

public class Knight extends Piece{
	
	private final static int[] POSSIBLE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17}; 

	public Knight(final int piecePosition,final Colour pieceColour) {
		super(piecePosition, pieceColour);
	}

	@Override
	public Collection<Move> possible(final Board board) {
		
		final List<Move> legalMoves = new ArrayList<>(); 
		
		for(int candidateOffset : POSSIBLE_MOVE_COORDINATES) {
			
			final int destination = this.piecePosition + candidateOffset;
			
			if(BoardUtils.validTile(destination)) {
				
				if(isFirstCol(this.piecePosition, candidateOffset) ||
				   isSecondCol(this.piecePosition, candidateOffset) || 
				   isSeventhCol(this.piecePosition, candidateOffset) || 
				   isEighthCol(this.piecePosition, candidateOffset)) { // i -> heading ���� ����!
					continue;
				}
				
				final Tile DestinationTile = board.getTile(destination); 
				
				if(!DestinationTile.tileOccupied()) { //������� ���� �ȴ�
					legalMoves.add(new PeaceMove(board, this, destination));
				}else {
					final Piece pieceAtDestination = DestinationTile.getPiece();
					final Colour pieceColour = pieceAtDestination.getPieceColour();
					
					if(this.pieceColour != pieceColour) { //�츮�� �ƴϸ� ����
						legalMoves.add(new AttackMove(board, this, destination, pieceAtDestination));
					}
				}
			}
			
		}
		
		return ImmutableList.copyOf(legalMoves);
	}
	
	private static boolean isFirstCol(final int current, final int candidateOffset) { //A���ο� ��ġ �� �� ����Ʈ �̵� ��ȿ��
		return BoardUtils.FISRT_COLUMN[current] && ((candidateOffset == -17) || (candidateOffset == -10) || 
			(candidateOffset == 6) || (candidateOffset == 15));
	}
	
	private static boolean isSecondCol(final int current, final int heading) { //B����
		return BoardUtils.SECOND_COLUMN[current] && ((heading == -10) || (heading == 6));
	}
	
	private static boolean isSeventhCol(final int current, final int heading) { //G����
		return BoardUtils.SEVENTH_COLUMN[current] && ((heading == -6) || (heading == 10));
	}
	
	private static boolean isEighthCol(final int current, final int heading) { //H����
		return BoardUtils.EIGHTH_COLUM[current] && ((heading == -15) || (heading == -6) || 
				(heading==10)||(heading==17));
	}
	
}
