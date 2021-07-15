package Exercise;
import java.util.*;

public class EX03_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위","바위","보"};
		
		String ms, cs; //내가, 컴이
		
		System.out.println("컴퓨터와 가위 바위 보 게임");
		
		do {
			System.out.println("가위 바위 보!>> 그만하려면 그만을 입력");
			int n = (int)(Math.random()*3); //컴퓨터 선택용
			ms = sc.next();
//			if(ms.equals("그만")) {
//				sc.close();
//				break;
//			}
			if(ms.equals("가위")||ms.equals("바위")||ms.equals("보")) { //유효성 검사
			cs = str[n];
			if(ms.equals("가위")) {
				if(cs.equals("가위")) {
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 비겼습니다.");
				}else if(cs.equals("바위")) {
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 졌습니다.");
				}else if(cs.equals("보")){
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 이겼습니다.");
				}
			}else if(ms.equals("바위")) {
				if(cs.equals("가위")) {
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 이겼습니다.");
				}else if(cs.equals("바위")) {
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 비겼습니다.");
				}else if(cs.equals("보")){
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 졌습니다.");
				}
			}else if(ms.equals("보")) {
				if(cs.equals("가위")) {
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 졌습니다.");
				}else if(cs.equals("바위")) {
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 이겼습니다.");
				}else if(cs.equals("보")) {
					System.out.println("사용자 = "+ms+", 컴퓨터 = "+cs+" : 비겼습니다.");
				}
			}
		  }else if(ms.equals("그만")) {
			  sc.close();
			  break;
		  }else {
			  System.out.println("입력을 확인하세요!");
		  }
		}while(true);
			System.out.println("게임을 종료합니다...");
			sc.close();
			
	}

}
