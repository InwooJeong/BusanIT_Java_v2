package DiCh05;

public class Person {
	String name; //이름
	float height; //키
	float weight; //몸무게
	char gender; //성별
	boolean married; //결혼 여부
	
	public Person() {} //디폴트 생성자
	
	public Person(String pname) { //이름을 매개변수로 입력받는 생성자
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) { //이름,키,몸무게를 매개변수로 입력받는 생성자
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
