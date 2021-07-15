package DB;

import java.util.*;

public class View {
	
	public static void main(String args[]) {
		BookDAO so = new BookDAO();
		so.getCon();
		
		//System.out.println(so.bList());
		so.bList();
		System.out.println();
		
	}
}
