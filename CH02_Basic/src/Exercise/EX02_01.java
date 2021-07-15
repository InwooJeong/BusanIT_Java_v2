package Exercise;
import java.util.*;
import java.text.*;

public class EX02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		double dol = won/1216.0;
		
		DecimalFormat df = new DecimalFormat("#.##");
		String rs = df.format(dol);
		
		System.out.println("원화를 입력하세요(단위 원)>>");
		System.out.println(won+"원은 " + rs +"$ 입니다." );
		
		sc.close();
	}

}
