package DiCh08;

public class VIPCustomer extends Customer{ //Customer 클래스를 상속받음
	private int agentID; //VIP 고객 상담원 아이디
	double saleRatio; //할인율
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //상위 클래스 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) { //재정의한 메서드
		bonusPoint += price*bonusRatio; //보너스 포인트 적립
		return price - (int)(price*saleRatio); //할인된 가격을 계산하여 반환
	}

}
