package Exercise;
import java.util.*;

public class EX02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��Ͻÿ�>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((b+c)<a||(a+c)<b||(a+b)<c) {
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		}else {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		
		sc.close();
	}

}
