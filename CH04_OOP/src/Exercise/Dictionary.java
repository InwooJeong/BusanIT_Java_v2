package Exercise;

public class Dictionary {
	private static String [] kor = {"????","?Ʊ?","??","?̷?","????"};
	private static String [] eng = {"love","baby","money","future","hope"};
	
	public static String kor2Eng(String word) {
		
		for(int i=0;i<kor.length;i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return "f";
	}
}
