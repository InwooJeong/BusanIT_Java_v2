package Exercise;
import java.util.*;

public class Cal {
	Scanner sc = new Scanner(System.in);
	
	Cal(){
		
	}
	
	void CalApp() {
		
		while(true) {
			System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�(+,-,*,/) ���� �� �����ڿ� �׸� >>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			String c = sc.next();
			
			if(c.equals("�׸�")) {
				System.out.println("�����մϴ�.");
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
					System.out.println("�����ڸ� Ȯ���ϼ���!");
					break;
			}
		}
	}
	
}
