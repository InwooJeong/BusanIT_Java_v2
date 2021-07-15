package Exercise;
import java.util.*;

public class EX03_10 {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][4];
		
		System.out.println(Arrays.deepToString(arr)); //초기 값 0
		
		int m = 0; //횟수 (10번)
		
		while(m<10) {
			int r = (int)(Math.random()*4); //행
			int c = (int)(Math.random()*4); //열
			System.out.println(r+"&"+c); //랜덤한 수 생성 확인
			if(arr[r][c]!=0) { //값 있다면 m올라가면 안됨! -> 0은 6개만 존재
				continue;
			}else {
				arr[r][c] = (int)(Math.random()*10+1);
				m++;
			}
		}
		System.out.println(m);
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int cnt=0; //0 개수 구하기
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0){
					cnt++;
				}
			}
		}
		System.out.println("0의 개수 : " + cnt);

	}

}
