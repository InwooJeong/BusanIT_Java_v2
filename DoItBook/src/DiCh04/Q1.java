package DiCh04;

public class Q1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("연산자 확인!");
			return;
		}
		System.out.println("result : "+result);
		
		int num3 = 10;
		int num4 = 2;
		char operator2 = '-';
		int result2 = 0;
		
		switch(operator2) {
			case '+':
				result2 = num3 + num4;
				break;
			case '-':
				result2 = num3 - num4;
				break;
			case '*':
				result2 = num3 * num4;
				break;
			case '/':
				result2 = num3 / num4;
				break;
			default:
				System.out.println("연산자 확인!");
			    return;
		}
		System.out.println("result2 : "+result2);

	}

}
