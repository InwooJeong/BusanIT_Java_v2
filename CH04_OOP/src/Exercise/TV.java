package Exercise;
import java.util.*;

class TV {
	String com, pro;
	int year, inch;
	
	TV(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȣ >>");
		com = sc.next();
		System.out.println("�� >>");
		year = sc.nextInt();
		System.out.println("��ġ >>");
		inch = sc.nextInt();
		System.out.println("��ǰ >>");
		pro = sc.next();
		
		sc.close();
	}

//	TV(String com, int year, int inch){
//		this.com = com;
//		this.year = year;
//		this.inch = inch;
//	}
	
	void show() {
		System.out.println(com+"���� "+year+"�⿡ ���� "+inch+"��ġ "+ pro);
	}

}
