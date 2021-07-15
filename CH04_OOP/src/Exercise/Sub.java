package Exercise;

public class Sub {
	private int a,b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int Calculate() {
		if(a>b) {
			return a-b;
		}else {
			return b-a;
		}
	}

}
