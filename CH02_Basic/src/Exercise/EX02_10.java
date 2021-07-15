package Exercise;
import java.util.*;

public class EX02_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 원의 중심과 반지름>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		
		System.out.println("두번째 원의 중심과 반지름>>");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		double x = x1-x2;
		double y = y1-y2;
		
		double l = Math.sqrt((x*x)+(y*y));
		double r = r1+r2;
		
		System.out.println("@@@@@두 점 사이 거리 : "+l);
		System.out.println("r : "+r);
		
		System.out.println((r>=l)?("겹친다"):("안겹친다."));
		
		sc.close();
	}
	
}
