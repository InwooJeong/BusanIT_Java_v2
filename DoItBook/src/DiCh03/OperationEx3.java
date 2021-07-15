package DiCh03;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i=i+2)<10); //논리 곱 앞 항이 거짓 -> 뒷 항 실행 X
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1=num1+10)>10)||((i=i+2)<10); //논리 합 앞 항이 참 -> 뒷 항 실행 X
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
