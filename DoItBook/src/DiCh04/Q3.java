package DiCh04;

public class Q3 {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j>i) {
					break;
				}
				System.out.print(i+"X"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		

	}

}
