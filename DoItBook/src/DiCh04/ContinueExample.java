package DiCh04;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				continue; //if �� �� �� ���� ������ �����ϰ� �ݺ��� �ٽ� ����
			}
			total += i; //if ���� �� �� ����
		}
		System.out.println("1���� 100���� Ȧ�� ���� : "+total);

	}

}
