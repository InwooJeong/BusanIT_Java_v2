
class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate; //원화를 달러로
	}
	public static double toKWR(double dollar) {
		return dollar*rate; //달러를 원화로
	}
	public static void setRate(double r) {
		rate = r; //환율 설정 KWR/$1
	}
}

public class EX04_08_StaticMember {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1121); //미국 달러 환율 설정
		System.out.println("백만원은 " + CurrencyConverter.toDollar(1000000) + "달러");
		System.out.println("백달러는 " + CurrencyConverter.toKWR(100) + "원 입니다.");
	}

}
