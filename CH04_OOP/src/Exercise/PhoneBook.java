package Exercise;
import java.util.*;

class PhoneBook {
	Scanner sc = new Scanner(System.in);
	
	PhoneBook(){
		
	}
	
	public void show(){
		
		System.out.println("�ο���>>");
		int n = sc.nextInt();
		int i;
		
		Phone p[] = new Phone[n];
		for(i=0;i<p.length;i++) { //phone�� �Է�
			System.out.println("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = sc.next();
			String tel = sc.next();
			p[i] = new Phone(name,tel);
		}
		System.out.println("����Ǿ����ϴ�.");
		
//		for(int i=0;i<p.length;i++) { //���尪 Ȯ��
//			System.out.println(p[i].getName());
//			System.out.println(p[i].getTel());
//		}
		
		while(true) {
			System.out.println("�˻��� �̸�(�����Ϸ��� �׸�)>>");
			String name = sc.next();
			
//			for(int i=0;i<p.length;i++) { //���尪 Ȯ�� ������� ���� ������ ������
//				System.out.println(p[i].getName());
//				System.out.println(p[i].getTel());
//			}
			
			for(i=0;i<n;i++) {
				if(name.equals(p[i].getName())){
					System.out.println(name+"�� ��ȣ�� "+p[i].getTel());
					i--;
					break;
				}
			}
				if(name.equals("�׸�")) {
					System.out.println("�����մϴ�.");
					sc.close();
					return;
				}
				if(i==n){
					System.out.println(name+"�� �����ϴ�.");
				}
		}
	}
	
}
