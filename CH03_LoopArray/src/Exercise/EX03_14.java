package Exercise;
import java.util.*;

public class EX03_14 {

	public static void main(String[] args) {
		
		String course[] = {"Java","C++","HTML5","컴퓨터 구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("과목 이름(종료시 그만)>>");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("끝!");
				break;
			}
			int i = 0;
			for(i=0;i<course.length;i++) {
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(name+" : "+n);
					break;
				}
			}
			if(i==course.length) {
				System.out.println("없는 과목 입니다!");
			}
		}
		sc.close();
	}

}
