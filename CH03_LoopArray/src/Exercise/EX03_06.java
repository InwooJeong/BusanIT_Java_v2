package Exercise;
import java.util.*;

public class EX03_06 {

	public static void main(String[] args) {
		
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int money = sc.nextInt();
		
		//////////////////////////////////////////////////
		if(money<=0) { //��ȿ�� �˻�
			System.out.println("�ݾ��� Ȯ���ϼ���!");
			sc.close();
		}
		
		for(int i=0;i<unit.length;i++) {
			int ea = money/unit[i];
			if(ea>0) {
				System.out.println(unit[i]+"�� �� : " + ea +"��");
				money = money%unit[i];
			}
		}
		
		sc.close();
		
	}

}
