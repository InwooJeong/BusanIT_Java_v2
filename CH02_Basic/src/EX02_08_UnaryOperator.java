
public class EX02_08_UnaryOperator {

	public static void main(String[] args) {
		int opr = 0;
		
		opr += 3; // opr = opr + 3
		
		System.out.println("opr++ ? : " + opr++); //��� �� ����
		System.out.println("opr ? : " + opr);
		System.out.println(++opr); //���� �� ���
		System.out.println(opr);
		System.out.println(opr--); //��� �� ����
		System.out.println(opr);
		System.out.println(--opr); //���� �� ���
		System.out.println(opr);
	}

}
