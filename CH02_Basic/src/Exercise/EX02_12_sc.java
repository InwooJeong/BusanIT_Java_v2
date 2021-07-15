package Exercise;
import java.util.*;

public class EX02_12_sc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("연산>>");
		
		int n1 = sc.nextInt();
		String opr = sc.next();
		int n2 = sc.nextInt();
		
		switch(opr) {
			case "+":
				System.out.println(n1+opr+n2+"의 계산 결과는"+(n1+n2));
				break;
			case "-":
				System.out.println(n1+opr+n2+"의 계산 결과는"+(n1-n2));
				break;
			case "*":
				System.out.println(n1+opr+n2+"의 계산 결과는"+(n1*n2));
				break;
			case "/":
				if(n2!=0) {
				System.out.println(n1+opr+n2+"의 계산 결과는"+(n1/n2));
				break;
				}else {
					System.out.println("0으로 나눌 수 없습니다.");
				}
			default:
				System.out.println("입력을 확인하세요@@@");	
		}
		
		sc.close();
		
	}

}
