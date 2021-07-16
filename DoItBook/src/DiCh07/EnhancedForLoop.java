package DiCh07;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] strArray = {"Java","Android","C","JavaScropt","Python"};
		
//		for(변수 : 배열) {
//			반복 실행문;
//		}
		
		for(String lang : strArray) { //변수에 배열 각 요소가 대입
			System.out.println(lang);
		}

	}

}
