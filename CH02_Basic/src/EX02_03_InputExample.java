import java.io.*;

public class EX02_03_InputExample {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				int a = rd.read();
				if(a == -1) //ctrl-z�� �ԷµǸ� read()�� -1�� ����
					break;
				System.out.print((char)a); //�Էµ� ���� ���
			}
		}
		catch(IOException e) {
			System.out.println("�Է� ���� �߻�");
		}
	}

}
