
public class ColorPoint extends Point{
	private String color; //점의 색
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);  //point의 생성자 Point(x,y) 호풀
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() { //점의 색
		System.out.print(color);
		showPoint();
	}

}
