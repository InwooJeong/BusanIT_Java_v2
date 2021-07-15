
public class EX02_06_BitShiftOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("------비트 연산--------");
		System.out.printf("%x\n", a & b);
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);
		System.out.println("------비트 연산 끝--------");
		
		byte c = 20; //0x14
		byte d = -8; //0xf8
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
		System.out.println("--------시프트 연산-------");
		System.out.println("c << 2 : " + (c<<2));
		System.out.println("c >> 2 : " + (c>>2));
		System.out.println("d >> 2 : " + (d>>2));
		System.out.printf("%x\n", d>>>2);
		System.out.println("--------시프트 연산 끝-------");
		
	}

}
