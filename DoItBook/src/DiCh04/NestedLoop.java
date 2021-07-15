package DiCh04;

public class NestedLoop {

	public static void main(String[] args) {
		int dan, times;
		
		for(dan=2;dan<=9;dan++) { //외부 반복 2~9단
			for(times=1;times<=9;times++) { //내부 반복 각 단에 1~9 곱함
				System.out.println(dan + "x" + times + "=" +dan*times);
			}
			System.out.println();
		}

	}

}
