package Exercise;
import java.util.*;

public class Cal {
	Scanner sc = new Scanner(System.in);
	
	Cal(){
		
	}
	
	void CalApp() {
		
		while(true) {
			System.out.print("두 정수와 연산자를 입력하시오(+,-,*,/) 종료 시 연산자에 그만 >>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			String c = sc.next();
			
			if(c.equals("그만")) {
				System.out.println("종료합니다.");
				sc.close();
				break;
			}
			switch(c){
				case "+":
					Add add = new Add();
					add.setValue(a, b);
					System.out.println(add.Calculate());
					break;
				
				case "-":
					Sub sub = new Sub();
					sub.setValue(a, b);
					System.out.println(sub.Calculate());
					break;
				
				case "*":
					Mul mul = new Mul();
					mul.setValue(a, b);
					System.out.println(mul.Calculate());
					break;
				
				case "/":
					Div div = new Div();
					div.setValue(a, b);
					System.out.println(div.Calculate());
					break;
				
				default :
					System.out.println("연산자를 확인하세요!");
					break;
			}
		}
	}
	
}
