
public class SamsungPhone implements PhoneInterface {
	// PhoneInterface�� ��� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("�츮��������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Խ��ϴ�.");
	}
	
	//�޼ҵ� �߰�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}

}