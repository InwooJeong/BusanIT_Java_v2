class Person{
	//���� �� �������� 3����
	//���� ����
	String name;
	int age;
	double height;
	
	//�������(�޼ҵ�) -> ���� ���� ������ ����.
	Person() {
		System.out.println("������");
	}
	
	//��޼ҵ�
	int addAge1(int plus) {
		age = age + plus;
		return age;
	}
	
	void addAge2(int plus) {
		age = age + plus;
	}
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	void setName(String name1) {
		name = name1;
	}
	void setAge(int age1) {
		age = age1;
	}
	
	private void printAge() {
		System.out.println("��ü ���� ���->"+age);
	}
	
}

public class EX04_Test {

	public static void main(String[] args) {
		//2.Ŭ���� ���, 3.��ü �����
		Person p1 = new Person();
		
		//4.��ü ���(���� ���� or ��޼ҵ�)
		//���� ����
		//p1.name = "ȫ�浿"; //������� ���ٱ���
		//p1.age = 20; //������� ���ٱ���
		
		p1.setName("ȫ�浿");
		p1.setAge(20);
		System.out.println(p1.name+"�� ���̴�"+p1.age);
		//��޼ҵ�
		int realAge1 = p1.addAge1(3);
		System.out.println("��¥ ���̴�=>"+realAge1); //��޼ҵ�
		
		p1.addAge2(5);
		//System.out.println("��¥ ���̴�=>"+p1.age); //�⺯ ���� ����
		System.out.println("��¥ ���̴�=>"+p1.getAge());
		
	}

}

