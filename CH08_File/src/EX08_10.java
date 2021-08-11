import java.io.*;

public class EX08_10 {

	public static void main(String[] args) {
		File src=new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("c:\\Temp\\copyimg.jsp");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ " is copied in " +dest.getPath());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("can not copy the file!!");
		}
	}

}
