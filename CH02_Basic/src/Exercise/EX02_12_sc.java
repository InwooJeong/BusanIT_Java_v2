package Exercise;
import java.util.*;

public class EX02_12_sc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("����>>");
		
		int n1 = sc.nextInt();
		String opr = sc.next();
		int n2 = sc.nextInt();
		
		switch(opr) {
			case "+":
				System.out.println(n1+opr+n2+"�� ��� �����"+(n1+n2));
				break;
			case "-":
				System.out.println(n1+opr+n2+"�� ��� �����"+(n1-n2));
				break;
			case "*":
				System.out.println(n1+opr+n2+"�� ��� �����"+(n1*n2));
				break;
			case "/":
				if(n2!=0) {
				System.out.println(n1+opr+n2+"�� ��� �����"+(n1/n2));
				break;
				}else {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
			default:
				System.out.println("�Է��� Ȯ���ϼ���@@@");	
		}
		
		sc.close();
		
	}

}
