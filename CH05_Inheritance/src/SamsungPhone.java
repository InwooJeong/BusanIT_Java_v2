
public class SamsungPhone implements PhoneInterface {
	// PhoneInterface의 모든 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔습니다.");
	}
	
	//메소드 추가
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

}
