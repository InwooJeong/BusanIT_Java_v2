package Exercise;
import java.util.*;

public class EX03_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�>>");
		
		int n = sc.nextInt();
		
		//--------------------------------------------------
		if(n<=0) { //��ȿ�� �˻� ������ 0 �Է½� �ȵ��ư�
			System.out.println("���� ����!");
			sc.close();
			return;
		}
		sc.close();
		//--------------------------------------------------
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
