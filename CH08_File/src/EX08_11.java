import java.io.*;

public class EX08_11 {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("c:\\Temp\\desert.jpg");
		try {
			FileInputStream fi=new FileInputStream(src);
			FileOutputStream fo=new FileOutputStream(dest);
			byte [] buf = new byte[1024*10];
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				if(n<buf.length){
					break;
				}
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "is copied in " + dest.getPath());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error!");
		}
	}

}
