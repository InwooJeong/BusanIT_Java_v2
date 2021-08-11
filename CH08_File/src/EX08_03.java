import java.io.FileInputStream;
import java.io.InputStreamReader;

public class EX08_03 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			
			System.out.println("Encoding : " +in.getEncoding());
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error!");
		}
	}

}