
public interface PhoneInterface { //�������̽� ����
	final int TIMEOUT = 1000; //��� �ʵ� ����
	void sendCall(); //�߻� �޼ҵ�
	void receiveCall(); // "
	default void printLogo() { //default �޼ҵ�
		System.out.println("**Phone**");
	}

}
