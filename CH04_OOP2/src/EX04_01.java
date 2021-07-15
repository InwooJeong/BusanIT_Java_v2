
public class EX04_01 {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setN(30);
		camera.setSold(50);
		
		System.out.println("상품 이름 : "+camera.getName());
		System.out.println("상품 가격 : "+camera.getPrice());
		System.out.println("상품 재고 : "+camera.getN());
		System.out.println("상품 실적 : "+camera.getSold());

	}

}
