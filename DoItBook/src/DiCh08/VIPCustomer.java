package DiCh08;

public class VIPCustomer extends Customer{ //Customer Ŭ������ ��ӹ���
	private int agentID; //VIP �� ���� ���̵�
	double saleRatio; //������
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() ������ ȣ��");
//	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //���� Ŭ���� ������ ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) { //�������� �޼���
		bonusPoint += price*bonusRatio; //���ʽ� ����Ʈ ����
		return price - (int)(price*saleRatio); //���ε� ������ ����Ͽ� ��ȯ
	}

}
