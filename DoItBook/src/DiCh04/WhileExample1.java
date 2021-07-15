package DiCh04;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { //num이 10 이하 까
			sum += num; // sum에 num을 넣는데
			num++; // num에 1씩 더해간다.
		}
		System.out.println("1부터 10까지 합은 " + sum );

	}

}
