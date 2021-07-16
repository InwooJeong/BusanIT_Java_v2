
public class Shape {
	
	private String value;
	
	public Shape next; //자료형이 같음 -> 자기(자신) 순환 참조 recursive 
	
	public Shape() {next = null;}; //생성자
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override
	public void draw() { 
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
