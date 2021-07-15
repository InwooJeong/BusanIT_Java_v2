package DiCh06;

public class CompanyTest { //4. 실제로 사용하는 코드 만들기

	public static void main(String[] args) { //외부 클래스에서는 company 생성 불가 -> static으로 제공되는 getInstance
		Company myCompany1 = Company.getInstance(); //클래스 이름으로 getInstance() 호출 -> 참조 변수에 대입
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2); //같은 참조 값을 가지는 동일한 인스턴스
		//company 클래스는 내부에 생성된 유일한 인스턴스 외에는 더 이상 인스턴스를 생성 할 수 없다.
		//->Static을 사용하여 유일한 객체를 생성하는 싱글톤 패턴
	}

}
