package DiCh08;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10020, "김유신", 12345); //VIPCustomer를 Customer형으로 선언
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("======= 할인율과 보너스 포인트 계산 =========");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + " 님이 " + leePrice +"원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + " 님이 " + kimPrice +"원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		
		//같은 가격의 상품을 구입해도 등급에 따라 다른 할인율과 포인트가 적립
		//상속 관계 상위 클래스와 하위 클래스는 같은 상위 클래스 자료형으로 선언되어 생성할 수 있지만 재정의된 메서드는 각각 호출될 뿐 아니라 이름이 같은 메서드가 서로 다른 역할을 구현

	}

}
