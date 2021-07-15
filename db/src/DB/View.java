package DB;

import java.util.*;

public class View {
	
	public static void main(String args[]) {
		BookDAO bdao = new BookDAO();
		bdao.getCon();
		
		//System.out.println(so.bList());
		bdao.bList();
		System.out.println();
		
		CusDAO cdao = new CusDAO();
		cdao.getCon();
		cdao.cList();
		System.out.println();
	
		
	}
}
