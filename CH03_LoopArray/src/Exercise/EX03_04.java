package Exercise;
import java.util.*;

public class EX03_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		
		String s = sc.next();
		
		//-------------------------------------------------------------
		if(s.length()!=1) { //��ȿ�� 1 �ϳ� ����
			System.out.println("�ϳ�!");
			sc.close();
		}else {
		//-------------------------------------------------------------
		char c = s.charAt(0);
			
		//-------------------------------------------------------------
			if(c<'a'||c>'z') { //��ȿ�� 2 ���ĺ� �ҹ��� �� ex)�ѱ� ������ ������
				System.out.println("�ҹ���!");
				sc.close();
			}else {
		//-------------------------------------------------------------
			for(char i=c;i>='a';i--) {
				for(char j='a';j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		
			sc.close();
			}
		}
	}

}
