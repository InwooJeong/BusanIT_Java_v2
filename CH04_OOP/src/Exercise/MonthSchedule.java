package Exercise;
import java.util.*;

public class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	Day day[];
	
	MonthSchedule(int day){
		this.day = new Day[day];
		for(int i=0;i<this.day.length;i++) {
			this.day[i] = new Day();
			//System.out.println(i); //��¥ Ȯ��
		}
	}
	
	private void input() { //1
		
		System.out.println("��¥(1~30)?");
		int day = sc.nextInt()-1;
		
		if(day<0 || day>30) {
			System.out.println("��¥ Ȯ��!");
			return;
		}

		System.out.println("����(��ĭ�����Է�)?");
		String work = sc.next();
		
		this.day[day].set(work);
	}
	
	private void view() { //2
		
		System.out.println("��¥(1~30)?");
		int day = sc.nextInt()-1;
		
		if(day<0 || day>30) {
			System.out.println("��¥ Ȯ��!");
			return;
		}
	    
	    System.out.print((day+1)+"���� �� ���� ");
	    this.day[day].show();
	    
	}
	
	private void finish() { //3
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
		return;
	}
	
	public void run() {
		//System.out.println("30"); //��������?
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3)");
			int n = sc.nextInt();

			switch(n) {
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
			}
		}
	}
	

}
