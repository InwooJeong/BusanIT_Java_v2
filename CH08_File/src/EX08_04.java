import java.io.*;
import java.util.*;

public class EX08_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\temp\\test.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) {
					break;
				}
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error!");
		}
		scanner.close();
	}

}
