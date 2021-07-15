package DiCh04;

public class Q5 {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) { //4줄
			for(int j=0;j<3-i;j++) { //공백
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) { //1,3,5,7
				System.out.print("*");
			}
//			for(int j=0;j<3-i;j++) { //공백 -- 여기는 안줘도 괜찮음
//				System.out.print(" ");
//			}
			System.out.println(" ");
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i*2+1;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		//참고 해볼 것
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=7;j>=i*2+1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
