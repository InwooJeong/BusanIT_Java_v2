import java.awt.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame {
	static JLabel la;
	static JPanel c = new JPanel();
	
	public KeyCodeEx() {
		setTitle("Key Code ���� : F1 : �ʷ�, % : ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c);
		la = new JLabel("F1�� �ʷ�, %�� ���");
		c.addKeyListener(new MyKeyListener2());
		c.add(la);

		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true); //Ű �Է��� �ޱ� ���� ��Ŀ��
		c.requestFocus(); 
	}

}
