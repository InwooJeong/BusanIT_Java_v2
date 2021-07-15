package Exercise;
import java.util.*;

public class EX03_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 몇 개?");
		
		int n = sc.nextInt();
		
		///////////////////////////////////////////////////////////////////
		if(n<=0||n>100) {//유효성 검사
			System.out.println("정수 개수 확인!!!!!!!!!!!!!!!");
			sc.close();
		}else {
		
		int arr[] = new int [n];
		
		System.out.println(arr.length); //배열 크기 확인
		
		for(int i=0;i<arr.length;i++) {
			int r = (int)(Math.random()*100+1); //1~100사이 랜덤
			
			int chk = 0; //중복값 체크용
			
			for(int j=0;j<arr.length;j++) {
				if(r==arr[j]) {
					chk = 1;
					break;
				}
				if(chk==1) {
					i--;  //중복값 있으면 횟수를 한 번 줄인다.
					continue;
				}
				arr[i] = r;
			}
			
			sc.close();
		}
		System.out.println(Arrays.toString(arr)); //정수 확인
				
		}
	}

}
