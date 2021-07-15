package Exercise;
import java.util.*;

class PhoneBook {
	Scanner sc = new Scanner(System.in);
	
	PhoneBook(){
		
	}
	
	public void show(){
		
		System.out.println("인원수>>");
		int n = sc.nextInt();
		int i;
		
		Phone p[] = new Phone[n];
		for(i=0;i<p.length;i++) { //phone에 입력
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			p[i] = new Phone(name,tel);
		}
		System.out.println("저장되었습니다.");
		
//		for(int i=0;i<p.length;i++) { //저장값 확인
//			System.out.println(p[i].getName());
//			System.out.println(p[i].getTel());
//		}
		
		while(true) {
			System.out.println("검색할 이름(종료하려면 그만)>>");
			String name = sc.next();
			
//			for(int i=0;i<p.length;i++) { //저장값 확인 여기까지 값은 가지고 내려옴
//				System.out.println(p[i].getName());
//				System.out.println(p[i].getTel());
//			}
			
			for(i=0;i<n;i++) {
				if(name.equals(p[i].getName())){
					System.out.println(name+"의 번호는 "+p[i].getTel());
					i--;
					break;
				}
			}
				if(name.equals("그만")) {
					System.out.println("종료합니다.");
					sc.close();
					return;
				}
				if(i==n){
					System.out.println(name+"이 없습니다.");
				}
		}
	}
	
}
