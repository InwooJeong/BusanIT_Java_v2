package Exercise;
import java.util.*;

public class EX03_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ��?");
		
		int n = sc.nextInt();
		
		///////////////////////////////////////////////////////////////////
		if(n<=0||n>100) {//��ȿ�� �˻�
			System.out.println("���� ���� Ȯ��!!!!!!!!!!!!!!!");
			sc.close();
		}else {
		
		int arr[] = new int [n];
		
		System.out.println(arr.length); //�迭 ũ�� Ȯ��
		
		for(int i=0;i<arr.length;i++) {
			int r = (int)(Math.random()*100+1); //1~100���� ����
			
			int chk = 0; //�ߺ��� üũ��
			
			for(int j=0;j<arr.length;j++) {
				if(r==arr[j]) {
					chk = 1;
					break;
				}
				if(chk==1) {
					i--;  //�ߺ��� ������ Ƚ���� �� �� ���δ�.
					continue;
				}
				arr[i] = r;
			}
			
			sc.close();
		}
		System.out.println(Arrays.toString(arr)); //���� Ȯ��
				
		}
	}

}
