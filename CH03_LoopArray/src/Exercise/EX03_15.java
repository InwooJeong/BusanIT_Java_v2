package Exercise;
import java.util.*;

public class EX03_15 {

	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("���ϰ��� �ϴ� �� �� �Է� >>");
			Scanner sc = new Scanner(System.in);
			
			try {

				
				int n = sc.nextInt();
				int m = sc.nextInt();
				
				System.out.println(n+"x"+m+"="+n*m);
				
				sc.close();
				break;
				
			} catch (Exception e) {
				System.out.println("����");
				sc.nextLine();
				continue;

			}
		}
	}
}
