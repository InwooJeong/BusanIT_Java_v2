package DiCh04;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num; //do-while문 while조건 참이 아니라도 무조건 한 번은 do
			num++;
		} while(num<=10);
		
		System.out.println("1부터 10까지 합은 "+sum);

	}

}
