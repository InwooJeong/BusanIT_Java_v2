package Exercise;
import java.util.*;

public class DicApp {
	
	DicApp(){
	
	}
	void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램>>");
		
		while(true) {
			System.out.println("한글 단어?(종료 시 그만)>>");
			String s = sc.next();
			
			String eng = Dictionary.kor2Eng(s);
			if(s.equals("그만")) {
				break;
			}
			if(eng.equals("f")) {
				System.out.println(s+"은/는 제 사전에 없습니다.");
			}else {
				System.out.println(eng);
			}
		}
		sc.close();
	}
}
