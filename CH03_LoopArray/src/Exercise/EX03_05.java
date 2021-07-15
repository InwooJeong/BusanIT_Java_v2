package Exercise;
import java.util.*;

public class EX03_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) { //유효성 검사?? 이렇게 말고 if?
			System.out.println((i+1)+"번째 정수를 입력하시오>>");
			n = sc.nextInt();
			arr[i] = n;
			System.out.println("지금 까지 입력 된 수 : "+Arrays.toString(arr));
		}
		
		sc.close();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("3의 배수는 : ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+"\t");
			}
		}
		
	}

}
