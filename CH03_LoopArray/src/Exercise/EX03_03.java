package Exercise;
import java.util.*;

public class EX03_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오>>");
		
		int n = sc.nextInt();
		
		//--------------------------------------------------
		if(n<=0) { //유효성 검사 음수랑 0 입력시 안돌아감
			System.out.println("양의 정수!");
			sc.close();
			return;
		}
		sc.close();
		//--------------------------------------------------
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
