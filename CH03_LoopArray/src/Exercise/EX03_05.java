package Exercise;
import java.util.*;

public class EX03_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) { //��ȿ�� �˻�?? �̷��� ���� if?
			System.out.println((i+1)+"��° ������ �Է��Ͻÿ�>>");
			n = sc.nextInt();
			arr[i] = n;
			System.out.println("���� ���� �Է� �� �� : "+Arrays.toString(arr));
		}
		
		sc.close();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("3�� ����� : ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+"\t");
			}
		}
		
	}

}
