
class Goods { //���� 01�� 03���� ��� �� Goods Ŭ����
	String name;
	int price, n, sold;
	
	Goods(){ //�����ڸ� �̿��� �ʱ�ȭ
		
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

	//�޼ҵ�
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
