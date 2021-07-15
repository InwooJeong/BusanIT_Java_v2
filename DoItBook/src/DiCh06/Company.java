package DiCh06;

public class Company {
	
	private static Company instance = new Company(); //2. 클래스 내부에 static으로 유일하게 생성한 인스턴스(프로그램 전체에서 사용할 유일한 인스턴스, 외부에서 접근은 불가)

	private Company() { //1. 생성자 private으로 만들기 - 컴파일러가 제공하는 디폴트 생성자는 public - 외부에서 마음대로 compnay 인스턴스 생성 불가!
		//오직 compnay 클래스 내부에서만 이 클래스의 생성 제어
	} 
	
	public static Company getInstance() { //3. 외부에서 참조할 수 있는 public 메서드 생성 : 반드시 static (인스턴스 생성과 상관없이 호출 할 수 있어야)
		if(instance == null) {
			instance = new Company();
		}
		return instance; //유일하게 생성한 인스턴스를 반환
	}
	
}
