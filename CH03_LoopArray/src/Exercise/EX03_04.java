package Exercise;
import java.util.*;

public class EX03_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소문자 알파벳 하나를 입력하시오>>");
		
		String s = sc.next();
		
		//-------------------------------------------------------------
		if(s.length()!=1) { //유효성 1 하나 말고
			System.out.println("하나!");
			sc.close();
		}else {
		//-------------------------------------------------------------
		char c = s.charAt(0);
			
		//-------------------------------------------------------------
			if(c<'a'||c>'z') { //유효성 2 알파벳 소문자 외 ex)한글 넣으면 빠가남
				System.out.println("소문자!");
				sc.close();
			}else {
		//-------------------------------------------------------------
			for(char i=c;i>='a';i--) {
				for(char j='a';j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		
			sc.close();
			}
		}
	}

}
