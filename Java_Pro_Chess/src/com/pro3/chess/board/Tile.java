package com.pro3.chess.board;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.pro3.chess.piece.Piece;

public abstract class Tile {
	
	protected final int tileCoordinate;
	
	private static final Map<Integer, EmptyTile> ET = createAllPossilbeET();
	
	private static Map<Integer, EmptyTile> createAllPossilbeET() {
		
		final Map<Integer, EmptyTile> emptyTileInfo = new HashMap<>();
		
		for(int i=0;i<BoardUtils.NumOfTitles;i++) { //체스판
			emptyTileInfo.put(i, new EmptyTile(i));
		}
		
		//https://hipdizzy.tistory.com/60
		return ImmutableMap.copyOf(emptyTileInfo);
	}
	
	public static Tile createTile(final int tileCoordinate, final Piece piece) {
		if(piece != null) { //타일이 피스가 있다? -> 타일이 점령 / 타일이 빔
			return new OccupiedTile(tileCoordinate, piece);
		}else {
			return ET.get(tileCoordinate);
		}
	}
	
	Tile(final int tileCoordinate){
		this.tileCoordinate = tileCoordinate;
	}

	public abstract boolean tileOccupied(); //타일에 말이 있는지?
	
	public abstract Piece getPiece();
	
	public static final class EmptyTile extends Tile{
		
		private EmptyTile(final int coordinate) { //여기서 
			super(coordinate);
		}

		@Override
		public boolean tileOccupied() {
			return false;
		}

		@Override
		public Piece getPiece() {
			return null;
		}
		
	}
	
	public static final class OccupiedTile extends Tile{
		
		private final Piece pieceOn;
		
		private OccupiedTile(int tileCoordinate, final Piece pieceOn) {
			super(tileCoordinate);
			this.pieceOn = pieceOn;
		}
		
		@Override
		public boolean tileOccupied() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Piece getPiece() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

 }
