package DiCh07;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int[] a:arr) {
			for(int i:a) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
