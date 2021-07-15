package Exercise;

public class EX03_12 {

	public static void main(String[] args) {
		
		////////////////////////////////////////
		if(args.length==0) {  //유효성
			System.out.println("파라미터가 없습니다!!!!!!!!!!!!!!");
			return;
		}
		
		int sum = 0;
		
		for(int i=0;i<args.length;i++) {
			try {
				sum += Integer.parseInt(args[i]);
			} catch (Exception e) {
				continue;
			}
		}
		System.out.println(sum);
	}

}
