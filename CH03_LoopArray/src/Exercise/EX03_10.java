package Exercise;
import java.util.*;

public class EX03_10 {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][4];
		
		System.out.println(Arrays.deepToString(arr)); //�ʱ� �� 0
		
		int m = 0; //Ƚ�� (10��)
		
		while(m<10) {
			int r = (int)(Math.random()*4); //��
			int c = (int)(Math.random()*4); //��
			System.out.println(r+"&"+c); //������ �� ���� Ȯ��
			if(arr[r][c]!=0) { //�� �ִٸ� m�ö󰡸� �ȵ�! -> 0�� 6���� ����
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
		
		int cnt=0; //0 ���� ���ϱ�
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0){
					cnt++;
				}
			}
		}
		System.out.println("0�� ���� : " + cnt);

	}

}
