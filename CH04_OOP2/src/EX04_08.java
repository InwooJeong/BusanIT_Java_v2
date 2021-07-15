
public class EX04_08 {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1148); //오늘 환율 (09th Jul 21)
		System.out.println("백만원은 " + CurrencyConverter.toDollar(1000000)+ "달러");
		System.out.println("백달러는 " + CurrencyConverter.toKWR(100)+ "원");

	}

}
