package Exercise;
import java.util.*;

public class CircleManager {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		//3���� Circle �迭 ����
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
	
	void run2() { //���� ������ ū �� ���ϱ�. ����������
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
		for(int i=0;i<c.length;i++) { //������ ���� ū�ɷ�
			if(large<c[i].getRadis()) {
				large = c[i].getRadis();
			}
		}
		for(int i=0;i<c.length;i++) {
			if(large==c[i].getRadis()) {
				System.out.println("���� ū ����");
				c[i].show();
				sc.close();
			}
		}
		
	}

}
