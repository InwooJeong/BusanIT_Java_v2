package DiCh08;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer(10020, "??????", 200);
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("??????");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
