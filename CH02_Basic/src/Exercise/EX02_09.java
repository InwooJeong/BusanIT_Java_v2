package Exercise;
import java.util.*;

public class EX02_09 {

	public static void main(String[] args) {
		
		System.out.println("���� �߽ɰ� ������ �Է�>>");
		System.out.println("�� �Է�>>");

		Scanner sc = new Scanner(System.in);
		
		double c1 = sc.nextDouble();
		double c2 = sc.nextDouble();
		double ra = sc.nextDouble();
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double w = x-c1;
		double h = y-c2;
		
		double l = Math.sqrt((w*w)+(h*h));
		
		System.out.println("�� �� ���� �Ÿ� : "+l);
		
		System.out.println((ra>=l)?("�� �ȿ� �ִ�."):("�� �ۿ� �ִ�."));
		
		sc.close();
		
	}

}
