
class Person { //test���� ��� �� person Ŭ����
	//�������� ��� ����, ������, �޼ҵ�
	
	//��� ����
	String name;
	int age;
	double height;
	
	//������ - Ŭ���� �̸��� ����, ���� ���� ������ ����.
	Person(){
		
	}

	//�޼ҵ�
	int addAge1(int plus) {
		age = age+plus;
		return age;
	}
	
	void addAge2(int plus) {
		age = age+plus;
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

}
