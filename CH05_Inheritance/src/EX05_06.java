
public class EX05_06 {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("�⺻ ������ ������ " +
							  weapon.fire());
		weapon = new Cannon();
		System.out.println("������ ������ " +
							  weapon.fire());

	}

}
