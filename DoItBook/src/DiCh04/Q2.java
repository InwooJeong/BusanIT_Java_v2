package DiCh04;

public class Q2 {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			if(i%2!=0) {
				continue;
			}
				for(int j=1;j<=9;j++) {
					System.out.print(i+"X"+j+"="+(i*j)+"\t");
			}
				System.out.println();
		}
	}

}
