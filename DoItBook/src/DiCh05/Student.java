package DiCh05;

public class Student {
	   //����� //Ŭ���� �̸�
	int studentID; //�й�
	String studentName; //�̸�
	int grade; //�г�
	String address; //�ּ�  //4���� �������
	
	public void showStudentInfo() { //�޼��� �߰�
		System.out.println(studentName + "," + address); //�̸�, �ּ� ���
	}
	
	public String getStudentName() { //�л� �̸��� ��ȯ
		return studentName;
	}

	public void setStudentName(String name) { //�л� �̸��� �Ű������� ����
		studentName = name;
	}
	
	public static void main(String[] args) { //main() �Լ�
		Student studentAhn = new Student(); //student Ŭ���� ����
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
