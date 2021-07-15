package Exercise;
import java.util.*;

public class CircleManager {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		//3개의 Circle 배열 선언
		Circle c [] = new Circle[3];
		
		for(int i=0;i<c.length;i++) {
			System.out.println("x,y,radius>>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		for(int i=0;i<c.length;i++) {
			c[i].show();
			sc.close();
		}
	}
	
	void run2() { //가장 면적이 큰 원 구하기. 반지름으로
		Scanner sc = new Scanner(System.in);
		
		Circle c [] = new Circle[3];
		
		int large = 0;
		
		for(int i=0;i<c.length;i++) {
			System.out.println("x,y,radius>>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new  Circle(x,y,radius);
		}
		for(int i=0;i<c.length;i++) { //반지름 제일 큰걸로
			if(large<c[i].getRadis()) {
				large = c[i].getRadis();
			}
		}
		for(int i=0;i<c.length;i++) {
			if(large==c[i].getRadis()) {
				System.out.println("가장 큰 원은");
				c[i].show();
				sc.close();
			}
		}
		
	}

}
