package DiCh04;

public class NestedLoop {

	public static void main(String[] args) {
		int dan, times;
		
		for(dan=2;dan<=9;dan++) { //�ܺ� �ݺ� 2~9��
			for(times=1;times<=9;times++) { //���� �ݺ� �� �ܿ� 1~9 ����
				System.out.println(dan + "x" + times + "=" +dan*times);
			}
			System.out.println();
		}

	}

}
