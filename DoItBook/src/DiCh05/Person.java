package DiCh05;

public class Person {
	String name; //�̸�
	float height; //Ű
	float weight; //������
	char gender; //����
	boolean married; //��ȥ ����
	
	public Person() {} //����Ʈ ������
	
	public Person(String pname) { //�̸��� �Ű������� �Է¹޴� ������
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) { //�̸�,Ű,�����Ը� �Ű������� �Է¹޴� ������
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
