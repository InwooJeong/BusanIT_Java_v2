
public class EX04_01 {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setN(30);
		camera.setSold(50);
		
		System.out.println("��ǰ �̸� : "+camera.getName());
		System.out.println("��ǰ ���� : "+camera.getPrice());
		System.out.println("��ǰ ��� : "+camera.getN());
		System.out.println("��ǰ ���� : "+camera.getSold());

	}

}
