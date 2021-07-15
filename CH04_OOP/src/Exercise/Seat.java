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
	
	static void oneSeat(String seat[]) { //예약 메서드 좌석 (1줄)
		for(int i=0;i<seat.length;i++) {
			System.out.print(seat[i]+"\t");
		}
		System.out.println();
	}
	
	void allSeat() { //조회 메서드 좌석 (전체)
		System.out.print("S>>");
		Seat.oneSeat(s);
		System.out.print("A>>");
		Seat.oneSeat(a);
		System.out.print("B>>");
		Seat.oneSeat(b);
		System.out.println("<<조회 완료>>");
	}
	
	void inSeat(String seat[]) { //예약 - 예약 정보 좌석에 입력
		System.out.print("이름>>");
		String name = sc.next();
		
		System.out.println("번호>>");
		int num = sc.nextInt()-1;
		
		while(true) {
			if(seat[num].equals("---")) {
				seat[num] = name;
				break;
			}else {
				System.out.println("좌석을 확인하세요!");
				break;
			}
		}
	}
	
	void resSeat() { //예약 - 좌석 타입 선택
		
		while(true) {
			System.out.print("좌석구분 S(1), A(2), B(3)>>");
			
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
					System.out.println("좌석을 확인하세요!");
			}
		}
		
	}
	
	void resCan(String seat[]) { //취소 - 취소할 사람
		System.out.print("취소자 성함>>");
		String name = sc.next();
		for(int i=0;i<seat.length;i++) {
			if(name.equals(seat[i])) {
				seat[i] = "---";
			}else {
				System.out.println("성함을 확인하세요!");
				break;
			}
		}
	}
	
	void calRes() { //취소 실행 메서드
		while(true) {
			System.out.println("좌석 S:1, A:2, B:3>>");
			
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
					System.out.println("좌석을 확인하세요!");
			}
			
		}
	}
	
}
