
import java.util.*;
import java.text.*;

class Account { //���� Ŭ����
	DecimalFormat df = new DecimalFormat("#,###"); //õ���� ǥ��
	
	int balance = 0; //�ܾ�
	int amount = 0; //��, ��ݾ�
	int nm = 0; //��� �Ұ� ���� �ʱ�ȭ
	
	Account(){ //������
		
	}
	
	void deposit(int amount) { //�Ա� �޼ҵ� �Աݾ��� �޾Ƽ� �ܾ׿� �߰�
		balance += amount;
	}
	
	void withdraw(int amount) { //��� �޼ҵ� ��ݾ� �޾Ƽ� �ܾ׿��� ����
		if(balance>=amount) { //��ȿ�� �˻� -- ��ݾ��� �ܾ׺��� ���ų� ���� �� �� ����� �����ؾ� �Ѵ� -> ���߿� ������ �����ؼ� ����
			balance -= amount;
		}else {
			nm = 1;
			System.out.println(balance);
			String bal = df.format(balance);
			System.out.println(bal);
			System.out.println("�ܾ��� Ȯ���ϼ���! ���� ������ �ܾ��� "+ bal +"�� �Դϴ�."); //�ܾ��� ������ ��
		}
	}
	
	int getBalance() {
		return balance;
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat("#,###"); //õ���� ǥ��

		//Ŭ����, ��ĳ�� �غ�
		Account ma = new Account();
		Scanner sc = new Scanner(System.in);
		
		int amount = 0;

		String atm = "d"; //���¿� ��/���(d/w)
		String con = "y"; //�ŷ� ��� (y)
		
		System.out.println("�ŷ��� �����Ͻ÷��� y, �����Ͻ÷��� �ٸ� ��ư");
		
		con = sc.next();
		
		while(con.equals("y")) { //�ŷ� ���� -> ����ݸ޼ҵ� -> �ܰ� ������� ó�� ->�ŷ� ���� �� Ż��
			
			//////////////////////////////////////////////////////////////////////////////////
			System.out.println("�Ա��� d��, ����� w");
			ma.nm = 0; //nm�� �ʱ�ȭ
			
			atm = sc.next(); //����� �޼ҵ� ȣ�� �� ó��
			
			switch(atm){
				
				case "d":
					System.out.println("�Ա� �ݾ��� �Է��ϼ���.");
					amount = sc.nextInt();
					
					ma.deposit(amount);
					
					String bal2 = df2.format(ma.getBalance());
					
					System.out.println("�Ա� �� ������ �ܾ��� "+ bal2 + "�� �Դϴ�.");
					break;
					
				case "w":
					System.out.println("��� �ݾ��� �Է��ϼ���.");
					amount = sc.nextInt();
					
					ma.withdraw(amount);
					
					//System.out.println(ma.nm);
					String bal3 = df2.format(ma.getBalance());
					
					if(ma.nm == 1) {
						//System.out.println("nm���� 1");
						break;
					}else {
						//System.out.println("nm���� 0");
						System.out.println("��� �� ������ �ܾ��� "+ bal3 + "�� �Դϴ�.");
						break;	
					}
					
				default:
					System.out.println("�Է� ��ư�� Ȯ��");
					
			}
			//////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("�ŷ��� ��� ����? y/n");
			con = sc.next();
			
		}
			System.out.println("�̿����ּż� ����");
			sc.close();
			
	}

}

//�߰� �ϰ� ���� ���� -> ���� ��ȣ/���/��й�ȣ �迭 ��ȿ���˻� -> ���Ժθ� ���� ����? --���Խ�
//�޷�? ��¥? �ð� ������?
