import java.io.*;

public class EX08_09 {

	public static void main(String[] args) {
		File src=new File("c:\\windows\\system.ini");
		File dest=new File("c:\\Temp\\system.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c=fr.read())!=-1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "is copied in " +dest.getPath());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("can not copy the file!!");
		}
	}

}
