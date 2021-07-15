package Exercise;
import java.util.*;

public class Grade {
	private int math, science, english;
	
	Grade(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학 점수>>");
		math = sc.nextInt();
		
		System.out.println("과학 점수>>");
		science = sc.nextInt();
		
		System.out.println("영어 점수>>");
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
		System.out.println("수학 점수 : "+math);
		System.out.println("과학 점수 : "+science);
		System.out.println("영어 점수 : "+english);
		System.out.println("평균 : "+(math+science+english)/3.0);
	}

}
