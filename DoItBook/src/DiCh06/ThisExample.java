package DiCh06;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) { //태어난 연도 지정 메서드
		this.year=year; //bDay.year = year
	}
	
	public void printThis() { //this 출력
		System.out.println(this); //bDay와 같음
	}

}
public class ThisExample {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay); //참조 변수
		bDay.printThis(); //this 출력 메서드
	}

}
