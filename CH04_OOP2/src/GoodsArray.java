import java.util.*;

public class GoodsArray {
	//1.�������(=�Ӽ�, �ʵ�)
	Goods[] goodsArray;
	
	//2.������
//	GoodsArray(){
//		goodsArray = new Goods[3];
//	}
//	
	GoodsArray() {
		goodsArray = new Goods[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<goodsArray.length;i++) {
			System.out.println("�Է��ϼ���>>");
			String name = sc.next();
			int p = sc.nextInt();
			int n = sc.nextInt();
			int s = sc.nextInt();
			
			goodsArray[i] = new Goods(name,p,n,s);
			
			sc.close();
		}
	}
	
	//3.(���)�޼ҵ�
	void printGoodsArray() {
		for(int i=0;i<goodsArray.length;i++) {
			String name = goodsArray[i].getName();
			int p = goodsArray[i].getPrice();
			int n = goodsArray[i].getN();
			int s = goodsArray[i].getSold();
			
			System.out.println(name+" "+p+" "+n+" "+s);
		}
	}
}
