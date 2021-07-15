package DiCh05;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student(); //첫 번째 학생 생성
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		Student student2 = new Student(); //두 번째 학생 생성
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
		//서로 다른 인스턴스(student1,student2) 생성
		//참조 변수.멤버 변수 or 메서드

	}

}
