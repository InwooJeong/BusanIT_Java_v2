package Exercise;
import java.util.*;

public class EX03_14 {

	public static void main(String[] args) {
		
		String course[] = {"Java","C++","HTML5","��ǻ�� ����","�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �̸�(����� �׸�)>>");
			String name = sc.next();
			if(name.equals("�׸�")) {
				System.out.println("��!");
				break;
			}
			int i = 0;
			for(i=0;i<course.length;i++) {
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(name+" : "+n);
					break;
				}
			}
			if(i==course.length) {
				System.out.println("���� ���� �Դϴ�!");
			}
		}
		sc.close();
	}

}
