package Exercise;
import java.util.*;

public class EX02_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �߽ɰ� ������>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		
		System.out.println("�ι�° ���� �߽ɰ� ������>>");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		double x = x1-x2;
		double y = y1-y2;
		
		double l = Math.sqrt((x*x)+(y*y));
		double r = r1+r2;
		
		System.out.println("@@@@@�� �� ���� �Ÿ� : "+l);
		System.out.println("r : "+r);
		
		System.out.println((r>=l)?("��ģ��"):("�Ȱ�ģ��."));
		
		sc.close();
	}
	
}
