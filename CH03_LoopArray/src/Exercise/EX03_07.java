package Exercise;
import java.util.*;

public class EX03_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 수 개수");
		
		int n = sc.nextInt();
		
		/////////////////////////////////////////////////////////////////
		if(n<=0) { //유효성 검사
			System.out.println("원하는 수의 개수를 확인하세요!!!!");
			sc.close();
		}
		
		int rn[] = new int[n];
		
		sc.close();
		
		for(int i=0;i<rn.length;i++) {
			int r = (int)(Math.random()*10+1);
			rn[i] = r;
		}
		
		int sum = 0;
		
		for(int i=0;i<rn.length;i++) {
			sum += rn[i];
		}
		
		System.out.println(Arrays.toString(rn));
		System.out.println(sum);
		
		System.out.println("평균은 "+ (double)sum/rn.length);
		
	}

}
