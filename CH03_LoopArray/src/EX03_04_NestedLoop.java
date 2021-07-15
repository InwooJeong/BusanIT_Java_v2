
public class EX03_04_NestedLoop {

	public static void main(String[] args) {
		int i,j;
		
		for (i=2; i<10; i++, System.out.println()) {
			for(j=1;j<10;j++,System.out.print('\t')) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}
