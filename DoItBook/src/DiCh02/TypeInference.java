package DiCh02;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10; //int i = 10으로 컴파일
		var j = 10.0; //double j = 10.0으로 컴파일
		var str = "hello"; //String str = "hello"로 컴파일
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; //다른 문자열을 대입 가능
		//str = 3; str변수는 String -> 정수값 X
		System.out.println(str);

	}

}
