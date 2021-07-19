package DiCh08;

public class TestA { //가상메서드 255~256p 참조
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}

	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
	}

}
