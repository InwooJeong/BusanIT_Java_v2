
class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate; //��ȭ�� �޷���
	}
	public static double toKWR(double dollar) {
		return dollar*rate; //�޷��� ��ȭ��
	}
	public static void setRate(double r) {
		rate = r; //ȯ�� ���� KWR/$1
	}
}

public class EX04_08_StaticMember {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1121); //�̱� �޷� ȯ�� ����
		System.out.println("�鸸���� " + CurrencyConverter.toDollar(1000000) + "�޷�");
		System.out.println("��޷��� " + CurrencyConverter.toKWR(100) + "�� �Դϴ�.");
	}

}
