package Exercise;
import java.util.*;

public class EX02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		int num = sc.nextInt();
		
		if(num < 10 || num >99) {
			System.out.println("10~99 ���� ������ �Է��ϼ���.");
		}else if(num/10==num%10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		sc.close();
		
	}

}
