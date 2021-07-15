
public class EX04_Test { //Person 클래스를 사용 할 것.

	public static void main(String[] args) {
		//클래스 사용을 위한 객체 만들기
		Person p1 = new Person();
		
		//객체 사용(멤버 변수 or 메소드)
		//1.멤버 변수
		//p1.name = "홍길동"; //멤버 변수 접근X
		//p1.age = 20; //멤버 변수 접근X
		
		p1.setName("홍길동");
		p1.setAge(20);
		System.out.println(p1.name+"의 나이는 "+p1.age);
		
		int realAge1 = p1.addAge1(3);
		System.out.println(p1.name+"의 진짜 나이는 : "+realAge1);
		
		p1.addAge2(5);
		System.out.println(p1.name+"의 진짜 나이는 : "+p1.getAge());
		
	}

}
