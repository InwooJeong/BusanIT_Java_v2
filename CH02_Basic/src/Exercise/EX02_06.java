package Exercise;
import java.util.*;

public class EX02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99 ���� ������ �Է��Ͻÿ�>>");
		
		int num = sc.nextInt();
		int a = num/10;
		int b = num%10;
		
		if((a==3||a==6||a==9)&&(b==3||b==6||b==9)) {
			System.out.println("�ڼ� ¦¦");
		}else if((a==3||a==6||a==9)^(b==3||b==6||b==9)) {
			System.out.println("�ڼ� ¦");
		}else {
			System.out.println("�ڼ� ����");
		}
		
		sc.close();
		
	}
}
