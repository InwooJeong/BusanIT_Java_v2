
public class ColorPoint extends Point{
	private String color; //점의 색
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() { //점의 색
		System.out.print(color);
		showPoint();
	}

}
