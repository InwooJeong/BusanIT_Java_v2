package Exercise;
import java.util.*;

public class EX02_12_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� >>");

		int n1 = sc.nextInt();
		String opr = sc.next();
		int n2 = sc.nextInt();
		
		if(opr.equals("+")) {
			System.out.println(n1+opr+n2+"�� ��� �����"+(n1+n2));
		}else if(opr.equals("-")&&n1>=n2) {
			System.out.println(n1+opr+n2+"�� ��� �����"+(n1-n2));
		}else if(opr.equals("*")){
			System.out.println(n1+opr+n2+"�� ��� �����"+(n1*n2));
		}else if(opr.equals("/")&&n2!=0) {
			System.out.println(n1+opr+n2+"�� ��� �����"+(n1/n2));
		}else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		sc.close();

	}

}
