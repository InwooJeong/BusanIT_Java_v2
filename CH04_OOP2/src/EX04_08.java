
public class EX04_08 {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1148); //���� ȯ�� (09th Jul 21)
		System.out.println("�鸸���� " + CurrencyConverter.toDollar(1000000)+ "�޷�");
		System.out.println("��޷��� " + CurrencyConverter.toKWR(100)+ "��");

	}

}
