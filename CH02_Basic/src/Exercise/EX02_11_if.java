package Exercise;
import java.util.*;

public class EX02_11_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mon = sc.nextInt();
		
		if(mon==3||mon==4||mon==5) {
			System.out.println("��");
		}else if(mon==6||mon==7||mon==8) {
			System.out.println("����");
		}else if(mon==9||mon==10||mon==11) {
			System.out.println("����");
		}else if(mon==12||mon==1||mon==2) {
			System.out.println("�ܿ�");
		}else {
			System.out.println("�߸� �Է�");
		}
		
		sc.close();
		
	}

}
