package Exercise;
import java.util.*;

class TV {
	String com, pro;
	int year, inch;
	
	TV(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상호 >>");
		com = sc.next();
		System.out.println("년 >>");
		year = sc.nextInt();
		System.out.println("인치 >>");
		inch = sc.nextInt();
		System.out.println("제품 >>");
		pro = sc.next();
		
		sc.close();
	}

//	TV(String com, int year, int inch){
//		this.com = com;
//		this.year = year;
//		this.inch = inch;
//	}
	
	void show() {
		System.out.println(com+"에서 "+year+"년에 나온 "+inch+"인치 "+ pro);
	}

}
