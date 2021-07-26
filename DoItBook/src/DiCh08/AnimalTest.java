package DiCh08;
import java.util.ArrayList;

class Animal2{ //���� Ŭ���� Animal2
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human2 extends Animal2{ //Animal2�� ��� ���� Human2
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger2 extends Animal2{ //Animal2�� ��� ���� Tiger2
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle2 extends Animal2{ //Animal2�� ��� ���� Eagle2
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	ArrayList<Animal2> aniList = new ArrayList<Animal2>(); //�迭 �ڷ����� Animal2�� ����
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();
	}

	private void addAnimal() {
		aniList.add(new Human2()); //ArrayList�� �߰��Ǹ鼭 Animal2������ ��ȯ
		aniList.add(new Tiger2());
		aniList.add(new Eagle2());
		
		for(Animal2 ani : aniList) { //�迭 ��Ҹ� Animal2������ ������ move�� ȣ�� -> �����ǵ� �Լ��� ȣ��ȴ�.
			ani.move();
		}
	}

	private void testCasting() {
		for(int i=0;i<aniList.size();i++) { //��� �迭 ��Ҹ� �ϳ��� ���鼭
			Animal2 ani = aniList.get(i); //Animal2������ �������µ�
			if(ani instanceof Human2) { //Human2�̸�
				Human2 h = (Human2)ani; //Human2������ �ٿ� ĳ����
				h.readBook();
			}else if(ani instanceof Tiger2) {
				Tiger2 t = (Tiger2)ani;
				t.hunting();
			}else if(ani instanceof Eagle2) {
				Eagle2 e = (Eagle2)ani;
				e.flying();
			}else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	
}
