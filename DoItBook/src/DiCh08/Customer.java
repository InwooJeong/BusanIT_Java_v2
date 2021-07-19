package DiCh08;

public class Customer {
	protected int customerID; //고객 id
	protected String customerName, customerGrade; //고객 이름, 등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; //적립 비율
	
//	public Customer() { //디폴트 생성자
//		customerGrade = "SILVER"; //기본 등급 
//		bonusRatio = 0.01; //기본 보너스 적립 비율
//		System.out.println("Customer() 생성자 호출!");
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int calcPrice(int price) { //보너스 포인트 적립, 지불 가격 계산
		bonusPoint += price*bonusRatio; //보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() { //고객 정보 반환 메서드
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
