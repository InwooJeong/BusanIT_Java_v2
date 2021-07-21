import javax.swing.*;
import java.awt.*;

public class KeyListenerEx extends JFrame {
	static JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
//		for(int i=0;i<keyMessage.length;i++) {
//			c.add(keyMessage[i]);
//			keyMessage[i].setOpaque(true); //컴포넌트 바탕색이 보이도록 하기 위해 컴포넌트가 불투명하게
//			keyMessage[i].setBackground(Color.yellow);
//		}
		
		for(JLabel la : keyMessage) {
			c.add(la);
			la.setOpaque(true);
			la.setBackground(Color.red);
		}

		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
}
