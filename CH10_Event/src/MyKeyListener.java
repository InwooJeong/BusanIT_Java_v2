import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter{
	
	public void keyPressed() {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		
		KeyListenerEx.keyMessage[0].setText(Integer.toString(keyCode));
		KeyListenerEx.keyMessage[1].setText(Character.toString(keyChar));
		KeyListenerEx.keyMessage[2].setText(e.getKeyText(keyCode));
		
	}

}
