
public class UsingOverride {

	public static void main(String[] args) {
		Shape start,last,obj;
		
		start = new Line(); //Line ��ü ����
		last = start;
		obj = new Rect();
		last.next = obj; //Rect ��ü ����
		last = obj;
		obj = new Line(); //Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle(); //Circle ��ü ����
		last.next = obj;
		//��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}

	}

}
