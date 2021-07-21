package DiCh08;
import java.util.*;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("�̼���");
//		customerLee.bonusPoint = 1000;
//		
//		System.out.println(customerLee.showCustomerInfo());
//		
//		Customer customerKim = new VIPCustomer(10020, "������", 12345); //VIPCustomer�� Customer������ ����
//		customerKim.bonusPoint = 1000;
//		
//		System.out.println(customerKim.showCustomerInfo());
//		System.out.println("======= �������� ���ʽ� ����Ʈ ��� =========");
//		
//		int price = 10000;
//		int leePrice = customerLee.calcPrice(price);
//		int kimPrice = customerKim.calcPrice(price);
//		
//		System.out.println(customerLee.getCustomerName() + " ���� " + leePrice +"�� �����ϼ̽��ϴ�.");
//		System.out.println(customerLee.showCustomerInfo());
//		System.out.println(customerKim.getCustomerName() + " ���� " + kimPrice +"�� �����ϼ̽��ϴ�.");
//		System.out.println(customerKim.showCustomerInfo());
		
		//���� ������ ��ǰ�� �����ص� ��޿� ���� �ٸ� �������� ����Ʈ�� ����
		//��� ���� ���� Ŭ������ ���� Ŭ������ ���� ���� Ŭ���� �ڷ������� ����Ǿ� ������ �� ������ �����ǵ� �޼���� ���� ȣ��� �� �ƴ϶� �̸��� ���� �޼��尡 ���� �ٸ� ������ ����
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���"); //Array list�� ���� �ֱ�
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");
		Customer customerYoul = new GoldCustomer(10040, "������");
		Customer customerKim = new VIPCustomer(10050, "������", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("==== �� ���� ��� ===="); //������
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
			
		}

		System.out.println("==== �������� ���ʽ� ����Ʈ ��� ===="); //������
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		}

	}

}
