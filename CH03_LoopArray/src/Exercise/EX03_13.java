package Exercise;

public class EX03_13 {

	public static void main(String[] args) {
		
		for(int i=1;i<100;i++) {
			//System.out.println(i); //Ã¼Å©
			
			int a = i/10; //10ÀÇ ÀÚ¸®
			int b = i%10; //1ÀÇ ÀÚ¸®
			
			if((a==3||a==6||a==9)&&(b==3||b==6||b==9)) { //µÑ ´Ù
				System.out.println(i + " ¹Ú¼ö Â¦Â¦");
			}else if((a==3||a==6||a==9)&&(b!=3||b!=6||b!=9)) { //10
				System.out.println(i + " ¹Ú¼ö Â¦");
			}else if((a!=3||a!=6||a!=9)&&(b==3||b==6||b==9)) { //1
				System.out.println(i + " ¹Ú¼ö Â¦");
			}
		}

	}

}
