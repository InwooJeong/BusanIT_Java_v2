import java.io.*;

public class EX08_05 {

	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = 
					new FileOutputStream("c:\\Temp\\test.out");
			for(int i=0;i<b.length;i++) {
				fout.write(b[i]);
			}
			fout.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("check your path");
			return;
		}
		System.out.println("file saved");
	}

}
