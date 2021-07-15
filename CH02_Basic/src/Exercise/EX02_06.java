package Exercise;
import java.util.*;

public class EX02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99 사이 정수를 입력하시오>>");
		
		int num = sc.nextInt();
		int a = num/10;
		int b = num%10;
		
		if((a==3||a==6||a==9)&&(b==3||b==6||b==9)) {
			System.out.println("박수 짝짝");
		}else if((a==3||a==6||a==9)^(b==3||b==6||b==9)) {
			System.out.println("박수 짝");
		}else {
			System.out.println("박수 없음");
		}
		
		sc.close();
		
	}
}
