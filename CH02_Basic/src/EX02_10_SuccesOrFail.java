import java.util.*;

public class EX02_10_SuccesOrFail {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ� : ");
		int score = in.nextInt();
		if(score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		
		in.close();
	}

}
