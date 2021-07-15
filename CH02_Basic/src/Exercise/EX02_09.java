package Exercise;
import java.util.*;

public class EX02_09 {

	public static void main(String[] args) {
		
		System.out.println("원의 중심과 반지름 입력>>");
		System.out.println("점 입력>>");

		Scanner sc = new Scanner(System.in);
		
		double c1 = sc.nextDouble();
		double c2 = sc.nextDouble();
		double ra = sc.nextDouble();
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double w = x-c1;
		double h = y-c2;
		
		double l = Math.sqrt((w*w)+(h*h));
		
		System.out.println("두 점 사이 거리 : "+l);
		
		System.out.println((ra>=l)?("원 안에 있다."):("원 밖에 있다."));
		
		sc.close();
		
	}

}
