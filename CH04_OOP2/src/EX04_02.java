
public class EX04_02 {

	public static void main(String[] args) {
		
		MyExp num1 = new MyExp();
		num1.setBase(2);
		num1.setExp(3);
		
		MyExp num2 = new MyExp();
		num2.setBase(3);
		num2.setExp(4);
		
		System.out.println("2�� 3�� = " + num1.getValue());
		System.out.println("3�� 4�� = " + num2.getValue());
		
	}

}
