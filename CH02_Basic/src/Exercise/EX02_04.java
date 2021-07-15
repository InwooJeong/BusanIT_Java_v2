package Exercise;
import java.util.*;

public class EX02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력>>");
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
		System.out.println("중간 값은 "+rs);
		
		sc.close();
		
	}

}
