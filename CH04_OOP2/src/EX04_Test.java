
public class EX04_Test { //Person Ŭ������ ��� �� ��.

	public static void main(String[] args) {
		//Ŭ���� ����� ���� ��ü �����
		Person p1 = new Person();
		
		//��ü ���(��� ���� or �޼ҵ�)
		//1.��� ����
		//p1.name = "ȫ�浿"; //��� ���� ����X
		//p1.age = 20; //��� ���� ����X
		
		p1.setName("ȫ�浿");
		p1.setAge(20);
		System.out.println(p1.name+"�� ���̴� "+p1.age);
		
		int realAge1 = p1.addAge1(3);
		System.out.println(p1.name+"�� ��¥ ���̴� : "+realAge1);
		
		p1.addAge2(5);
		System.out.println(p1.name+"�� ��¥ ���̴� : "+p1.getAge());
		
	}

}
