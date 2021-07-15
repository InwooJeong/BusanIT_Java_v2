package Exercise;
import java.util.*;

public class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int con[] = new int [a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			con[i]=a[i];
		}
		
		for(int i=a.length;i<a.length+b.length;i++) {
			con[i]=b[i-a.length];
		}
		
		return con;
	}
	
	public static void print(int[] a) { //배열 a출력
		System.out.println(Arrays.toString(a));
	}

}
