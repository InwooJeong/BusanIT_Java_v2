
public class EX03_10_SalesRevenue {

	public static void main(String[] args) {
		int intArray[][] = {{90,90,110,110},
						{120,110,100,110},
						{120,140,130,150}};
		double sum = 0;
		
		for(int i=0;i<intArray.length;i++) { //3
			for (int j=0;j<intArray[i].length;j++) { //4
				sum += intArray[i][j];
			}
		}
		
		System.out.println("���� 3�Ⱓ ���� �Ѿ��� " +sum+ "�̸�, ����� ������ "+sum/intArray.length +"�Դϴ�.");
		
	}

}
