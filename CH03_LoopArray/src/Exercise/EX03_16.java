package Exercise;
import java.util.*;

public class EX03_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����","����","��"};
		
		String ms, cs; //����, ����
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ����");
		
		do {
			System.out.println("���� ���� ��!>> �׸��Ϸ��� �׸��� �Է�");
			int n = (int)(Math.random()*3); //��ǻ�� ���ÿ�
			ms = sc.next();
//			if(ms.equals("�׸�")) {
//				sc.close();
//				break;
//			}
			if(ms.equals("����")||ms.equals("����")||ms.equals("��")) { //��ȿ�� �˻�
			cs = str[n];
			if(ms.equals("����")) {
				if(cs.equals("����")) {
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �����ϴ�.");
				}else if(cs.equals("����")) {
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �����ϴ�.");
				}else if(cs.equals("��")){
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �̰���ϴ�.");
				}
			}else if(ms.equals("����")) {
				if(cs.equals("����")) {
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �̰���ϴ�.");
				}else if(cs.equals("����")) {
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �����ϴ�.");
				}else if(cs.equals("��")){
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �����ϴ�.");
				}
			}else if(ms.equals("��")) {
				if(cs.equals("����")) {
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �����ϴ�.");
				}else if(cs.equals("����")) {
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �̰���ϴ�.");
				}else if(cs.equals("��")) {
					System.out.println("����� = "+ms+", ��ǻ�� = "+cs+" : �����ϴ�.");
				}
			}
		  }else if(ms.equals("�׸�")) {
			  sc.close();
			  break;
		  }else {
			  System.out.println("�Է��� Ȯ���ϼ���!");
		  }
		}while(true);
			System.out.println("������ �����մϴ�...");
			sc.close();
			
	}

}
