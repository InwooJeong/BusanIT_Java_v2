package Exercise;
import java.util.*;

public class EX02_11_sc {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mon = sc.nextInt();
		String season;
		
		switch(mon+1) {
			case 4:
			case 5:
			case 6:
				season="봄";
				break;
			case 7:
			case 8:
			case 9:	
				season="여름";
				break;
			case 10:
			case 11:
			case 12:
				season="가을";
				break;
			case 13:
			case 2:
			case 3:
				season="겨울";
				break;
			default:
				season = "잘못 입력";	
		}
		System.out.println(season);
		
		sc.close();
		
	}

}
