import java.util.*;

public class EX02_12_Grading {

	public static void main(String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while(a.hasNext()) {
			int score = a.nextInt();
			if(score>=90)
				grade = 'A';
			else if(score>=80)
				grade = 'B';
			else if(score>=70)
				grade = 'C';
			else if(score>=60)
				grade = 'D';
			else
				grade = 'F';
			System.out.println("������ " + grade + "�Դϴ�.");
			
			//break;
		}
		a.close();
	}

}
