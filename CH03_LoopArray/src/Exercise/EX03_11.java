package Exercise;

public class EX03_11 {

	public static void main(String[] args) {
		
		////////////////////////////////////////
		if(args.length==0) {  //��ȿ��
			System.out.println("�Ķ���Ͱ� �����ϴ�!!!!!!!!!!!!!!");
			return;
		}
		
		double sum = 0;
		
		for(int i=0;i<args.length;i++) {
			try {
				sum += Integer.parseInt(args[i]);
			}catch(Exception e){
				continue;
			}
		}
		System.out.println(sum/args.length);

	}

}
