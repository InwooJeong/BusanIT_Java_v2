package DiCh04;

public class BreakExample2 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		for(i=0; ;i++) { //���ǽ� ���� (�Ʒ��� �� ��)
			sum += i;
			if(sum>=100) { // sum�� 100�̻� �� �� break 
				break; //�ݺ��� �ߴ�
			}
				
		}
		System.out.println("i : " +i);
		System.out.println("sum : " +sum);
	}

}
