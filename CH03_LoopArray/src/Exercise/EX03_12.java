package Exercise;

public class EX03_12 {

	public static void main(String[] args) {
		
		////////////////////////////////////////
		if(args.length==0) {  //��ȿ��
			System.out.println("�Ķ���Ͱ� �����ϴ�!!!!!!!!!!!!!!");
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
