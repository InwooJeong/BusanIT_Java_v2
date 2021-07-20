package DB;

public class View {
	
	public static void main(String args[]) {
		
		new BookDAO().bList();
		System.out.println();
		
		new CusDAO().cList();
		System.out.println();
		
	}
}
