import java.util.*;

public class Test3 {
	
	//1. in x, out x
	static void method01() {
		System.out.println("�ȳ�!");
		System.out.println("�ϼ���!");
	}
	
	//2. in o, out x
	static void method02(int a, int b) {
		int c = a+b;
		System.out.println("���� ��� = " + c);
	}
	
	//3. in x, out o
	static int method03() {
		
		int c = 100;
		return c;
	}
	
	//4. in o, out o
	static int method04(int a, int b) {
		int c = a+b;
		return c;
	}
	
	//5. �迭�� in���� ���!!!
	static void method05(int[] arr) {
		arr[0] = arr[0] + 15;
	}
	
	static int method06(int g) {
		g = g + 11;
		return g;
	}

	public static void main(String[] args) {
		
		for(int i=2;i<10;i++) {
			System.out.println(i+"��");
			
			for(int j=1;j<10;j++) {
				System.out.print(i +"*"+ j +"="+i*j+"\t");
			}
			System.out.println();
			
		}
		
		int i;
		int sum = 0;
		for(i=1;i<=10;i++) {
			sum = sum+i;
			System.out.println(i);
		}
		System.out.println(sum);
		
		method01();
		method02(2,3);
		
		int x=10, y=32;
		method02(x,y);
		
		int d = method03();
		System.out.println("��ȯ�� = "+d);
		
		int e= method04(200, 300);
		System.out.println(e);
		
		System.out.println(method04(100,200));
		
		//�޼ҵ� in -> parameter, �Ű�����, �Ű�����, �Ű��μ�, ����, �μ�
		
		int arr1[] = new int[3];
		arr1[0] = 11;
		arr1[1] = 23;
		
		method05(arr1);
		
		//arr01 ����?
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]);
		
		int g = 10;
		System.out.println(g);
		method06(g);
		System.out.println(g);
		System.out.println(method06(g));
	}

}
