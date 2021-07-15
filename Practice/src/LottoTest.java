import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {
		int lotto[] = new int [6]; //로또 번호 6개 담을 배열
		
		//로또 번호 6개 넣기
		for(int i=0;i<6;i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++) { //중복 시 배열에 숫자 담으면 안됨
				if(lotto[i]==lotto[j]) {
					i--; //i 증가 시키면 안된다.
					break;
				}
			}
		}
		
		//System.out.println(Arrays.toString(lotto));
		
		System.out.println("이번주 로또 번호는 : ");
		
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+"\t");
		}
	}

}
