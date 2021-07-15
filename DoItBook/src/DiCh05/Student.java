package DiCh05;

public class Student {
	   //예약어 //클래스 이름
	int studentID; //학번
	String studentName; //이름
	int grade; //학년
	String address; //주소  //4개의 멤버변수
	
	public void showStudentInfo() { //메서드 추가
		System.out.println(studentName + "," + address); //이름, 주소 출력
	}
	
	public String getStudentName() { //학생 이름을 반환
		return studentName;
	}

	public void setStudentName(String name) { //학생 이름을 매개변수로 전달
		studentName = name;
	}
	
	public static void main(String[] args) { //main() 함수
		Student studentAhn = new Student(); //student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
