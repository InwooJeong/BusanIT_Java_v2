import java.io.*;

public class EX08_06 {

	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n=0, c;
			while((c=fin.read())!=-1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("Array : ");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+ " ");
			}
			System.out.println();
			fin.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("check ur path");
		}
	}

}
