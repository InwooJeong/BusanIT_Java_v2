
class Goods { //예제 01과 03에서 사용 할 Goods 클래스
	String name;
	int price, n, sold;
	
	Goods(){ //생성자를 이용한 초기화
		
	}
	
	public Goods(String name, int p, int n, int s){
		this.name = name;
		this.price = p;
		this.n = n;
		this.sold = s;
	}
	
	public void setAll(String name, int p, int n, int s) {
		this.name = name;
		this.price = p;
		this.n = n;
		this.sold = s;
	}

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}
	
	void printPrice() {
		double dc = price * 0.9;
		System.out.println(dc);
	}
	

}
