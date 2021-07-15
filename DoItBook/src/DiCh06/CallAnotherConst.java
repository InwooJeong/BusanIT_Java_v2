package DiCh06;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음",1); //this를 사용, Person(String, int) 생성자 호출
		//this로 생성자 호출 시 코드 이전에 다른 코드 사용 불가
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { //클래스형
		return this; //this 반환
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf(); //this값 클래스 변수에 대입
		System.out.println(p); //noName.returnItSelf() 반환 값 출력
		System.out.println(noName); //참조 변수 출력
	}

}
