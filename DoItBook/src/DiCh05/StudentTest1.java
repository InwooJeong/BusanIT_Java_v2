package DiCh05;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student(); //ù ��° �л� ����
		student1.studentName = "�ȿ���";
		System.out.println(student1.getStudentName());
		Student student2 = new Student(); //�� ��° �л� ����
		student2.studentName = "�Ƚ¿�";
		System.out.println(student2.getStudentName());
		//���� �ٸ� �ν��Ͻ�(student1,student2) ����
		//���� ����.��� ���� or �޼���

	}

}
