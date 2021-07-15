package Exercise;

public class Rectangle {
	int x,y,width,height;
	
	Rectangle(){
		
	}
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"X"+height+"인 사각형");
	}
	
	boolean contains(Rectangle r) {
		if((x<r.x)&&((width+x)>(r.width+r.x))&&
			(y<r.y)&&((height+y)>(r.height+r.y))) {
			return true;
		}else {
			return false;
		}
	}

}
