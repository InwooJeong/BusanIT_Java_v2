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
				season="��";
				break;
			case 7:
			case 8:
			case 9:	
				season="����";
				break;
			case 10:
			case 11:
			case 12:
				season="����";
				break;
			case 13:
			case 2:
			case 3:
				season="�ܿ�";
				break;
			default:
				season = "�߸� �Է�";	
		}
		System.out.println(season);
		
		sc.close();
		
	}

}
