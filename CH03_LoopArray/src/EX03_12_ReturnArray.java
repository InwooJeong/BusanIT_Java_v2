import java.util.*;

public class EX03_12_ReturnArray {
	
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
		}
		return temp;
	}
	
	public static void main(String[] args) {

		int intArray [];
		intArray = makeArray();
		
		System.out.println(Arrays.toString(intArray));
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
