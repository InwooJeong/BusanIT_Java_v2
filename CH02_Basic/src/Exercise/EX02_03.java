package Exercise;
import java.util.*;

public class EX02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��Ͻÿ�.>>");
		int money = sc.nextInt();
		
		int a = money/50000;
		//money = money%50000;
		int b = (money-a*50000)/10000;
		//money = money%10000;
		int c = (money-(a*50000+b*10000))/1000;
		int d = (money-(a*50000+b*10000+c*1000))/500;
		int e = (money-(a*50000+b*10000+c*1000+d*500))/100;
		int f = (money-(a*50000+b*10000+c*1000+d*500+e*100))/50;
		int g = (money-(a*50000+b*10000+c*1000+d*500+e*100+f*50))/10;
		int h = money-(a*50000+b*10000+c*1000+d*500+e*100+f*50+g*10);
		
		System.out.println("�������� "+a+"��");
		System.out.println("������ "+b+"��");
		System.out.println("õ���� "+c+"��");
		System.out.println("����� "+d+"��");
		System.out.println("��� "+e+"��");
		System.out.println("���ʿ� "+f+"��");
		System.out.println("�ʿ� "+g+"��");
		System.out.println("�Ͽ� "+h+"��");
		
		sc.close();
	}

}
