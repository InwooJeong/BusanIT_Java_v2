
public class EX05_01 {

	public static void main(String[] args) {
		Point p = new Point(); //Point ��ü ����
		p.set(1, 2); //Point Ŭ���� set() ȣ��
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); //ColorPoint ��ü
		cp.set(3, 4); //Point�� set()ȣ��
		cp.setColor("red"); //colorPoint�� setColor() ȣ��
		cp.showColorPoint(); //�÷��� ��ǥ ���

	}

}
