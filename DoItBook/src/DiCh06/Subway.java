package DiCh06;

public class Subway {
	String lineNumber; //����ö �뼱
	int passengerCount; //�°� ��
	int money; //���Ծ�
	
	public Subway(String lineNumber) { //����ö �뼱 ��ȣ�� �Ű������� �޴� ������
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {//�°��� ����ö�� ź ��츦 ������ �޼���
		this.money += money; //���� ����
		passengerCount++; //�°� �� ����
	}
	
	public void showInfo() { //����ö ���� ����ϴ� �޼���
		System.out.println(lineNumber + "ȣ�� �°��� " + passengerCount + 
							"���̰�, ������ " + money + "�Դϴ�.");
	}

}
