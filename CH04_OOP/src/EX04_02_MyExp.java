class MyExp{
	private int base, exp;
	
	public int getValue() {
		int res = 1;
		for(int i=0;i<exp;i++) {
			res = res*base;
		}
		return res;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}

public class EX04_02_MyExp {
	/*int base;
	int exp;
	int getValue() {
		int res = 1;
		for(int i=0;i<exp;i++) {
			res = res*base;
		}
		return res;
	}
*/
	public static void main(String[] args) {
		/*EX04_02_MyExp number1 = new EX04_02_MyExp();
		number1.base = 2;
		number1.exp = 3;
		
		EX04_02_MyExp number2 = new EX04_02_MyExp();
		number2.base = 3;
		number2.exp = 4;
		
		System.out.println("2ÀÇ 3½Â = " + number1.getValue());
		System.out.println("3ÀÇ 4½Â = " + number2.getValue());*/
		
		MyExp num1 = new MyExp();
		num1.setBase(2);
		num1.setExp(3);
		System.out.println(num1.getValue());
		
		MyExp num2 = new MyExp();
		num2.setBase(3);
		num2.setExp(4);
		System.out.println(num2.getValue());
	}

}
