package Exercise;
import java.util.*;

public class EX03_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� �� ����");
		
		int n = sc.nextInt();
		
		/////////////////////////////////////////////////////////////////
		if(n<=0) { //��ȿ�� �˻�
			System.out.println("���ϴ� ���� ������ Ȯ���ϼ���!!!!");
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
		
		System.out.println("����� "+ (double)sum/rn.length);
		
	}

}
