package board;

public class BoardUtils {
	
	public static final boolean[] FISRT_COLUMN = null;
	public static final boolean[] SECOND_COLUMN = null;
	public static final boolean[] SEVENTH_COLUMN = null;
	public static final boolean[] EIGHTH_COLUM = null;

	private BoardUtils() {
		//����
	}
	
	public static boolean validTile(int destination) {
		return destination>=0 && destination<64; //ü�� ���� 8*8
	}

}
