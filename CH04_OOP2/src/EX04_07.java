
public class EX04_07 {

	public static void main(String[] args) {
		Sample aC = new Sample();
		aC.a = 10;
		aC.setB(10); //b는 private. set 메소드를 통해야 접근 가능
		aC.c = 10;
		
		aC.pl();

	}

}
