import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener2 extends KeyAdapter{
	
	@Override
	public void keyPressed(KeyEvent e) {
		KeyCodeEx.la.setText(e.getKeyText(e.getKeyCode()));
		
		if(e.getKeyChar() == '%') {
			KeyCodeEx.c.setBackground(Color.YELLOW);
		}else if(e.getKeyCode() == KeyEvent.VK_F1) {
			KeyCodeEx.c.setBackground(Color.GREEN);
		}
		
	}

}
