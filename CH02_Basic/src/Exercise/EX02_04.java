package Exercise;
import java.util.*;

public class EX02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է�>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int rs = 0;
		
		if((a>=b&&b>=c)||(c>=b&&b>=a)) {
			rs=b;
		}else if((b>=a&&a>=c)||(c>=a&&a>=b)){
			rs=a;
		}else {
			rs=c;
		}
		System.out.println("�߰� ���� "+rs);
		
		sc.close();
		
	}

}
