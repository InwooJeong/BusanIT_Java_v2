import java.io.*;

public class EX02_03_InputExample {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				int a = rd.read();
				if(a == -1) //ctrl-z가 입력되면 read()는 -1을 리턴
					break;
				System.out.print((char)a); //입력된 문자 출력
			}
		}
		catch(IOException e) {
			System.out.println("입력 에러 발생");
		}
	}

}
