package board;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import pieces.Piece;

public abstract class Tile {
	
	protected final int tileCoordinate;
	
	private static final Map<Integer, EmptyTile> ET = createAllPossilbeET();
	
	private static Map<Integer, EmptyTile> createAllPossilbeET() {
		
		final Map<Integer, EmptyTile> emptyTileInfo = new HashMap<>();
		
		for(int i=0;i<64;i++) { //ü����
			emptyTileInfo.put(i, new EmptyTile(i));
		}
		
		//https://hipdizzy.tistory.com/60
		return ImmutableMap.copyOf(emptyTileInfo);
	}
	
	public static Tile createTile(final int tileCoordinate, final Piece piece) {
		if(piece != null) { //Ÿ���� �ǽ��� �ִ�? -> Ÿ���� ���� / Ÿ���� ��
			return new OccupiedTile(tileCoordinate, piece);
		}else {
			return ET.get(tileCoordinate);
		}
	}
	
	Tile(int tileCoordinate){
		this.tileCoordinate = tileCoordinate;
	}

	public abstract boolean tileOccupied(); //Ÿ�Ͽ� ���� �ִ���?
	
	public abstract Piece getPiece();
	
	public static final class EmptyTile extends Tile{
		
		private EmptyTile(final int coordinate) { //���⼭ 
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
		
		private OccupiedTile(int tileCoordinate, Piece pieceOn) {
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
