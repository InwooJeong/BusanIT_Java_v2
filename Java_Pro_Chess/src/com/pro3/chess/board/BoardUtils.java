package com.pro3.chess.board;

public class BoardUtils { //���� �� ��ü�� ������ �÷��� ���� �̵� �� �� �ִ���
	
	public static final boolean[] FISRT_COLUMN = initColumn(0);
	public static final boolean[] SECOND_COLUMN = initColumn(1);
	public static final boolean[] SEVENTH_COLUMN = initColumn(6);
	public static final boolean[] EIGHTH_COLUM = initColumn(7);
	
	public static final int NumOfTitles = 64;
	public static final int NumofTitlesPerRow = 8;

	private BoardUtils() {
	}
	
	private static boolean[] initColumn(int columnNumber) {
		
		final boolean[] column = new boolean[NumOfTitles];
		
		do {
			column[columnNumber] = true;
			columnNumber += NumofTitlesPerRow;
		}while(columnNumber<NumOfTitles);
		return column;
	}

	public static boolean validTile(final int coordinate) {
		return coordinate>=0 && coordinate<NumOfTitles; //ü�� ���� 8*8
	}

}
