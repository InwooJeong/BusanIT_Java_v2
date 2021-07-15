
import java.util.*;
import java.text.*;

class Account { //계좌 클래스
	DecimalFormat df = new DecimalFormat("#,###"); //천단위 표시
	
	int balance = 0; //잔액
	int amount = 0; //입, 출금액
	int nm = 0; //출금 불가 판정 초기화
	
	Account(){ //생성자
		
	}
	
	void deposit(int amount) { //입금 메소드 입금액을 받아서 잔액에 추가
		balance += amount;
	}
	
	void withdraw(int amount) { //출금 메소드 출금액 받아서 잔액에서 감소
		if(balance>=amount) { //유효성 검사 -- 출금액이 잔액보다 같거나 많을 때 만 출금이 가능해야 한다 -> 나중에 수수료 생각해서 수정
			balance -= amount;
		}else {
			nm = 1;
			System.out.println(balance);
			String bal = df.format(balance);
			System.out.println(bal);
			System.out.println("잔액을 확인하세요! 현재 귀하의 잔액은 "+ bal +"원 입니다."); //잔액이 부족할 시
		}
	}
	
	int getBalance() {
		return balance;
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat("#,###"); //천단위 표시

		//클래스, 스캐너 준비
		Account ma = new Account();
		Scanner sc = new Scanner(System.in);
		
		int amount = 0;

		String atm = "d"; //계좌에 입/출금(d/w)
		String con = "y"; //거래 계속 (y)
		
		System.out.println("거래를 시작하시려면 y, 종료하시려면 다른 버튼");
		
		con = sc.next();
		
		while(con.equals("y")) { //거래 시작 -> 입출금메소드 -> 잔고 변경사항 처리 ->거래 종료 및 탈출
			
			//////////////////////////////////////////////////////////////////////////////////
			System.out.println("입금은 d를, 출금은 w");
			ma.nm = 0; //nm값 초기화
			
			atm = sc.next(); //입출금 메소드 호출 및 처리
			
			switch(atm){
				
				case "d":
					System.out.println("입금 금액을 입력하세요.");
					amount = sc.nextInt();
					
					ma.deposit(amount);
					
					String bal2 = df2.format(ma.getBalance());
					
					System.out.println("입금 후 귀하의 잔액은 "+ bal2 + "원 입니다.");
					break;
					
				case "w":
					System.out.println("출금 금액을 입력하세요.");
					amount = sc.nextInt();
					
					ma.withdraw(amount);
					
					//System.out.println(ma.nm);
					String bal3 = df2.format(ma.getBalance());
					
					if(ma.nm == 1) {
						//System.out.println("nm값이 1");
						break;
					}else {
						//System.out.println("nm값이 0");
						System.out.println("출금 후 귀하의 잔액은 "+ bal3 + "원 입니다.");
						break;	
					}
					
				default:
					System.out.println("입력 버튼을 확인");
					
			}
			//////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("거래를 계속 진행? y/n");
			con = sc.next();
			
		}
			System.out.println("이용해주셔서 감사");
			sc.close();
			
	}

}

//추가 하고 싶은 내용 -> 계좌 번호/사람/비밀번호 배열 유효성검사 -> 가입부를 따로 빼나? --정규식
//달력? 날짜? 시간 수수료?
