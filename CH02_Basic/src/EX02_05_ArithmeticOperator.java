import java.util.*;

public class EX02_05_ArithmeticOperator {

	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : "); //��,��,�ʷ� ��ȯ�� ���� �Է�
		
		time = sc.nextInt();
		second = time % 60; //60���� ���� �������� �ʸ� �ǹ�
		minute = (time/60)%60; //60���� ���� ���� �ٽ� 60���� ���� �������� ���� �ǹ�
		hour = (time/60)/60; //60���� ���� ���� �ٽ� 60���� ���� ���� �ð��� �ǹ�
		
		System.out.println(time + "�ʴ�");
		System.out.println(hour + "�ð�");
		System.out.println(minute + "��");
		System.out.println(second + "���Դϴ�.");
		
		sc.close();
		
	}

}
