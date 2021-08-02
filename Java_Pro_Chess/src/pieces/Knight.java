package pieces;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;

import board.Board;
import board.Move;
import board.Tile;

public class Knight extends Piece{
	
	private final static int[] POSSIBLE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17}; 

	public Knight(final int piecePosition,final Colour pieceColour) {
		super(piecePosition, pieceColour);
	}

	@Override
	public List<Move> possible(Board board) {
		
		int Destination;
		final List<Move> legalMoves = new ArrayList<>(); 
		
		for(int i : POSSIBLE_MOVE_COORDINATES) {
			
			Destination = this.piecePosition + i;
			
			if(true) {
				final Tile DestinationTile = board.getTile(Destination); 
				
				if(!DestinationTile.tileOccupied()) { //비었으면 가도 된다
					legalMoves.add(new Move());
				}else {
					final Piece pieceAtDestination = DestinationTile.getPiece();
					final Colour pieceColour = pieceAtDestination.getPieceColour();
					
					if(this.pieceColour != pieceColour) { //우리편 아니면 잡음
						legalMoves.add(new Move());
					}
				}
			}
			
		}
		
		return ImmutableList.copyOf(legalMoves);
	}
	
}
