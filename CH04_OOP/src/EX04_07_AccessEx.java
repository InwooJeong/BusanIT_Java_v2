
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
		//aClass.b = 10; //b�� private
		aClass.setB(10); //private ���� �����ڸ� ���� ��� b�� ���� Ŭ���� ���� get/set �޼ҵ� ���� �� ����
		aClass.c = 10;

	}

}
