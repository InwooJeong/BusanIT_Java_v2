
public class EX05_06 {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상력은 " +
							  weapon.fire());
		weapon = new Cannon();
		System.out.println("대포의 살상력은 " +
							  weapon.fire());

	}

}
