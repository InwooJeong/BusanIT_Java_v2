package com.pro3.chess.piece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.pro3.chess.board.Board;
import com.pro3.chess.board.BoardUtils;
import com.pro3.chess.board.Move;
import com.pro3.chess.board.Tile;
import com.pro3.chess.board.Move.AttackMove;
import com.pro3.chess.board.Move.PeaceMove;

public class Bishop extends Piece{
	
	private final static int[] POSSIBLE_MOVE_COORDINATES = {-9, -7, 7, 9};

	public Bishop(int piecePosition, Colour pieceColour) {
		super(piecePosition, pieceColour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Move> possible(Board board) {
		// TODO Auto-generated method stub
		
		final List<Move> legalMoves = new ArrayList<>();
		
		for(final int i : POSSIBLE_MOVE_COORDINATES) {
			
			int destination = this.piecePosition;
			
			while(BoardUtils.validTile(i)) {
				
				destination += i;
				
				if(BoardUtils.validTile(i)) {
					final Tile DestinationTile = board.getTile(destination); 
					
					if(!DestinationTile.tileOccupied()) { //������� ���� �ȴ�
						legalMoves.add(new PeaceMove(board, this, destination));
					}else {
						final Piece pieceAtDestination = DestinationTile.getPiece();
						final Colour pieceColour = pieceAtDestination.getPieceColour();
						
						if(this.pieceColour != pieceColour) { //�츮�� �ƴϸ� ����
							legalMoves.add(new AttackMove(board, this, destination, pieceAtDestination));
						}
						break;  //������ ���� �� �ߴ� �ؾ���
					}
				}
				
			}
			
		}
		
		return ImmutableList.copyOf(legalMoves);
	}
	
	private static boolean isFirstCol(final int current, final int heading) {
		
	}

}
