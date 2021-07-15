package Exercise;

public class Div {
	private int a,b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int Calculate() {
		if(b == 0 || a == 0) {
			System.out.println("0으로 나눌 수 없어요 :(");
			return 0;
		}
		
		if(a>b) {
			return a/b;
		}else {
			return b/a;
		}
	}
		
}
