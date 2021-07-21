package DiCh08;
import java.util.*;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
//		customerLee.bonusPoint = 1000;
//		
//		System.out.println(customerLee.showCustomerInfo());
//		
//		Customer customerKim = new VIPCustomer(10020, "김유신", 12345); //VIPCustomer를 Customer형으로 선언
//		customerKim.bonusPoint = 1000;
//		
//		System.out.println(customerKim.showCustomerInfo());
//		System.out.println("======= 할인율과 보너스 포인트 계산 =========");
//		
//		int price = 10000;
//		int leePrice = customerLee.calcPrice(price);
//		int kimPrice = customerKim.calcPrice(price);
//		
//		System.out.println(customerLee.getCustomerName() + " 님이 " + leePrice +"원 지불하셨습니다.");
//		System.out.println(customerLee.showCustomerInfo());
//		System.out.println(customerKim.getCustomerName() + " 님이 " + kimPrice +"원 지불하셨습니다.");
//		System.out.println(customerKim.showCustomerInfo());
		
		//같은 가격의 상품을 구입해도 등급에 따라 다른 할인율과 포인트가 적립
		//상속 관계 상위 클래스와 하위 클래스는 같은 상위 클래스 자료형으로 선언되어 생성할 수 있지만 재정의된 메서드는 각각 호출될 뿐 아니라 이름이 같은 메서드가 서로 다른 역할을 구현
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신"); //Array list에 집어 넣기
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("==== 고객 정보 출력 ===="); //다형성
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
			
		}

		System.out.println("==== 할인율과 보너스 포인트 계산 ===="); //다형성
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}

	}

}
