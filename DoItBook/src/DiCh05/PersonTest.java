package DiCh05;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "������";
		personKim.weight = 85.5f;
		personKim.height = 180.0f; //����Ʈ �����ڷ� Ŭ������ ������ �� �ν��Ͻ� ���� ���� ���� �ʱ�ȭ
		
		Person personLee = new Person("�̼���", 175, 75);
		//�ν��Ͻ� ���� �ʱ�ȭ�� ���ÿ� Ŭ���� ����

	}

}
