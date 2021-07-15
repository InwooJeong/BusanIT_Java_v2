package DiCh04;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				continue; //if 참 일 시 이후 수행을 생략하고 반복문 다시 수행
			}
			total += i; //if 거짓 일 시 수행
		}
		System.out.println("1부터 100까지 홀수 합은 : "+total);

	}

}
