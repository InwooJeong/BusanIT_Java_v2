package DiCh04;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num; //do-while�� while���� ���� �ƴ϶� ������ �� ���� do
			num++;
		} while(num<=10);
		
		System.out.println("1���� 10���� ���� "+sum);

	}

}
