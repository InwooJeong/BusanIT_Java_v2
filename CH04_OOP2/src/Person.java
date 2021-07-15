
class Person { //test에서 사용 할 person 클래스
	//구성성분 멤버 변수, 생성자, 메소드
	
	//멤버 변수
	String name;
	int age;
	double height;
	
	//생성자 - 클래스 이름과 동일, 리턴 값이 무조건 없다.
	Person(){
		
	}

	//메소드
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
