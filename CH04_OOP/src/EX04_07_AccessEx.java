
class Sample{
	public int a;
	private int b;
	int c;
	public int getB() {
		return b;
	}
	public void setB(int value) {
		b = value;
	}
}

public class EX04_07_AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; //b는 private
		aClass.setB(10); //private 접근 지정자를 갖는 멤버 b를 위해 클래스 내부 get/set 메소드 생성 후 접근
		aClass.c = 10;

	}

}
