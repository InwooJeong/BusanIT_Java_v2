package DiCh04;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { //num�� 10 ���� ��
			sum += num; // sum�� num�� �ִµ�
			num++; // num�� 1�� ���ذ���.
		}
		System.out.println("1���� 10���� ���� " + sum );

	}

}
