package Exercise;
import java.util.*;

public class Grade {
	private int math, science, english;
	
	Grade(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����>>");
		math = sc.nextInt();
		
		System.out.println("���� ����>>");
		science = sc.nextInt();
		
		System.out.println("���� ����>>");
		english = sc.nextInt();
		
		sc.close();
		
	}
	
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	void average() {
		System.out.println("���� ���� : "+math);
		System.out.println("���� ���� : "+science);
		System.out.println("���� ���� : "+english);
		System.out.println("��� : "+(math+science+english)/3.0);
	}

}
