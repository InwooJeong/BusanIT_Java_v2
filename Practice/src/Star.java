
public class Star {

	public static void main(String[] args) {
		
		//�簢��
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//�ﰢ�� 1
		for(int i=1;i<6;i++)	{
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//�ﰢ�� 2 if
//		for(int i=1;i<6;i++) {
//			for(int j=4;j<i;j--) {
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
//		
		//�ﰢ�� 2 for
		
	}

}
