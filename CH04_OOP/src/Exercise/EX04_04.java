package Exercise;

public class EX04_04 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) {
			System.out.println("t�� r�� ����O");
		}else {
			System.out.println("t�� r�� ����X");
		}
		
		if(t.contains(s)) {
			System.out.println("t�� s�� ����O");
		}else {
			System.out.println("t�� s�� ����X");
		}
	}

}
