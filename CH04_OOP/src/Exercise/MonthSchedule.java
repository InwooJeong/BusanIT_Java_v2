package Exercise;
import java.util.*;

public class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	Day day[];
	
	MonthSchedule(int day){
		this.day = new Day[day];
		for(int i=0;i<this.day.length;i++) {
			this.day[i] = new Day();
			//System.out.println(i); //날짜 확인
		}
	}
	
	private void input() { //1
		
		System.out.println("날짜(1~30)?");
		int day = sc.nextInt()-1;
		
		if(day<0 || day>30) {
			System.out.println("날짜 확인!");
			return;
		}

		System.out.println("할일(빈칸없이입력)?");
		String work = sc.next();
		
		this.day[day].set(work);
	}
	
	private void view() { //2
		
		System.out.println("날짜(1~30)?");
		int day = sc.nextInt()-1;
		
		if(day<0 || day>30) {
			System.out.println("날짜 확인!");
			return;
		}
	    
	    System.out.print((day+1)+"일의 할 일은 ");
	    this.day[day].show();
	    
	}
	
	private void finish() { //3
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		return;
	}
	
	public void run() {
		//System.out.println("30"); //내려오나?
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)");
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
