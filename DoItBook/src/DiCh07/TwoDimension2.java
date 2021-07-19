package DiCh07;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		for(int a[] : arr) {
			for(int i : a) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println(arr.length); //행 길이
		System.out.println(arr[0].length); //열 길이

	}

}
