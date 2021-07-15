package Exercise;
import java.util.*;

public class EX02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하시오>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((b+c)<a||(a+c)<b||(a+b)<c) {
			System.out.println("삼각형이 안됩니다.");
		}else {
			System.out.println("삼각형이 됩니다.");
		}
		
		sc.close();
	}

}
