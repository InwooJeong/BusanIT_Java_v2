class Goods1{
	
	private String name;
	private int price,numberOfStock,sold;
	
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
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
}

public class EX04_01_Goods {

	public static void main(String[] args) {
		//Goods1 camera = new Goods1();
		Goods1 camera; //��ü����
		camera = new Goods1(); //��ü - ��¥ ��ü
		
//		camera.name = "Nikon";
//		camera.price = 400000;
//		camera.numberOfStock = 30;
//		camera.sold = 50;
//		
//		System.out.println("��ǰ �̸� : " + camera.name);
//		System.out.println("��ǰ ���� : " + camera.price);
//		System.out.println("��� ���� : " + camera.numberOfStock);
//		System.out.println("�ȸ� ���� : " + camera.sold);
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setNumberOfStock(30);
		camera.setSold(50);

		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		System.out.println(camera.getNumberOfStock());
		System.out.println(camera.getSold());
		
	}

}
