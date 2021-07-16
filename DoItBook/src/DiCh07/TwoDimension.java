package DiCh07;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int[] a:arr) { //먼저 1차원 배열과 똑같이 arr배열의 아이템을 하나씩 꺼낸다. 차례차례 a에 담긴다.
			for(int i:a) { //한 번더 사용하여 각각 a를 i로 빼낸다.
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
