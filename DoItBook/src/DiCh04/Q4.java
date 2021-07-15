package DiCh04;

public class Q4 {

	public static void main(String[] args) {
		
		
		for(int i=0;i<4;i++) { //4ÁÙ
			for(int j=0;j<3-i;j++) { //°ø¹é
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) { //1,3,5,7
				System.out.print("*");
			}
//			for(int j=0;j<3-i;j++) { //°ø¹é -- ¿©±â´Â ¾ÈÁàµµ ±¦ÂúÀ½
//				System.out.print(" ");
//			}
			System.out.println(" ");
		}
	}

}
