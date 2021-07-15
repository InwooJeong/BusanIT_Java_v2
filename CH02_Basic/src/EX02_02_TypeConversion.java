

public class EX02_02_TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		double d = b + i;
		
		System.out.println(d);
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10/2.0);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9 + (int)1.8);
		
	}

}
