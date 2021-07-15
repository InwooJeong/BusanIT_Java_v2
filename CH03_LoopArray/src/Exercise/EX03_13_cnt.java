package Exercise;

public class EX03_13_cnt {

	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			
			int cnt = 0; //¹Ú¼öÀÇ °³¼ö
			
			int a = i/10; //10
			int b = i%10; //1
			
			if(a==3||a==6||a==9) {
				cnt++;
			}
			if(b==3||b==6||b==9) {
				cnt++;
			}
			
			if(cnt==2) {
				System.out.println(i +" ¹Ú¼ö Â¦Â¦");
			}else if(cnt==1) {
				System.out.println(i +" ¹Ú¼ö Â¦");
			}else {
				System.out.println(i + " ¹Ú¼ö ¾øÀ½");
			}
		}
		
	}

}
