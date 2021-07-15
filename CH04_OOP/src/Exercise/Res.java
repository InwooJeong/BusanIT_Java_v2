package Exercise;
import java.util.*;

public class Res {
	
	void con(){
		Scanner sc = new Scanner(System.in);
		
		Seat seat = new Seat();
		while(true) {
			System.out.println("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >>");
			
			int sel = sc.nextInt();
			
			switch(sel) {
				case 1:
					seat.resSeat();
					break;
				case 2:
					seat.allSeat();
					break;
				case 3:
					seat.calRes();
					break;
				case 4:
					System.out.println("종료");
					sc.close();
					return;
			}	
		}
	}
	
}
