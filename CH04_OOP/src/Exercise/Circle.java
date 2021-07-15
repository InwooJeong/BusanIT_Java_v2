package Exercise;

public class Circle {
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		//내용작성1
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		//내용작성2
		System.out.println("("+x+","+y+") "+radius);
	}
	
	public int getRadis() {
		return radius; 
	}
}
