package DiCh07;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int[] a:arr) { //���� 1���� �迭�� �Ȱ��� arr�迭�� �������� �ϳ��� ������. �������� a�� ����.
			for(int i:a) { //�� ���� ����Ͽ� ���� a�� i�� ������.
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
