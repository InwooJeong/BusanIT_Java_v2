import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {
		int lotto[] = new int [6]; //�ζ� ��ȣ 6�� ���� �迭
		
		//�ζ� ��ȣ 6�� �ֱ�
		for(int i=0;i<6;i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++) { //�ߺ� �� �迭�� ���� ������ �ȵ�
				if(lotto[i]==lotto[j]) {
					i--; //i ���� ��Ű�� �ȵȴ�.
					break;
				}
			}
		}
		
		//System.out.println(Arrays.toString(lotto));
		
		System.out.println("�̹��� �ζ� ��ȣ�� : ");
		
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+"\t");
		}
	}

}
