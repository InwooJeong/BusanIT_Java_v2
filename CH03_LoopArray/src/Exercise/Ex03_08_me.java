package Exercise;
import java.util.Scanner;

public class Ex03_08_me
{
	static boolean checkArr(int arr[], int num)
	{
		for(int i=0; i<arr.length; ++i)
		{
			if(arr[i]==num)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("갯수입력>>>");
		int cnt = sc.nextInt();
		
		if(cnt>100){
			System.out.println("100보다 작은 수를 입력하세요!");
			sc.close();
			return;
		}

		int arr[] = new int[cnt];
				
		for(int i=0; i<arr.length; ++i) {
			int num = (int)(Math.random()*100+1);
			
			if(checkArr(arr, num))
			{
				i--;
				continue;
			}
			
			arr[i] = num;
		}
		
		for(int i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+"\t");
			
			if((i+1)%10==0 && i!=0)
				System.out.println();
		}
		
		sc.close();
	}
}
