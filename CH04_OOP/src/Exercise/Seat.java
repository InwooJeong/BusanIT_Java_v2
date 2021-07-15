package Exercise;
import java.util.*;

public class Seat {
	private String[] s,a,b;
	Scanner sc = new Scanner(System.in);
	
	Seat() {
		s = new String [10];
		a = new String [10];
		b = new String [10];
		
		for(int i=0;i<s.length;i++) {
			s[i]="---";
			a[i]="---";
			b[i]="---";
		}
		
	}
	
	static void oneSeat(String seat[]) { //���� �޼��� �¼� (1��)
		for(int i=0;i<seat.length;i++) {
			System.out.print(seat[i]+"\t");
		}
		System.out.println();
	}
	
	void allSeat() { //��ȸ �޼��� �¼� (��ü)
		System.out.print("S>>");
		Seat.oneSeat(s);
		System.out.print("A>>");
		Seat.oneSeat(a);
		System.out.print("B>>");
		Seat.oneSeat(b);
		System.out.println("<<��ȸ �Ϸ�>>");
	}
	
	void inSeat(String seat[]) { //���� - ���� ���� �¼��� �Է�
		System.out.print("�̸�>>");
		String name = sc.next();
		
		System.out.println("��ȣ>>");
		int num = sc.nextInt()-1;
		
		while(true) {
			if(seat[num].equals("---")) {
				seat[num] = name;
				break;
			}else {
				System.out.println("�¼��� Ȯ���ϼ���!");
				break;
			}
		}
	}
	
	void resSeat() { //���� - �¼� Ÿ�� ����
		
		while(true) {
			System.out.print("�¼����� S(1), A(2), B(3)>>");
			
			int sel = sc.nextInt();
			
			switch(sel) {
				case 1:
					System.out.print("S>>");
					oneSeat(s);
					inSeat(s);
					return;
				case 2:
					System.out.print("A>>");
					oneSeat(a);
					inSeat(a);
					return;
				case 3:
					System.out.print("B>>");
					oneSeat(b);
					inSeat(b);
					return;
				default :
					System.out.println("�¼��� Ȯ���ϼ���!");
			}
		}
		
	}
	
	void resCan(String seat[]) { //��� - ����� ���
		System.out.print("����� ����>>");
		String name = sc.next();
		for(int i=0;i<seat.length;i++) {
			if(name.equals(seat[i])) {
				seat[i] = "---";
			}else {
				System.out.println("������ Ȯ���ϼ���!");
				break;
			}
		}
	}
	
	void calRes() { //��� ���� �޼���
		while(true) {
			System.out.println("�¼� S:1, A:2, B:3>>");
			
			int sel = sc.nextInt();
			
			switch(sel){
				case 1:
					System.out.print("S>>");
					oneSeat(s);
					resCan(s);
					return;
				case 2:
					System.out.print("A>>");
					oneSeat(a);
					resCan(a);
					return;
				case 3:
					System.out.print("B>>");
					oneSeat(b);
					resCan(b);
					return;
				default :
					System.out.println("�¼��� Ȯ���ϼ���!");
			}
			
		}
	}
	
}
