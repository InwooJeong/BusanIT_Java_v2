import java.awt.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame {
	static JLabel la;
	static JPanel c = new JPanel();
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1 : 초록, % : 노란");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c);
		la = new JLabel("F1은 초록, %는 노란");
		c.addKeyListener(new MyKeyListener2());
		c.add(la);

		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true); //키 입력을 받기 위해 포커스
		c.requestFocus(); 
	}

}
