package Exercise;
import java.util.*;

public class EX02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오.>>");
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
		
		System.out.println("오만원권 "+a+"매");
		System.out.println("만원권 "+b+"매");
		System.out.println("천원권 "+c+"매");
		System.out.println("오백원 "+d+"개");
		System.out.println("백원 "+e+"개");
		System.out.println("오십원 "+f+"개");
		System.out.println("십원 "+g+"개");
		System.out.println("일원 "+h+"개");
		
		sc.close();
	}

}
