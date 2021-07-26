package DiCh08;
import java.util.ArrayList;

class Animal2{ //상위 클래스 Animal2
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human2 extends Animal2{ //Animal2를 상속 받은 Human2
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger2 extends Animal2{ //Animal2를 상속 받은 Tiger2
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle2 extends Animal2{ //Animal2를 상속 받은 Eagle2
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {
	ArrayList<Animal2> aniList = new ArrayList<Animal2>(); //배열 자료형은 Animal2로 지정
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}

	private void addAnimal() {
		aniList.add(new Human2()); //ArrayList에 추가되면서 Animal2형으로 변환
		aniList.add(new Tiger2());
		aniList.add(new Eagle2());
		
		for(Animal2 ani : aniList) { //배열 요소를 Animal2형으로 꺼내서 move를 호출 -> 재정의된 함수가 호출된다.
			ani.move();
		}
	}

	private void testCasting() {
		for(int i=0;i<aniList.size();i++) { //모든 배열 요소를 하나씩 돌면서
			Animal2 ani = aniList.get(i); //Animal2형으로 가져오는데
			if(ani instanceof Human2) { //Human2이면
				Human2 h = (Human2)ani; //Human2형으로 다운 캐스팅
				h.readBook();
			}else if(ani instanceof Tiger2) {
				Tiger2 t = (Tiger2)ani;
				t.hunting();
			}else if(ani instanceof Eagle2) {
				Eagle2 e = (Eagle2)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	
}
