package DiCh07;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] strArray = {"Java","Android","C","JavaScropt","Python"};
		
//		for(���� : �迭) {
//			�ݺ� ���๮;
//		}
		
		for(String lang : strArray) { //������ �迭 �� ��Ұ� ����
			System.out.println(lang);
		}

	}

}
