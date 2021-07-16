
public class ColorPoint extends Point{
	private String color; //���� ��
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);  //point�� ������ Point(x,y) ȣǮ
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() { //���� ��
		System.out.print(color);
		showPoint();
	}

}
