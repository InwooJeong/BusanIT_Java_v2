
public class Test1 {
	
	//method "����"
	static int print1(int x, int y) {
		int z;
		z = x + y;
		
		return z;

	}
	
	//main method : ���� ���� ���α׷��� ������(entry point)
	public static void main(String[] args) {
		
		int a;
		
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
		
		a = t1.a1;
		t1.print2();
		t1.print2();
		
		System.out.println(a);
		
//		a = print1(10,20);
//		System.out.println(a);
		
		System.out.println(print1(20,10));
	}

}
