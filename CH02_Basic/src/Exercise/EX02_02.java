package Exercise;
import java.util.*;

public class EX02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2자리수 정수 입력(10~99)>>");
		int num = sc.nextInt();
		
		if(num < 10 || num >99) {
			System.out.println("10~99 사이 정수만 입력하세요.");
		}else if(num/10==num%10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리다 다릅니다.");
		}
		
		sc.close();
		
	}

}
