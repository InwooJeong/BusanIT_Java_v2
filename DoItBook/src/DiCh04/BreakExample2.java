package DiCh04;

public class BreakExample2 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		for(i=0; ;i++) { //조건식 생략 (아래에 줄 것)
			sum += i;
			if(sum>=100) { // sum이 100이상 일 때 break 
				break; //반복문 중단
			}
				
		}
		System.out.println("i : " +i);
		System.out.println("sum : " +sum);
	}

}
